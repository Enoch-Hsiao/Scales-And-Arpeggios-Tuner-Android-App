package com.github.cythara.viola.violaMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaFMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        F3(F, 3, 174.61f),
        A3_FLAT(A, 3, "b", 207.65f),
        C4(C, 4, 261.63f),

        F4(F, 4, 349.23f),
        A4_FLAT(A, 4, "b", 415.30f),
        C5(C, 5, 523.25f),

        F5(F, 5, 698.46f),
        A5_FLAT(A, 5, "b", 830.61f),
        C6(C, 6, 1046.5f),

        F6(F, 6, 1396.9f);



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