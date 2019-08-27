package com.github.cythara.cello.celloMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloBFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

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
        D3(D, 3, 146.83f),
        F3(F, 3, 174.61f),

        B3_FLAT(B, 3, "b", 233.08f),
        D4(D, 4, 293.66f),
        F4(F, 4, 349.23f),

        B4_FLAT(B, 4, "b", 466.16f),
        D5(D, 5, 587.33f),
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