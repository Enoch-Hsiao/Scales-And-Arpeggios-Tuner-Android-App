package com.github.cythara.viola.violaMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaBFlatMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

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
        G5(G, 5, 783.99f),
        A5(A, 5, 880.00f),

        B5_FLAT(B, 5, "b", 932.33f),
        C6(C, 6, 1046.5f),
        D6(D, 6, 1174.7f),
        E6_FLAT(E, 6, "b", 1244.5f),
        F6(F, 6, 1396.9f),
        G6(G, 6, 1568.0f),
        A6(A, 6, 1760.0f),

        B6_FLAT(B, 6, "b", 1864.7f);

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