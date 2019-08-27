package com.github.cythara.cello.celloMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloFSharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        F2_SHARP(F, 2, "#", 92.499f),
        A2_SHARP(A, 2, "#", 116.54f),
        C3_SHARP(C, 3, "#", 138.59f),

        F3_SHARP(F, 3, "#", 185.00f),
        A3_SHARP(A, 3, "#", 233.08f),
        C4_SHARP(C, 4, "#", 277.18f),

        F4_SHARP(F, 4, "#", 369.99f),
        A4_SHARP(A, 4, "#", 466.16f),
        C5_SHARP(C, 5, "#", 554.37f),

        F5_SHARP(F, 5, "#", 739.99f);

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