package com.github.cythara.viola.violaMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolaDSharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        D3_SHARP(D, 3, "#", 155.56f),
        F3_SHARP(F, 3, "#", 185.00f),
        A3_SHARP(A, 3, "#", 233.08f),

        D4_SHARP(D, 4, "#", 311.13f),
        F4_SHARP(F, 4, "#", 369.99f),
        A4_SHARP(A, 4, "#", 466.16f),

        D5_SHARP(D, 5, "#", 622.25f),
        F5_SHARP(F, 5, "#", 739.99f),
        A5_SHARP(A, 5, "#", 932.33f),

        D6_SHARP(D, 6, "#", 1244.5f);



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