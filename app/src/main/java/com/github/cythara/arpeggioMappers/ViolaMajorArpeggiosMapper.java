package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.viola.violaMajorArpeggios.ViolaCMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaGMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaDMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaAMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaEMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaBMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaFSharpMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaCSharpMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaFMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaBFlatMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaEFlatMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaAFlatMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaDFlatMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaGFlatMajorArpeggio;
import com.github.cythara.viola.violaMajorArpeggios.ViolaCFlatMajorArpeggio;


public class ViolaMajorArpeggiosMapper {
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
                return new ViolaCMajorArpeggio();
            case G_MAJOR_ARPEGGIO_POSITION:
                return new ViolaGMajorArpeggio();
            case D_MAJOR_ARPEGGIO_POSITION:
                return new ViolaDMajorArpeggio();
            case A_MAJOR_ARPEGGIO_POSITION:
                return new ViolaAMajorArpeggio();
            case E_MAJOR_ARPEGGIO_POSITION:
                return new ViolaEMajorArpeggio();
            case B_MAJOR_ARPEGGIO_POSITION:
                return new ViolaBMajorArpeggio();
            case F_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new ViolaFSharpMajorArpeggio();
            case C_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new ViolaCSharpMajorArpeggio();
            case F_MAJOR_ARPEGGIO_POSITION:
                return new ViolaFMajorArpeggio();
            case B_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaBFlatMajorArpeggio();
            case E_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaEFlatMajorArpeggio();
            case A_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaAFlatMajorArpeggio();
            case D_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaDFlatMajorArpeggio();
            case G_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaGFlatMajorArpeggio();
            case C_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolaCFlatMajorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolaCMajorArpeggio();
        }
    }
}
