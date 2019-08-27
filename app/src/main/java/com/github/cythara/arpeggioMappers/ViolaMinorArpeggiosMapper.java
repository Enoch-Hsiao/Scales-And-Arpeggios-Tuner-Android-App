package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.viola.violaMinorArpeggios.ViolaCMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaGMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaDMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaAMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaEMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaBMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaFSharpMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaCSharpMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaFMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaBFlatMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaEFlatMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaAFlatMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaDSharpMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaGSharpMinorArpeggio;
import com.github.cythara.viola.violaMinorArpeggios.ViolaASharpMinorArpeggio;


public class ViolaMinorArpeggiosMapper {
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
                return new ViolaAMinorArpeggio();
            case E_MINOR_ARPEGGIO_POSITION:
                return new ViolaEMinorArpeggio();
            case B_MINOR_ARPEGGIO_POSITION:
                return new ViolaBMinorArpeggio();
            case F_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolaFSharpMinorArpeggio();
            case C_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolaCSharpMinorArpeggio();
            case G_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolaGSharpMinorArpeggio();
            case D_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolaDSharpMinorArpeggio();
            case A_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolaASharpMinorArpeggio();
            case D_MINOR_ARPEGGIO_POSITION:
                return new ViolaDMinorArpeggio();
            case G_MINOR_ARPEGGIO_POSITION:
                return new ViolaGMinorArpeggio();
            case C_MINOR_ARPEGGIO_POSITION:
                return new ViolaCMinorArpeggio();
            case F_MINOR_ARPEGGIO_POSITION:
                return new ViolaFMinorArpeggio();
            case B_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolaBFlatMinorArpeggio();
            case E_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolaEFlatMinorArpeggio();
            case A_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolaAFlatMinorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolaCMinorArpeggio();
        }
    }
}
