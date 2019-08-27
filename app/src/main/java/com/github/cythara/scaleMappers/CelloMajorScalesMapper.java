package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.cello.celloMajorScales.CelloCMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloGMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloDMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloAMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloEMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloBMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloFSharpMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloCSharpMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloFMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloBFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloEFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloAFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloDFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloGFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloCFlatMajorScale;
import com.github.cythara.cello.celloMajorScales.CelloChromaticScale;


public class CelloMajorScalesMapper {
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
                return new CelloCMajorScale();
            case G_MAJOR_SCALE_POSITION:
                return new CelloGMajorScale();
            case D_MAJOR_SCALE_POSITION:
                return new CelloDMajorScale();
            case A_MAJOR_SCALE_POSITION:
                return new CelloAMajorScale();
            case E_MAJOR_SCALE_POSITION:
                return new CelloEMajorScale();
            case B_MAJOR_SCALE_POSITION:
                return new CelloBMajorScale();
            case F_SHARP_MAJOR_SCALE_POSITION:
                return new CelloFSharpMajorScale();
            case C_SHARP_MAJOR_SCALE_POSITION:
                return new CelloCSharpMajorScale();
            case F_MAJOR_SCALE_POSITION:
                return new CelloFMajorScale();
            case B_FLAT_MAJOR_SCALE_POSITION:
                return new CelloBFlatMajorScale();
            case E_FLAT_MAJOR_SCALE_POSITION:
                return new CelloEFlatMajorScale();
            case A_FLAT_MAJOR_SCALE_POSITION:
                return new CelloAFlatMajorScale();
            case D_FLAT_MAJOR_SCALE_POSITION:
                return new CelloDFlatMajorScale();
            case G_FLAT_MAJOR_SCALE_POSITION:
                return new CelloGFlatMajorScale();
            case C_FLAT_MAJOR_SCALE_POSITION:
                return new CelloCFlatMajorScale();
            case CHROMATIC_SCALE_POSITION:
                return new CelloChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new CelloCMajorScale();
        }
    }
}