package com.github.cythara.arpeggioMappers;

import android.util.Log;

import com.github.cythara.TypeOfScalesOrArpeggios;
import com.github.cythara.violin.violinMinorArpeggios.ViolinCMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinGMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinDMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinAMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinEMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinBMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinFSharpMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinCSharpMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinFMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinBFlatMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinEFlatMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinAFlatMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinDSharpMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinGSharpMinorArpeggio;
import com.github.cythara.violin.violinMinorArpeggios.ViolinASharpMinorArpeggio;


public class ViolinMinorArpeggiosMapper {
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
                return new ViolinAMinorArpeggio();
            case E_MINOR_ARPEGGIO_POSITION:
                return new ViolinEMinorArpeggio();
            case B_MINOR_ARPEGGIO_POSITION:
                return new ViolinBMinorArpeggio();
            case F_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolinFSharpMinorArpeggio();
            case C_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolinCSharpMinorArpeggio();
            case G_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolinGSharpMinorArpeggio();
            case D_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolinDSharpMinorArpeggio();
            case A_SHARP_MINOR_ARPEGGIO_POSITION:
                return new ViolinASharpMinorArpeggio();
            case D_MINOR_ARPEGGIO_POSITION:
                return new ViolinDMinorArpeggio();
            case G_MINOR_ARPEGGIO_POSITION:
                return new ViolinGMinorArpeggio();
            case C_MINOR_ARPEGGIO_POSITION:
                return new ViolinCMinorArpeggio();
            case F_MINOR_ARPEGGIO_POSITION:
                return new ViolinFMinorArpeggio();
            case B_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolinBFlatMinorArpeggio();
            case E_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolinEFlatMinorArpeggio();
            case A_FLAT_MINOR_ARPEGGIO_POSITION:
                return new ViolinAFlatMinorArpeggio();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ViolinCMinorArpeggio();
        }
    }
}
