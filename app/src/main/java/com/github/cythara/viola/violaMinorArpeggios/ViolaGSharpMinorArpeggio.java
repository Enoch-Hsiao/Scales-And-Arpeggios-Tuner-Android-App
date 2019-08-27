package com.github.cythara.viola.violaMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaGSharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        G3_SHARP(G, 3, "#", 207.65f),
        B3(B, 3, 246.94f),
        D4_SHARP(D, 4, "#", 311.13f),

        G4_SHARP(G, 4, "#", 415.30f),
        B4(B, 4, 493.88f),
        D5_SHARP(D, 5, "#", 622.25f),

        G5_SHARP(G, 5, "#", 830.61f),
        B5(B, 5, 987.77f),
        D6_SHARP(D, 6, "#", 1244.5f),

        G6_SHARP(G, 6, "#", 1661.2f);

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