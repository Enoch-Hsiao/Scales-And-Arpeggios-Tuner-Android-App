package com.github.cythara.violin.violinMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;


public class ViolinCMajorArpeggio implements TypeOfScalesOrArpeggios{

    public Note[] getNotes() {
        return Pitch.values();
    }


    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C4(C, 4, 261.63f),
        E4(E, 4, 329.63f),
        G4(G, 4, 392.00f),

        C5(C, 5, 523.25f),
        E5(E, 5, 659.26f),
        G5(G, 5, 783.99f),

        C6(C, 6, 1046.5f),
        E6(E, 6, 1318.5f),
        G6(G, 6, 1568.0f),

        C7(C, 7, 2093.0f);


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
