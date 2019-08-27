package com.github.cythara.scaleMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.cello.celloMinorScales.CelloCMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloGMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloDMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloAMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloEMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloBMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloFSharpMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloCSharpMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloFMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloBFlatMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloEFlatMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloAFlatMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloDSharpMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloGSharpMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloASharpMinorScale;
import com.github.cythara.cello.celloMinorScales.CelloChromaticScale;


public class CelloMinorScalesMapper {
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
                return new CelloAMinorScale();
            case E_MINOR_SCALE_POSITION:
                return new CelloEMinorScale();
            case B_MINOR_SCALE_POSITION:
                return new CelloBMinorScale();
            case F_SHARP_MINOR_SCALE_POSITION:
                return new CelloFSharpMinorScale();
            case C_SHARP_MINOR_SCALE_POSITION:
                return new CelloCSharpMinorScale();
            case G_SHARP_MINOR_SCALE_POSITION:
                return new CelloGSharpMinorScale();
            case D_SHARP_MINOR_SCALE_POSITION:
                return new CelloDSharpMinorScale();
            case A_SHARP_MINOR_SCALE_POSITION:
                return new CelloASharpMinorScale();
            case D_MINOR_SCALE_POSITION:
                return new CelloDMinorScale();
            case G_MINOR_SCALE_POSITION:
                return new CelloGMinorScale();
            case C_MINOR_SCALE_POSITION:
                return new CelloCMinorScale();
            case F_MINOR_SCALE_POSITION:
                return new CelloFMinorScale();
            case B_FLAT_MINOR_SCALE_POSITION:
                return new CelloBFlatMinorScale();
            case E_FLAT_MINOR_SCALE_POSITION:
                return new CelloEFlatMinorScale();
            case A_FLAT_MINOR_SCALE_POSITION:
                return new CelloAFlatMinorScale();
            case CHROMATIC_SCALE_POSITION:
                return new CelloChromaticScale();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new CelloCMinorScale();
        }
    }
}