package com.github.cythara.violin.violinMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinFMajorScale implements TypeOfScalesOrArpeggios {

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
        A4(A, 4, 440.00f),
        B4_FLAT(B, 4, "b", 466.16f),
        C5(C, 5, 523.25f),
        D5(D, 5, 587.33f),
        E5(E, 5, 659.26f),

        F5(F, 5, 698.46f),
        G5(G, 5, 783.99f),
        A5(A, 5, 880.00f),
        B5_FLAT(B, 5, "b", 932.33f),
        C6(C, 6, 1046.5f),
        D6(D, 6, 1174.7f),
        E6(E, 6, 1318.5f),

        F6(F, 6, 1396.9f),
        G6(G, 6, 1568.0f),
        A6(A, 6, 1760.0f),
        B6_FLAT(B, 6, "b", 1864.7f),
        C7(C, 7, 2093.0f),
        D7(D, 7, 2349.3f),
        E7(E, 7, 2637.0f),

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