package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.viola.violaMajorScales.ViolaCMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaGMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaDMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaAMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaEMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaBMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaFSharpMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaCSharpMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaFMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaBFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaEFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaAFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaDFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaGFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaCFlatMajorScale;
import com.github.cythara.viola.violaMajorScales.ViolaChromaticScale;


public class ViolaMajorScalesMapper {
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
                return new ViolaCMajorScale();
            case G_MAJOR_SCALE_POSITION:
                return new ViolaGMajorScale();
            case D_MAJOR_SCALE_POSITION:
                return new ViolaDMajorScale();
            case A_MAJOR_SCALE_POSITION:
                return new ViolaAMajorScale();
            case E_MAJOR_SCALE_POSITION:
                return new ViolaEMajorScale();
            case B_MAJOR_SCALE_POSITION:
                return new ViolaBMajorScale();
            case F_SHARP_MAJOR_SCALE_POSITION:
                return new ViolaFSharpMajorScale();
            case C_SHARP_MAJOR_SCALE_POSITION:
                return new ViolaCSharpMajorScale();
            case F_MAJOR_SCALE_POSITION:
                return new ViolaFMajorScale();
            case B_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaBFlatMajorScale();
            case E_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaEFlatMajorScale();
            case A_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaAFlatMajorScale();
            case D_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaDFlatMajorScale();
            case G_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaGFlatMajorScale();
            case C_FLAT_MAJOR_SCALE_POSITION:
                return new ViolaCFlatMajorScale();
            case CHROMATIC_SCALE_POSITION:
                return new ViolaChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolaCMajorScale();
        }
    }
}
