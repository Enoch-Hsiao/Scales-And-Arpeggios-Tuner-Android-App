package com.github.cythara.cello.celloMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloDFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        D2_FLAT(D, 2, "b", 69.296f),
        F2(F, 2, 87.307f),
        A2_FLAT(A, 2, "b", 103.83f),

        D3_FLAT(D, 3, "b", 138.59f),
        F3(F, 3, 174.61f),
        A3_FLAT(A, 3, "b", 207.65f),

        D4_FLAT(D, 4, "b", 277.18f),
        F4(F, 4, 349.23f),
        A4_FLAT(A, 4, "b", 415.30f),

        D5_FLAT(D, 5, "b", 554.37f);




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