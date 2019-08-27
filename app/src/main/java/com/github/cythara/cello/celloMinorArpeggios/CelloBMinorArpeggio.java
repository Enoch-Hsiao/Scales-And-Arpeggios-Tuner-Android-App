package com.github.cythara.cello.celloMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloBMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        B2(B, 2, 123.47f),
        D3(D, 3, 146.83f),
        F3_SHARP(F, 3, "#", 185.00f),

        B3(B, 3, 246.94f),
        D4(D, 4, 293.66f),
        F4_SHARP(F, 4, "#", 369.99f),

        B4(B, 4, 493.88f),
        D5(D, 5, 587.33f),
        F5_SHARP(F, 5, "#", 739.99f),

        B5(B, 5, 987.77f);

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