package com.github.cythara.viola.violaMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaCSharpMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C3_SHARP(C, 3, "#", 138.59f),
        E3_SHARP(F, 3, "#", 164.81f),
        G3_SHARP(G, 3, "#", 207.65f),

        C4_SHARP(C, 4, "#", 277.18f),
        E4_SHARP(E, 4, "#", 349.23f),
        G4_SHARP(G, 4, "#", 415.30f),

        C5_SHARP(C, 5, "#", 554.37f),
        E5_SHARP(E, 5, "#", 698.23f),
        G5_SHARP(G, 5, "#", 830.61f),

        C6_SHARP(C, 6, "#", 1108.7f);

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