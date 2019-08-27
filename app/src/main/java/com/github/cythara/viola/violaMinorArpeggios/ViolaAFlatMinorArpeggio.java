package com.github.cythara.viola.violaMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;


public class ViolaAFlatMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        A3_FLAT(A, 3, "b", 207.65f),
        C4_FLAT(C, 4, "b", 246.94f),
        E4_FLAT(E, 4, "b", 311.13f),

        A4_FLAT(A, 4, "b", 415.30f),
        C5_FLAT(C, 5, "b", 493.88f),
        E5_FLAT(E, 5, "b", 622.25f),

        A5_FLAT(A, 5, "b", 830.61f),
        C6_FLAT(C, 6, "b", 987.77f),
        E6_FLAT(E, 6, "b", 1244.5f),

        A6_FLAT(G, 6, "b", 1661.2f);

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