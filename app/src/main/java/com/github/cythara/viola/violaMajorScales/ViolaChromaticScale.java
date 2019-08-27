package com.github.cythara.viola.violaMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaChromaticScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

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

        C5(C, 5, 523.25f),
        C5_SHARP(C, 5, "#", 554.37f),
        D5(D, 5, 587.33f),
        D5_SHARP(D, 5, "#", 622.25f),
        E5(E, 5, 659.26f),
        F5(F, 5, 698.46f),
        F5_SHARP(F, 5, "#", 739.99f),
        G5(G, 5, 783.99f),
        G5_SHARP(G, 5, "#", 830.61f),
        A5(A, 5, 880.00f),
        A5_SHARP(A, 5, "#", 932.33f),
        B5(B, 5, 987.77f),

        C6(C, 6, 1046.5f);

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
