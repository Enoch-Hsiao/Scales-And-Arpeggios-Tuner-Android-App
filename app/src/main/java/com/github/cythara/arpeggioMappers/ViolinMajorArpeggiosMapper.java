package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.violin.violinMajorArpeggios.ViolinCMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinGMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinDMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinAMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinEMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinBMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinFSharpMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinCSharpMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinFMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinBFlatMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinEFlatMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinAFlatMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinDFlatMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinGFlatMajorArpeggio;
import com.github.cythara.violin.violinMajorArpeggios.ViolinCFlatMajorArpeggio;


public class ViolinMajorArpeggiosMapper {
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
                return new ViolinCMajorArpeggio();
            case G_MAJOR_ARPEGGIO_POSITION:
                return new ViolinGMajorArpeggio();
            case D_MAJOR_ARPEGGIO_POSITION:
                return new ViolinDMajorArpeggio();
            case A_MAJOR_ARPEGGIO_POSITION:
                return new ViolinAMajorArpeggio();
            case E_MAJOR_ARPEGGIO_POSITION:
                return new ViolinEMajorArpeggio();
            case B_MAJOR_ARPEGGIO_POSITION:
                return new ViolinBMajorArpeggio();
            case F_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new ViolinFSharpMajorArpeggio();
            case C_SHARP_MAJOR_ARPEGGIO_POSITION:
                return new ViolinCSharpMajorArpeggio();
            case F_MAJOR_ARPEGGIO_POSITION:
                return new ViolinFMajorArpeggio();
            case B_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinBFlatMajorArpeggio();
            case E_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinEFlatMajorArpeggio();
            case A_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinAFlatMajorArpeggio();
            case D_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinDFlatMajorArpeggio();
            case G_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinGFlatMajorArpeggio();
            case C_FLAT_MAJOR_ARPEGGIO_POSITION:
                return new ViolinCFlatMajorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolinCMajorArpeggio();
        }
    }
}
