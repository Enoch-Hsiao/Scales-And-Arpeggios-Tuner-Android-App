package com.github.cythara.violin.violinMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinCSharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C4_SHARP(C, 4, "#", 277.18f),
        E4(E, 4, 329.63f),
        G4_SHARP(G, 4, "#", 415.30f),

        C5_SHARP(C, 5, "#", 554.37f),
        E5(E, 5, 659.26f),
        G5_SHARP(G, 5, "#", 830.61f),

        C6_SHARP(C, 6, "#", 1108.7f),
        E6(E, 6, 1318.5f),
        G6_SHARP(G, 6, "#", 1661.2f),

        C7_SHARP(C, 7, "#", 2217.5f);

        private final String sign;
        private final int octave;
        private final float frequency;
        private NoteName name;

        Pitch(NoteName name, int octave, String sign, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = sign;
            this.frequency = frequency;
        }

        Pitch(NoteName name, int octave, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = "";
            this.frequency = frequency;
        }

        public NoteName getName() {
            return name;
        }

        public float getFrequency() {
            return frequency;
        }

        @Override
        public int getOctave() {
            return octave;
        }

        @Override
        public String getSign() {
            return sign;
        }
    }
}