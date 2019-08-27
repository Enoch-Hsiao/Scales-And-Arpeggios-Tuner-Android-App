package com.github.cythara.violin.violinMajorArpeggios;

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

public class ViolinBMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {


        B3(B, 3, 246.94f),
        D4_SHARP(D, 4, "#", 311.13f),
        F4_SHARP(F, 4, "#", 369.99f),

        B4(B, 4, 493.88f),
        D5_SHARP(D, 5, "#", 622.25f),
        F5_SHARP(F, 5, "#", 739.99f),

        B5(B, 5, 987.77f),
        D6_SHARP(D, 6, "#", 1244.5f),
        F6_SHARP(F, 6, "#", 1480.0f),

        B6(B, 6, 1975.5f);

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