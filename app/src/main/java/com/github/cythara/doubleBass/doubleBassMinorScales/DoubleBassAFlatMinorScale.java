package com.github.cythara.doubleBass.doubleBassMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassAFlatMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        A1_FLAT(G, 1, "b", 51.913f),
        B1_FLAT(A, 1, "b", 58.270f),
        C2_FLAT(C, 2, "b", 61.735f),
        D2_FLAT(C, 2, "b", 69.296f),
        E2_FLAT(D, 2, "b", 77.782f),
        F2_FLAT(F, 2,"b",  82.407f),
        G2_FLAT(F, 2, "b", 92.499f),
        
        A2_FLAT(A, 2, "b", 103.83f),
        B2_FLAT(B, 2, "b", 116.54f),
        C3_FLAT(C, 3, "b", 123.47f),
        D3_FLAT(D, 3, "b", 138.59f),
        E3_FLAT(E, 3, "b", 155.56f),
        F3_FLAT(F, 3, "b", 164.81f),
        G3_FLAT(F, 3, "b", 185.00f),

        A3_FLAT(A, 3, "b", 207.65f);

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