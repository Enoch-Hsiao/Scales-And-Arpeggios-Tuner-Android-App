package com.github.cythara.cello.celloMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloGFlatMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        G2_FLAT(G, 2, "b", 92.499f),
        A2_FLAT(A, 2, "b", 103.83f),
        B2_FLAT(B, 2, "b", 116.54f),
        C3_FLAT(C, 3,"b",  123.47f),
        D3_FLAT(D, 3, "b", 138.59f),
        E3_FLAT(E, 3, "b", 155.56f),
        F3(F, 3, 174.61f),
        
        G3_FLAT(G, 3, "b", 185.00f),
        A3_FLAT(A, 3, "b", 207.65f),
        B3_FLAT(B, 3, "b", 233.08f),
        C4_FLAT(C, 4, 246.94f),
        D4_FLAT(D, 4, "b", 277.18f),
        E4_FLAT(E, 4, "b", 311.13f),
        F4(F, 4, 349.23f),

        G4_FLAT(G, 4, "b", 369.99f),
        A4_FLAT(A, 4, "b", 415.30f),
        B4_FLAT(B, 4, "b", 466.16f),
        C5_FLAT(C, 5, "b",493.88f),
        D5_FLAT(D, 5, "b", 554.37f),
        E5_FLAT(E, 5, "b", 622.25f),
        F5(F, 5, 698.46f),

        G5_FLAT(G, 5, "b", 739.99f);

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