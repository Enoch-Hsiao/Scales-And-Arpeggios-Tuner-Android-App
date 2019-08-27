package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassCMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassGMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassDMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassAMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassEMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassBMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassFSharpMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassCSharpMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassFMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassBFlatMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassEFlatMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassAFlatMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassDFlatMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassGFlatMajorArpeggio;
import com.github.cythara.doubleBass.doubleBassMajorArpeggios.DoubleBassCFlatMajorArpeggio;


public class DoubleBassMajorArpeggiosMapper {
    private static final int C_MAJOR_ARPEGGIO_POSITION = 0;
    private static final int G_MAJOR_ARPEGGIO_POSITION = 1;
    private static final int D_MAJOR_ARPEGGIO_POSITION = 2;
    private static final int A_MAJOR_ARPEGGIO_POSITION = 3;
    private static final int E_MAJOR_ARPEGGIO_POSITION = 4;
    private static final int B_MAJOR_ARPEGGIO_POSITION = 5;
    private static final int F_SHARP_MAJOR_ARPEGGIO_POSITION = 6;
    private static final int C_SHARP_MAJOR_ARPEGGIO_POSITION = 7;
    private static final int F_MAJOR_ARPEGGIO_POSITION = 8;
    private static final int B_FLAT_MAJOR_ARPEGGIO_POSITION = 9;
    private static final int E_FLAT_MAJOR_ARPEGGIO_POSITION = 10;
    private static final int A_FLAT_MAJOR_ARPEGGIO_POSITION = 11;
    private static final int D_FLAT_MAJOR_ARPEGGIO_POSITION = 12;
    private static final int G_FLAT_MAJOR_ARPEGGIO_POSITION = 13;
    private static final int C_FLAT_MAJOR_ARPEGGIO_POSITION = 14;

    public static TypeOfScalesOrArpeggios getArpeggioFromPosition(int position) {
        switch (position) {
            case C_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassCMajorArpeggio();
            case G_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassGMajorArpeggio();
            case D_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassDMajorArpeggio();
            case A_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassAMajorArpeggio();
            case E_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassEMajorArpeggio();
            case B_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassBMajorArpeggio();
            case F_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassFSharpMajorArpeggio();
            case C_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassCSharpMajorArpeggio();
            case F_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassFMajorArpeggio();
            case B_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassBFlatMajorArpeggio();
            case E_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassEFlatMajorArpeggio();
            case A_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassAFlatMajorArpeggio();
            case D_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassDFlatMajorArpeggio();
            case G_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassGFlatMajorArpeggio();
            case C_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new DoubleBassCFlatMajorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new DoubleBassCMajorArpeggio();
        }
    }
}
