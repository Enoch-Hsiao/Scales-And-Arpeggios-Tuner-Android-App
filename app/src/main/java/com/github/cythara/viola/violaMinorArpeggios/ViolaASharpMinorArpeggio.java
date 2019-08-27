package com.github.cythara.viola.violaMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaASharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        A3_SHARP(A, 3, "#", 233.08f),
        C4_SHARP(C, 4, "#", 277.18f),
        E4_SHARP(E, 4, "#", 349.23f),

        A4_SHARP(A, 4, "#", 466.16f),
        C5_SHARP(C, 5, "#", 554.37f),
        E5_SHARP(E, 5, "#", 698.23f),

        A5_SHARP(A, 5, "#", 932.33f),
        C6_SHARP(C, 6, "#", 1108.7f),
        E6_SHARP(E, 6, "#", 1396.9f),

        A6_SHARP(A, 6, "#", 1864.7f);

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