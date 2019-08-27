package com.github.cythara.cello.celloMinorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloEFlatMinorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        E2_FLAT(E, 2, "b", 77.782f),
        G2_FLAT(F, 2, "b", 92.499f),
        B2_FLAT(A, 2, "b", 116.54f),

        E3_FLAT(E, 3, "b", 155.56f),
        G3_FLAT(G, 3, "b", 185.00f),
        B3_FLAT(A, 3, "b", 233.08f),

        E4_FLAT(E, 4, "b", 311.13f),
        G4_FLAT(G, 4, "b", 369.99f),
        B4_FLAT(B, 4, "b", 466.16f),

        E5_FLAT(E, 5, "b", 622.25f);

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