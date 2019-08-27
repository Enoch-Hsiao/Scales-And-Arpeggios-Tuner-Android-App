package com.github.cythara.violin.violinMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinFSharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        F4_SHARP(F, 4, "#", 369.99f),
        A4_SHARP(A, 4, "#", 466.16f),
        C5_SHARP(C, 5, "#", 554.37f),

        F5_SHARP(F, 5, "#", 739.99f),
        A5_SHARP(A, 5, "#", 932.33f),
        C6_SHARP(C, 6, "#", 1108.7f),

        F6_SHARP(F, 6, "#", 1480.0f),
        A6_SHARP(A, 6, "#", 1864.7f),
        C7_SHARP(C, 7, "#", 2217.5f),

        F7_SHARP(F, 7, "#", 2960.0f);

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