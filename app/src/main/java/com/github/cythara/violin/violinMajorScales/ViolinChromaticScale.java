package com.github.cythara.violin.violinMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinChromaticScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

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

        C6(C, 6, 1046.5f),
        C6_SHARP(C, 6, "#", 1108.7f),
        D6(D, 6, 1174.7f),
        D6_SHARP(D, 6, "#", 1244.5f),
        E6(E, 6, 1318.5f),
        F6(F, 6, 1396.9f),
        F6_SHARP(F, 6, "#", 1480.0f),
        G6(G, 6, 1568.0f),
        G6_SHARP(G, 6, "#", 1661.2f),
        A6(A, 6, 1760.0f),
        A6_SHARP(A, 6, "#", 1864.7f),
        B6(B, 6, 1975.5f),

        C7(C, 7, 2093.0f);

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
