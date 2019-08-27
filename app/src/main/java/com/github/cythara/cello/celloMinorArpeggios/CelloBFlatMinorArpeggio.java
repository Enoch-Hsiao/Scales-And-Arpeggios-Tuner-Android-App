package com.github.cythara.cello.celloMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloBFlatMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        B2_FLAT(B, 2, "b", 116.54f),
        D3_FLAT(D, 3, "b", 138.59f),
        F3(F, 3, 174.61f),

        B3_FLAT(B, 3, "b", 233.08f),
        D4_FLAT(D, 4, "b", 277.18f),
        F4(F, 4, 349.23f),

        B4_FLAT(B, 4, "b", 466.16f),
        D5_FLAT(D, 5, "b", 554.37f),
        F5(F, 5, 698.46f),

        B5_FLAT(B, 5, "b", 932.33f);

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