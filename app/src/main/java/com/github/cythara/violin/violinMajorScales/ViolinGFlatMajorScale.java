package com.github.cythara.violin.violinMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinGFlatMajorScale implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        G4_FLAT(G, 4, "b", 369.99f),
        A4_FLAT(A, 4, "b", 415.30f),
        B4_FLAT(B, 4, "b", 466.16f),
        C5_FLAT(C, 5, "b",493.88f),
        D5_FLAT(D, 5, "b", 554.37f),
        E5_FLAT(E, 5, "b", 622.25f),
        F5(F, 5, 698.46f),

        G5_FLAT(G, 5, "b", 739.99f),
        A5_FLAT(A, 5, "b", 830.61f),
        B5_FLAT(B, 5, "b", 932.33f),
        C6_FLAT(C, 6, 987.77f),
        D6_FLAT(D, 6, "b", 1108.7f),
        E6_FLAT(E, 6, "b", 1244.5f),
        F6(F, 6, 1396.9f),

        G6_FLAT(G, 6, "b", 1480.0f),
        A6_FLAT(A, 6, "b", 1661.2f),
        B6_FLAT(B, 6, "b", 1864.7f),
        C7_FLAT(C, 7, 1975.5f),
        D7_FLAT(D, 7, "b", 2217.5f),
        E7_FLAT(E, 7, "b", 2489.0f),
        F7(F, 7, "b",2793.8f),

        G7_FLAT(G, 7, "b", 2960.0f);

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