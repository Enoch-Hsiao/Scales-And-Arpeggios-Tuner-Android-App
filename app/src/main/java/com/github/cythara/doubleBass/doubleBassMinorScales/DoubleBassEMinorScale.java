package com.github.cythara.doubleBass.doubleBassMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassEMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        E1(E, 1, 41.203f),
        F1_SHARP(F, 1, "#", 46.249f),
        G1(G, 1, 48.999f),
        A1(A, 1, 55.000f),
        B1(B, 1, 61.735f),
        C2_SHARP(C, 2, "#", 69.296f),
        D2_SHARP(D, 2, "#", 77.782f),

        E2(E, 2, 82.407f),
        F2_SHARP(F, 2, "#", 92.499f),
        G2(G, 2, 97.999f),
        A2(A, 2, 110.00f),
        B2(B, 2, 123.47f),
        C3_SHARP(C, 3, "#", 138.59f),
        D3_SHARP(D, 3, "#", 155.56f),

        E3(E, 3, 164.81f);

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
