package com.github.cythara.doubleBass.doubleBassMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassASharpMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        A1_SHARP(A, 1, "#", 58.270f),
        B1_SHARP(B, 2, "#", 65.406f),
        C2_SHARP(C, 2, "#", 69.296f),
        D2_SHARP(D, 2, "#", 77.782f),
        E2_SHARP(E, 2, "#", 87.307f),
        F2_SHARP(F, 2, "#", 92.499f),
        G2_SHARP(G, 2, "#", 103.83f),

        A2_SHARP(A, 2, "#", 116.54f),
        B2_SHARP(B, 3, "#", 130.81f),
        C3_SHARP(C, 3, "#", 138.59f),
        D3_SHARP(D, 3, "#", 155.56f),
        E3_SHARP(E, 3, "#", 174.61f),
        F3_SHARP(F, 3, "#", 185.00f),
        G3_SHARP(G, 3, "#", 207.65f),

        A3_SHARP(A, 3, "#", 233.08f);

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