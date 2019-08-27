package com.github.cythara.doubleBass.doubleBassMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.A;
import static com.github.cythara.NoteName.B;
import static com.github.cythara.NoteName.C;
import static com.github.cythara.NoteName.D;
import static com.github.cythara.NoteName.E;
import static com.github.cythara.NoteName.F;
import static com.github.cythara.NoteName.G;

public class DoubleBassASharpMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        A1_SHARP(A, 1, "#", 58.270f),
        C2_SHARP(C, 2, "#", 69.296f),
        E2_SHARP(E, 2, "#", 87.307f),

        A2_SHARP(A, 2, "#", 116.54f),
        C3_SHARP(C, 3, "#", 138.59f),
        E3_SHARP(E, 3, "#", 174.61f),

        A3_SHARP(A, 3, "#", 233.08f);

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