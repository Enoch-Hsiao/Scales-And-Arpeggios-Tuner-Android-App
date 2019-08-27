package com.github.cythara.cello.celloMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloChromaticScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C2(C, 2, 65.406f),
        C2_SHARP(C, 2, "#", 69.296f),
        D2(D, 2, 73.416f),
        D2_SHARP(D, 2, "#", 77.782f),
        E2(E, 2, 82.407f),
        F2(F, 2, 87.307f),
        F2_SHARP(F, 2, "#", 92.499f),
        G2(G, 2, 97.999f),
        G2_SHARP(G, 2, "#", 103.83f),
        A2(A, 2, 110.00f),
        A2_SHARP(A, 2, "#", 116.54f),
        B2(B, 2, 123.47f),

        C3(C, 3, 130.81f),
        C3_SHARP(C, 3, "#", 138.59f),
        D3(D, 3, 146.83f),
        D3_SHARP(D, 3, "#", 155.56f),
        E3(E, 3, 164.81f),
        F3(F, 3, 174.61f),
        F3_SHARP(F, 3, "#", 185.00f),
        G3(G, 3, 196.00f),
        G3_SHARP(G, 3, "#", 207.65f),
        A3(A, 3, 220.00f),
        A3_SHARP(A, 3, "#", 233.08f),
        B3(B, 3, 246.94f),

        C4(C, 4, 261.63f),
        C4_SHARP(C, 4, "#", 277.18f),
        D4(D, 4, 293.66f),
        D4_SHARP(D, 4, "#", 311.13f),
        E4(E, 4, 329.63f),
        F4(F, 4, 349.23f),
        F4_SHARP(F, 4, "#", 369.99f),
        G4(G, 4, 392.00f),
        G4_SHARP(G, 4, "#", 415.30f),
        A4(A, 4, 440.00f),
        A4_SHARP(A, 4, "#", 466.16f),
        B4(B, 4, 493.88f),

        C5(C, 5, 523.25f);

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
