package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassCMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassGMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassDMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassAMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassEMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassBMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassFSharpMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassCSharpMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassFMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassBFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassEFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassAFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassDFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassGFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassCFlatMajorScale;
import com.github.cythara.doubleBass.doubleBassMajorScales.DoubleBassChromaticScale;


public class DoubleBassMajorScalesMapper {
    private static final int C_MAJOR_SCALE_POSITION = 0;
    private static final int G_MAJOR_SCALE_POSITION = 1;
    private static final int D_MAJOR_SCALE_POSITION = 2;
    private static final int A_MAJOR_SCALE_POSITION = 3;
    private static final int E_MAJOR_SCALE_POSITION = 4;
    private static final int B_MAJOR_SCALE_POSITION = 5;
    private static final int F_SHARP_MAJOR_SCALE_POSITION = 6;
    private static final int C_SHARP_MAJOR_SCALE_POSITION = 7;
    private static final int F_MAJOR_SCALE_POSITION = 8;
    private static final int B_FLAT_MAJOR_SCALE_POSITION = 9;
    private static final int E_FLAT_MAJOR_SCALE_POSITION = 10;
    private static final int A_FLAT_MAJOR_SCALE_POSITION = 11;
    private static final int D_FLAT_MAJOR_SCALE_POSITION = 12;
    private static final int G_FLAT_MAJOR_SCALE_POSITION = 13;
    private static final int C_FLAT_MAJOR_SCALE_POSITION = 14;
    private static final int CHROMATIC_SCALE_POSITION = 15;

    public static TypeOfScalesOrArpeggios getScaleFromPosition(int position) {
        switch (position) {
            case C_MAJOR_SCALE_POSITION:
                return new DoubleBassCMajorScale();
            case G_MAJOR_SCALE_POSITION:
                return new DoubleBassGMajorScale();
            case D_MAJOR_SCALE_POSITION:
                return new DoubleBassDMajorScale();
            case A_MAJOR_SCALE_POSITION:
                return new DoubleBassAMajorScale();
            case E_MAJOR_SCALE_POSITION:
                return new DoubleBassEMajorScale();
            case B_MAJOR_SCALE_POSITION:
                return new DoubleBassBMajorScale();
            case F_SHARP_MAJOR_SCALE_POSITION:
                return new DoubleBassFSharpMajorScale();
            case C_SHARP_MAJOR_SCALE_POSITION:
                return new DoubleBassCSharpMajorScale();
            case F_MAJOR_SCALE_POSITION:
                return new DoubleBassFMajorScale();
            case B_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassBFlatMajorScale();
            case E_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassEFlatMajorScale();
            case A_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassAFlatMajorScale();
            case D_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassDFlatMajorScale();
            case G_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassGFlatMajorScale();
            case C_FLAT_MAJOR_SCALE_POSITION:
                return new DoubleBassCFlatMajorScale();
            case CHROMATIC_SCALE_POSITION:
                return new DoubleBassChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new DoubleBassCMajorScale();
        }
    }
}