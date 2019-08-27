package com.github.cythara.violin.violinMinorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.A;
import static com.github.cythara.NoteName.B;
import static com.github.cythara.NoteName.C;
import static com.github.cythara.NoteName.D;
import static com.github.cythara.NoteName.E;
import static com.github.cythara.NoteName.F;
import static com.github.cythara.NoteName.G;

public class ViolinFMinorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        F4(F, 4, 349.23f),
        G4(G, 4, 392.00f),
        A4_FLAT(A, 4, "b", 415.30f),
        B4_FLAT(B, 4, "b", 466.16f),
        C5(C, 5, 523.25f),
        D5_FLAT(D, 5, "b", 554.37f),
        E5_FLAT(E, 5, "b", 622.25f),

        F5(F, 5, 698.46f),
        G5(G, 5, 783.99f),
        A5_FLAT(A, 5, "b", 830.61f),
        B5_FLAT(B, 5, "b", 932.33f),
        C6(C, 6, 1046.5f),
        D6_FLAT(D, 6, "b", 1108.7f),
        E6_FLAT(E, 6, "b", 1244.5f),

        F6(F, 6, 1396.9f),
        G6(G, 6, 1568.0f),
        A6_FLAT(A, 6, "b", 1661.2f),
        B6_FLAT(B, 6, "b", 1864.7f),
        C7(C, 7, 2093.0f),
        D7_FLAT(D, 7, "b", 2217.5f),
        E7_FLAT(E, 7, "b", 2489.0f),

        F7(F, 7, 2793.8f);

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