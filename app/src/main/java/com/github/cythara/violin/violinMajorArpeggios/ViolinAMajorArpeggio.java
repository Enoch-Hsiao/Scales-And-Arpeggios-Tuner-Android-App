package com.github.cythara.violin.violinMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinAMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {


        A3(A, 3, 220.00f),
        C4_SHARP(C, 4, "#", 277.18f),
        E4(E, 4, 329.63f),

        A4(A, 4, 440.00f),
        C5_SHARP(C, 5, "#", 554.37f),
        E5(E, 5, 659.26f),

        A5(A, 5, 880.00f),
        C6_SHARP(C, 6, "#", 1108.7f),
        E6(E, 6, 1318.5f),

        A6(A, 6, 1760.0f);

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