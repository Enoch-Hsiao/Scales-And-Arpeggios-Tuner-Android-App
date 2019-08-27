package com.github.cythara.doubleBass.doubleBassMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassDFlatMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        D2_FLAT(D, 2, "b", 69.296f),
        E2_FLAT(E, 2, "b", 77.782f),
        F2(F, 2, 87.307f),
        G2_FLAT(G, 2, "b", 92.499f),
        A2_FLAT(A, 2, "b", 103.83f),
        B2_FLAT(B, 2, "b", 116.54f),
        C3(C, 3, 130.81f),

        D3_FLAT(D, 3, "b", 138.59f),
        E3_FLAT(E, 3, "b", 155.56f),
        F3(F, 3, 174.61f),
        G3_FLAT(G, 3, "b", 185.00f),
        A3_FLAT(A, 3, "b", 207.65f),
        B3_FLAT(B, 3, "b", 233.08f),
        C4(C, 4, 261.63f),

        D4_FLAT(D, 4, "b", 277.18f);



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