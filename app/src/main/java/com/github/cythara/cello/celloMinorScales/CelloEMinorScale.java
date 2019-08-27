package com.github.cythara.cello.celloMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloEMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        E2(E, 2, 82.407f),
        F2_SHARP(F, 2, "#", 92.499f),
        G2(G, 2, 97.999f),
        A2(A, 2, 110.00f),
        B2(B, 2, 123.47f),
        C3_SHARP(C, 3, "#", 138.59f),
        D3_SHARP(D, 3, "#", 155.56f),

        E3(E, 3, 164.81f),
        F3_SHARP(F, 3, "#", 185.00f),
        G3(G, 3, 196.00f),
        A3(A, 3, 220.00f),
        B3(B, 3, 246.94f),
        C4_SHARP(C, 4, "#", 277.18f),
        D4_SHARP(D, 4, "#", 311.13f),

        E4(E, 4, 329.63f),
        F4_SHARP(F, 4, "#", 369.99f),
        G4(G, 4, 392.00f),
        A4(A, 4, 440.00f),
        B4(B, 4, 493.88f),
        C5(C, 5, 523.25f),
        D5(D, 5, 587.33f),

        E5(E, 5, 659.26f);

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
