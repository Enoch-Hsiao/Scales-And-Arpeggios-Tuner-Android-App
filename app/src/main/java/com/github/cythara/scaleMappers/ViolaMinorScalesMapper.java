package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.viola.violaMinorScales.ViolaCMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaGMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaDMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaAMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaEMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaBMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaFSharpMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaCSharpMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaFMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaBFlatMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaEFlatMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaAFlatMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaDSharpMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaGSharpMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaASharpMinorScale;
import com.github.cythara.viola.violaMinorScales.ViolaChromaticScale;


public class ViolaMinorScalesMapper {
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
                return new ViolaAMinorScale();
            case E_MINOR_SCALE_POSITION:
                return new ViolaEMinorScale();
            case B_MINOR_SCALE_POSITION:
                return new ViolaBMinorScale();
            case F_SHARP_MINOR_SCALE_POSITION:
                return new ViolaFSharpMinorScale();
            case C_SHARP_MINOR_SCALE_POSITION:
                return new ViolaCSharpMinorScale();
            case G_SHARP_MINOR_SCALE_POSITION:
                return new ViolaGSharpMinorScale();
            case D_SHARP_MINOR_SCALE_POSITION:
                return new ViolaDSharpMinorScale();
            case A_SHARP_MINOR_SCALE_POSITION:
                return new ViolaASharpMinorScale();
            case D_MINOR_SCALE_POSITION:
                return new ViolaDMinorScale();
            case G_MINOR_SCALE_POSITION:
                return new ViolaGMinorScale();
            case C_MINOR_SCALE_POSITION:
                return new ViolaCMinorScale();
            case F_MINOR_SCALE_POSITION:
                return new ViolaFMinorScale();
            case B_FLAT_MINOR_SCALE_POSITION:
                return new ViolaBFlatMinorScale();
            case E_FLAT_MINOR_SCALE_POSITION:
                return new ViolaEFlatMinorScale();
            case A_FLAT_MINOR_SCALE_POSITION:
                return new ViolaAFlatMinorScale();
            case CHROMATIC_SCALE_POSITION:
                return new ViolaChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolaCMinorScale();
        }
    }
}