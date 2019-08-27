package com.github.cythara.doubleBass.doubleBassMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassGMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        G1(G, 1, 48.999f),
        A1(A, 1, 55.000f),
        B1(B, 1, 61.735f),
        C2(C, 2, 65.406f),
        D2(D, 2, 73.416f),
        E2(E, 2, 82.407f),
        F2_SHARP(F, 2, "#", 92.499f),

        G2(G, 2, 97.999f),
        A2(A, 2, 110.00f),
        B2(B, 2, 123.47f),
        C3(C, 3, 130.81f),
        D3(D, 3, 146.83f),
        E3(E, 3, 164.81f),
        F3_SHARP(F, 3, "#", 185.00f),

        G3(G, 3, 196.00f);

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