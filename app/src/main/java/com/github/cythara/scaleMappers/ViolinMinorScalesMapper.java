package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.violin.violinMinorScales.ViolinCMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinGMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinDMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinAMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinEMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinBMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinFSharpMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinCSharpMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinFMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinBFlatMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinEFlatMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinAFlatMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinDSharpMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinGSharpMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinASharpMinorScale;
import com.github.cythara.violin.violinMinorScales.ViolinChromaticScale;


public class ViolinMinorScalesMapper {
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
                return new ViolinAMinorScale();
            case E_MINOR_SCALE_POSITION:
                return new ViolinEMinorScale();
            case B_MINOR_SCALE_POSITION:
                return new ViolinBMinorScale();
            case F_SHARP_MINOR_SCALE_POSITION:
                return new ViolinFSharpMinorScale();
            case C_SHARP_MINOR_SCALE_POSITION:
                return new ViolinCSharpMinorScale();
            case G_SHARP_MINOR_SCALE_POSITION:
                return new ViolinGSharpMinorScale();
            case D_SHARP_MINOR_SCALE_POSITION:
                return new ViolinDSharpMinorScale();
            case A_SHARP_MINOR_SCALE_POSITION:
                return new ViolinASharpMinorScale();
            case D_MINOR_SCALE_POSITION:
                return new ViolinDMinorScale();
            case G_MINOR_SCALE_POSITION:
                return new ViolinGMinorScale();
            case C_MINOR_SCALE_POSITION:
                return new ViolinCMinorScale();
            case F_MINOR_SCALE_POSITION:
                return new ViolinFMinorScale();
            case B_FLAT_MINOR_SCALE_POSITION:
                return new ViolinBFlatMinorScale();
            case E_FLAT_MINOR_SCALE_POSITION:
                return new ViolinEFlatMinorScale();
            case A_FLAT_MINOR_SCALE_POSITION:
                return new ViolinAFlatMinorScale();
            case CHROMATIC_SCALE_POSITION:
                return new ViolinChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolinCMinorScale();
        }
    }
}
