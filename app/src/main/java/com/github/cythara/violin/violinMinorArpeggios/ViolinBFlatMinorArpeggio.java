package com.github.cythara.violin.violinMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinBFlatMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        B3_FLAT(B, 3, "b", 233.08f),
        D4_FLAT(D, 4, "b", 277.18f),
        F4(F, 4, 349.23f),

        B4_FLAT(B, 4, "b", 466.16f),
        D5_FLAT(D, 5, "b", 554.37f),
        F5(F, 5, 698.46f),

        B5_FLAT(B, 5, "b", 932.33f),
        D6_FLAT(D, 6, "b", 1108.7f),
        F6(F, 6, 1396.9f),

        B6_FLAT(B, 6, "b", 1864.7f);

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