package com.github.cythara.viola.violaMajorScales;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;


public class ViolaCMajorScale implements TypeOfScalesOrArpeggios{

    public Note[] getNotes() {
        return Pitch.values();
    }


    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C3(C, 3, 130.81f),
        D3(D, 3, 146.83f),
        E3(E, 3, 164.81f),
        F3(F, 3, 174.61f),
        G3(G, 3, 196.00f),
        A3(A, 3, 220.00f),
        B3(B, 3, 246.94f),

        C4(C, 4, 261.63f),
        D4(D, 4, 293.66f),
        E4(E, 4, 329.63f),
        F4(F, 4, 349.23f),
        G4(G, 4, 392.00f),
        A4(A, 4, 440.00f),
        B4(B, 4, 493.88f),

        C5(C, 5, 523.25f),
        D5(D, 5, 587.33f),
        E5(E, 5, 659.26f),
        F5(F, 5, 698.46f),
        G5(G, 5, 783.99f),
        A5(A, 5, 880.00f),
        B5(B, 5, 987.77f),

        C6(C, 6, 1046.5f);


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
