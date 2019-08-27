package com.github.cythara.doubleBass.doubleBassMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class DoubleBassCFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C2_FLAT(C, 2, "b", 61.735f),
        E2_FLAT(E, 2, "b", 77.782f),
        G2_FLAT(G, 2, "b", 92.499f),

        C3_FLAT(C, 3, "b", 123.47f),
        E3_FLAT(D, 3, "b", 155.56f),
        G3_FLAT(G, 3, "b", 185.00f),

        C4_FLAT(C, 4, "b",246.94f);

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