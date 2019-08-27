package com.github.cythara.cello.celloMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class CelloCMajorArpeggio implements TypeOfScalesOrArpeggios{

    public Note[] getNotes() {
        return Pitch.values();
    }


    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C2(C, 2, 65.406f),
        E2(E, 2, 82.407f),
        G2(G, 2, 97.999f),

        C3(C, 3, 130.81f),
        E3(E, 3, 164.81f),
        G3(G, 3, 196.00f),

        C4(C, 4, 261.63f),
        E4(E, 4, 329.63f),
        G4(G, 4, 392.00f),

        C5(C, 5, 523.25f);



        private final String sign;
        private final int octave;
        private final float frequency;
        private NoteName name;

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
