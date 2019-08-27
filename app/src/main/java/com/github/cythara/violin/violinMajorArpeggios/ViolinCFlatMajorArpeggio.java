package com.github.cythara.violin.violinMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinCFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {
        
        C4_FLAT(C, 4, "b",246.94f),
        E4_FLAT(E, 4, "b", 311.13f),
        G4_FLAT(G, 4, "b", 369.99f),

        C5_FLAT(C, 5, "b",493.88f),
        E5_FLAT(E, 5, "b", 622.25f),
        G5_FLAT(G, 5, "b", 739.99f),

        C6_FLAT(C, 6, "b", 987.77f),
        E6_FLAT(D, 6, "b", 1244.5f),
        G6_FLAT(F, 6, "b", 1480.0f),

        C7_FLAT(B, 7, 1975.5f);

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