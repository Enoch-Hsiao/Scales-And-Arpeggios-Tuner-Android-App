package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.violin.violinMajorScales.ViolinCMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinGMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinDMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinAMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinEMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinBMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinFSharpMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinCSharpMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinFMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinBFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinEFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinAFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinDFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinGFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinCFlatMajorScale;
import com.github.cythara.violin.violinMajorScales.ViolinChromaticScale;


public class ViolinMajorScalesMapper {
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
                return new ViolinCMajorScale();
            case G_MAJOR_SCALE_POSITION:
                return new ViolinGMajorScale();
            case D_MAJOR_SCALE_POSITION:
                return new ViolinDMajorScale();
            case A_MAJOR_SCALE_POSITION:
                return new ViolinAMajorScale();
            case E_MAJOR_SCALE_POSITION:
                return new ViolinEMajorScale();
            case B_MAJOR_SCALE_POSITION:
                return new ViolinBMajorScale();
            case F_SHARP_MAJOR_SCALE_POSITION:
                return new ViolinFSharpMajorScale();
            case C_SHARP_MAJOR_SCALE_POSITION:
                return new ViolinCSharpMajorScale();
            case F_MAJOR_SCALE_POSITION:
                return new ViolinFMajorScale();
            case B_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinBFlatMajorScale();
            case E_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinEFlatMajorScale();
            case A_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinAFlatMajorScale();
            case D_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinDFlatMajorScale();
            case G_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinGFlatMajorScale();
            case C_FLAT_MAJOR_SCALE_POSITION:
                return new ViolinCFlatMajorScale();
            case CHROMATIC_SCALE_POSITION:
                return new ViolinChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolinCMajorScale();
        }
    }
}
