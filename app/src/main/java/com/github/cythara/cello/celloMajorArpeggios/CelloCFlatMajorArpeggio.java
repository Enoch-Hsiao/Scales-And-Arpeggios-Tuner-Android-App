package com.github.cythara.cello.celloMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloCFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C3_FLAT(C, 3, "b", 123.47f),
        E3_FLAT(D, 3, "b", 155.56f),
        G3_FLAT(G, 3, "b", 185.00f),

        C4_FLAT(C, 4, "b",246.94f),
        E4_FLAT(E, 4, "b", 311.13f),
        G4_FLAT(G, 4, "b", 369.99f),

        C5_FLAT(C, 5, "b",493.88f),
        E5_FLAT(E, 5, "b", 622.25f),
        G5_FLAT(G, 5, "b", 739.99f),

        C6_FLAT(C, 6, "b", 987.77f);

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