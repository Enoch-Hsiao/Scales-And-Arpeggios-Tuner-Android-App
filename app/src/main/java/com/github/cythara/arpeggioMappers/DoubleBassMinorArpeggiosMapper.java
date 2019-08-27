package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassCMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassGMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassDMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassAMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassEMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassBMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassFSharpMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassCSharpMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassFMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassBFlatMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassEFlatMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassAFlatMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassDSharpMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassGSharpMinorArpeggio;
import com.github.cythara.doubleBass.doubleBassMinorArpeggios.DoubleBassASharpMinorArpeggio;


public class DoubleBassMinorArpeggiosMapper {
    private static final int A_MINOR_ARPEGGIO_POSITION = 0;
    private static final int E_MINOR_ARPEGGIO_POSITION = 1;
    private static final int B_MINOR_ARPEGGIO_POSITION = 2;
    private static final int F_SHARP_MINOR_ARPEGGIO_POSITION = 3;
    private static final int C_SHARP_MINOR_ARPEGGIO_POSITION = 4;
    private static final int G_SHARP_MINOR_ARPEGGIO_POSITION = 5;
    private static final int D_SHARP_MINOR_ARPEGGIO_POSITION = 6;
    private static final int A_SHARP_MINOR_ARPEGGIO_POSITION = 7;
    private static final int D_MINOR_ARPEGGIO_POSITION= 8;
    private static final int G_MINOR_ARPEGGIO_POSITION  = 9;
    private static final int C_MINOR_ARPEGGIO_POSITION = 10;
    private static final int F_MINOR_ARPEGGIO_POSITION = 11;
    private static final int B_FLAT_MINOR_ARPEGGIO_POSITION = 12;
    private static final int E_FLAT_MINOR_ARPEGGIO_POSITION = 13;
    private static final int A_FLAT_MINOR_ARPEGGIO_POSITION = 14;

    public static TypeOfScalesOrArpeggios getArpeggioFromPosition(int position) {
        switch (position) {
            case A_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassAMinorArpeggio();
            case E_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassEMinorArpeggio();
            case B_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassBMinorArpeggio();
            case F_SHARP_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassFSharpMinorArpeggio();
            case C_SHARP_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassCSharpMinorArpeggio();
            case G_SHARP_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassGSharpMinorArpeggio();
            case D_SHARP_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassDSharpMinorArpeggio();
            case A_SHARP_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassASharpMinorArpeggio();
            case D_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassDMinorArpeggio();
            case G_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassGMinorArpeggio();
            case C_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassCMinorArpeggio();
            case F_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassFMinorArpeggio();
            case B_FLAT_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassBFlatMinorArpeggio();
            case E_FLAT_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassEFlatMinorArpeggio();
            case A_FLAT_MINOR_ARPEGGIO_POSITION:
                return new DoubleBassAFlatMinorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new DoubleBassCMinorArpeggio();
        }
    }
}
