package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassCMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassGMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassDMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassAMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassEMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassBMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassFSharpMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassCSharpMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassFMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassBFlatMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassEFlatMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassAFlatMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassDSharpMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassGSharpMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassASharpMinorScale;
import com.github.cythara.doubleBass.doubleBassMinorScales.DoubleBassChromaticScale;


public class DoubleBassMinorScalesMapper {
    private static final int A_MINOR_SCALE_POSITION = 0;
    private static final int E_MINOR_SCALE_POSITION = 1;
    private static final int B_MINOR_SCALE_POSITION = 2;
    private static final int F_SHARP_MINOR_SCALE_POSITION = 3;
    private static final int C_SHARP_MINOR_SCALE_POSITION = 4;
    private static final int G_SHARP_MINOR_SCALE_POSITION = 5;
    private static final int D_SHARP_MINOR_SCALE_POSITION = 6;
    private static final int A_SHARP_MINOR_SCALE_POSITION = 7;
    private static final int D_MINOR_SCALE_POSITION= 8;
    private static final int G_MINOR_SCALE_POSITION  = 9;
    private static final int C_MINOR_SCALE_POSITION = 10;
    private static final int F_MINOR_SCALE_POSITION = 11;
    private static final int B_FLAT_MINOR_SCALE_POSITION = 12;
    private static final int E_FLAT_MINOR_SCALE_POSITION = 13;
    private static final int A_FLAT_MINOR_SCALE_POSITION = 14;
    private static final int CHROMATIC_SCALE_POSITION = 15;

    public static TypeOfScalesOrArpeggios getScaleFromPosition(int position) {
        switch (position) {
            case A_MINOR_SCALE_POSITION:
                return new DoubleBassAMinorScale();
            case E_MINOR_SCALE_POSITION:
                return new DoubleBassEMinorScale();
            case B_MINOR_SCALE_POSITION:
                return new DoubleBassBMinorScale();
            case F_SHARP_MINOR_SCALE_POSITION:
                return new DoubleBassFSharpMinorScale();
            case C_SHARP_MINOR_SCALE_POSITION:
                return new DoubleBassCSharpMinorScale();
            case G_SHARP_MINOR_SCALE_POSITION:
                return new DoubleBassGSharpMinorScale();
            case D_SHARP_MINOR_SCALE_POSITION:
                return new DoubleBassDSharpMinorScale();
            case A_SHARP_MINOR_SCALE_POSITION:
                return new DoubleBassASharpMinorScale();
            case D_MINOR_SCALE_POSITION:
                return new DoubleBassDMinorScale();
            case G_MINOR_SCALE_POSITION:
                return new DoubleBassGMinorScale();
            case C_MINOR_SCALE_POSITION:
                return new DoubleBassCMinorScale();
            case F_MINOR_SCALE_POSITION:
                return new DoubleBassFMinorScale();
            case B_FLAT_MINOR_SCALE_POSITION:
                return new DoubleBassBFlatMinorScale();
            case E_FLAT_MINOR_SCALE_POSITION:
                return new DoubleBassEFlatMinorScale();
            case A_FLAT_MINOR_SCALE_POSITION:
                return new DoubleBassAFlatMinorScale();
            case CHROMATIC_SCALE_POSITION:
                return new DoubleBassChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new DoubleBassCMinorScale();
        }
    }
}