package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.cello.celloMajorArpeggios.CelloCMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloGMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloDMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloAMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloEMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloBMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloFSharpMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloCSharpMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloFMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloBFlatMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloEFlatMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloAFlatMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloDFlatMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloGFlatMajorArpeggio;
import com.github.cythara.cello.celloMajorArpeggios.CelloCFlatMajorArpeggio;


public class CelloMajorArpeggiosMapper {
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
                return new CelloCMajorArpeggio();
            case G_MAJOR_ARPEGGIO_POSITION:
                return new CelloGMajorArpeggio();
            case D_MAJOR_ARPEGGIO_POSITION:
                return new CelloDMajorArpeggio();
            case A_MAJOR_ARPEGGIO_POSITION:
                return new CelloAMajorArpeggio();
            case E_MAJOR_ARPEGGIO_POSITION:
                return new CelloEMajorArpeggio();
            case B_MAJOR_ARPEGGIO_POSITION:
                return new CelloBMajorArpeggio();
            case F_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new CelloFSharpMajorArpeggio();
            case C_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new CelloCSharpMajorArpeggio();
            case F_MAJOR_ARPEGGIO_POSITION:
                return new CelloFMajorArpeggio();
            case B_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloBFlatMajorArpeggio();
            case E_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloEFlatMajorArpeggio();
            case A_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloAFlatMajorArpeggio();
            case D_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloDFlatMajorArpeggio();
            case G_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloGFlatMajorArpeggio();
            case C_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new CelloCFlatMajorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new CelloCMajorArpeggio();
        }
    }
}
