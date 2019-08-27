package com.github.cythara.viola.violaMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaFSharpMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        F3_SHARP(F, 3, "#", 185.00f),
        G3_SHARP(G, 3, "#", 207.65f),
        A3_SHARP(A, 3, "#", 233.08f),
        B3(B, 3, 246.94f),
        C4_SHARP(C, 4, "#", 277.18f),
        D4_SHARP(D, 4, "#", 311.13f),
        E4_SHARP(E, 4, 349.23f),

        F4_SHARP(F, 4, "#", 369.99f),
        G4_SHARP(G, 4, "#", 415.30f),
        A4_SHARP(A, 4, "#", 466.16f),
        B4(B, 4, 493.88f),
        C5_SHARP(C, 5, "#", 554.37f),
        D5_SHARP(D, 5, "#", 622.25f),
        E5_SHARP(E, 5, "#", 698.46f),

        F5_SHARP(F, 5, "#", 739.99f),
        G5_SHARP(G, 5, "#", 830.61f),
        A5_SHARP(A, 5, "#", 932.33f),
        B5(B, 5, 987.77f),
        C6_SHARP(C, 6, "#", 1108.7f),
        D6_SHARP(D, 6, "#", 1244.5f),
        E6_SHARP(E, 5, "#", 1396.9f),

        F6_SHARP(F, 6, "#", 1480.0f);

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