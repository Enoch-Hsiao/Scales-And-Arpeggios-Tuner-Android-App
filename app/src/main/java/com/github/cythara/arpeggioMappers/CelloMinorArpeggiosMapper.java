package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.cello.celloMinorArpeggios.CelloCMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloGMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloDMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloAMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloEMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloBMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloFSharpMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloCSharpMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloFMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloBFlatMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloEFlatMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloAFlatMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloDSharpMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloGSharpMinorArpeggio;
import com.github.cythara.cello.celloMinorArpeggios.CelloASharpMinorArpeggio;


public class CelloMinorArpeggiosMapper {
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
                return new CelloAMinorArpeggio();
            case E_MINOR_ARPEGGIO_POSITION:
                return new CelloEMinorArpeggio();
            case B_MINOR_ARPEGGIO_POSITION:
                return new CelloBMinorArpeggio();
            case F_SHARP_MINOR_ARPEGGIO_POSITION:
                return new CelloFSharpMinorArpeggio();
            case C_SHARP_MINOR_ARPEGGIO_POSITION:
                return new CelloCSharpMinorArpeggio();
            case G_SHARP_MINOR_ARPEGGIO_POSITION:
                return new CelloGSharpMinorArpeggio();
            case D_SHARP_MINOR_ARPEGGIO_POSITION:
                return new CelloDSharpMinorArpeggio();
            case A_SHARP_MINOR_ARPEGGIO_POSITION:
                return new CelloASharpMinorArpeggio();
            case D_MINOR_ARPEGGIO_POSITION:
                return new CelloDMinorArpeggio();
            case G_MINOR_ARPEGGIO_POSITION:
                return new CelloGMinorArpeggio();
            case C_MINOR_ARPEGGIO_POSITION:
                return new CelloCMinorArpeggio();
            case F_MINOR_ARPEGGIO_POSITION:
                return new CelloFMinorArpeggio();
            case B_FLAT_MINOR_ARPEGGIO_POSITION:
                return new CelloBFlatMinorArpeggio();
            case E_FLAT_MINOR_ARPEGGIO_POSITION:
                return new CelloEFlatMinorArpeggio();
            case A_FLAT_MINOR_ARPEGGIO_POSITION:
                return new CelloAFlatMinorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new CelloCMinorArpeggio();
        }
    }
}
