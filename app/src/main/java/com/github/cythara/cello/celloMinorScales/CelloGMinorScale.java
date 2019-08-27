package com.github.cythara.cello.celloMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloGMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        G2(G, 2, 97.999f),
        A2(A, 2, 110.00f),
        B2_FLAT(B, 2, "b", 116.54f),
        C3(C, 3, 130.81f),
        D3(D, 3, 146.83f),
        E3_FLAT(E, 3, "b", 155.56f),
        F3(F, 3, 174.61f),

        G3(G, 3, 196.00f),
        A3(A, 3, 220.00f),
        B3_FLAT(B, 3, "b", 233.08f),
        C4(C, 4, 261.63f),
        D4(D, 4, 293.66f),
        E4_FLAT(E, 4, "b", 311.13f),
        F4(F, 4, 349.23f),

        G4(G, 4, 392.00f),
        A4(A, 4, 440.00f),
        B4_FLAT(B, 4, "b", 466.16f),
        C5(C, 5, 523.25f),
        D5(D, 5, 587.33f),
        E5_FLAT(E, 5, "b", 622.25f),
        F5(F, 5, 698.46f),

        G5(G, 5, 783.99f);

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