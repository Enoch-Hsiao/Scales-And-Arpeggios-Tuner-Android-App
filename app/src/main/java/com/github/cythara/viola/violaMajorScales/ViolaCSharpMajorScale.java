package com.github.cythara.viola.violaMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaCSharpMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C3_SHARP(C, 3, "#", 138.59f),
        D3_SHARP(D, 3, "#", 155.56f),
        E3_SHARP(F, 3, "#", 164.81f),
        F3_SHARP(F, 3, "#", 185.00f),
        G3_SHARP(G, 3, "#", 207.65f),
        A3_SHARP(A, 3, "#", 233.08f),
        B3_SHARP(B, 3, "b",261.63f),

        C4_SHARP(C, 4, "#", 277.18f),
        D4_SHARP(D, 4, "#", 311.13f),
        E4_SHARP(E, 4, "#", 349.23f),
        F4_SHARP(F, 4, "#", 369.99f),
        G4_SHARP(G, 4, "#", 415.30f),
        A4_SHARP(A, 4, "#", 466.16f),
        B4_SHARP(B, 4, "#", 523.25f),

        C5_SHARP(C, 5, "#", 554.37f),
        D5_SHARP(D, 5, "#", 622.25f),
        E5_SHARP(E, 5, "#", 698.23f),
        F5_SHARP(F, 5, "#", 739.99f),
        G5_SHARP(G, 5, "#", 830.61f),
        A5_SHARP(A, 5, "#", 932.33f),
        B5_SHARP(B, 5, "#", 1046.5f),

        C6_SHARP(C, 6, "#", 1108.7f);

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