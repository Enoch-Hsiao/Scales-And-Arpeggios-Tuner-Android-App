package com.github.cythara;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager.LayoutParams;

import com.github.cythara.ListenerFragment.TaskCallbacks;
import com.github.cythara.arpeggioMappers.CelloMajorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.CelloMinorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.DoubleBassMajorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.DoubleBassMinorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.ViolaMajorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.ViolaMinorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.ViolinMajorArpeggiosMapper;
import com.github.cythara.arpeggioMappers.ViolinMinorArpeggiosMapper;
import com.github.cythara.scaleMappers.CelloMajorScalesMapper;
import com.github.cythara.scaleMappers.CelloMinorScalesMapper;
import com.github.cythara.scaleMappers.DoubleBassMajorScalesMapper;
import com.github.cythara.scaleMappers.DoubleBassMinorScalesMapper;
import com.github.cythara.scaleMappers.ViolaMajorScalesMapper;
import com.github.cythara.scaleMappers.ViolaMinorScalesMapper;
import com.github.cythara.scaleMappers.ViolinMajorScalesMapper;
import com.github.cythara.scaleMappers.ViolinMinorScalesMapper;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.jaredrummler.materialspinner.MaterialSpinner.OnItemSelectedListener;
import com.jaredrummler.materialspinner.MaterialSpinnerAdapter;
import com.shawnlin.numberpicker.NumberPicker;
import com.shawnlin.numberpicker.NumberPicker.OnValueChangeListener;

import java.util.Arrays;

import androidx.annotation.NonNull;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;

public class Scales extends AppCompatActivity implements TaskCallbacks,
        OnItemSelectedListener, OnValueChangeListener {

    public static final int RECORD_AUDIO_PERMISSION = 0;
    public static final String PREFS_FILE = "prefs_file";
    public static final String USE_SCIENTIFIC_NOTATION = "use_scientific_notation";
    public static final String CURRENT_SCALE = "current_scale";
    protected static final String REFERENCE_PITCH = "reference_pitch";
    private static final String TAG_LISTENER_FRAGMENT = "listener_fragment";
    private static final String USE_DARK_MODE = "use_dark_mode";
    private static boolean isDarkModeEnabled;
    public static final int ACTIVITY = 2;
    private static PitchAdjuster pitchAdjuster;
 
    private boolean[] correctNotes;
    private Note[] notesInScale;
    private TunerView tunerView;

    private Button buttonTest;
    private Button buttonMajorMinor;
    private Button buttonScalesArpeggios;
    private Button buttonInstrument;
    private static boolean isTesting = false;
    private static boolean isOnMajor = false;
    private static boolean isOnScales = false;
    private static int instrument = 0;
    private static int scalePosition = 0;
    private static int majorMinor = 0;
    private static int scalesArpeggios = 0;

    private static Float frequency;
    private static ListenerFragment listenerFragment;

    public static TypeOfScalesOrArpeggios getCurrentScaleOrArpeggio() {
        if(instrument == 0) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    return ViolinMajorScalesMapper.getScaleFromPosition(scalePosition);
                else
                    return ViolinMinorScalesMapper.getScaleFromPosition(scalePosition);
            } else {
                if (majorMinor == 0)
                    return ViolinMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
                else
                    return ViolinMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
            }
        }
        else if(instrument == 1) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    return ViolaMajorScalesMapper.getScaleFromPosition(scalePosition);
                else
                    return ViolaMinorScalesMapper.getScaleFromPosition(scalePosition);
            }else {
                if (majorMinor == 0)
                    return ViolaMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
                else
                    return ViolaMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
            }
        }
        else if(instrument == 2) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    return CelloMajorScalesMapper.getScaleFromPosition(scalePosition);
                else
                    return CelloMinorScalesMapper.getScaleFromPosition(scalePosition);
            } else {
                if (majorMinor == 0)
                    return CelloMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
                else
                    return CelloMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
            }
        }
        else{
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    return DoubleBassMajorScalesMapper.getScaleFromPosition(scalePosition);
                else
                    return DoubleBassMinorScalesMapper.getScaleFromPosition(scalePosition);
            } else {
                if (majorMinor == 0)
                    return DoubleBassMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
                else
                    return DoubleBassMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition);
            }
        }
    }

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        int permissionCheck = ContextCompat.checkSelfPermission(this,
                Manifest.permission.RECORD_AUDIO);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            requestRecordAudioPermission();
        } else {
            startRecording();
        }

        enableTheme();

        setContentView(R.layout.activity_scales);
        setCurrentScale();

        setPitchAdjuster();
        getWindow().addFlags(LayoutParams.FLAG_KEEP_SCREEN_ON);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setTitle(R.string.scales_and_arpeggios_tuner);
        myToolbar.showOverflowMenu();
        setSupportActionBar(myToolbar);

        instrument = 0;
        majorMinor = 0;
        scalesArpeggios = 0;
        setCurrentScale();

       buttonInstrument = findViewById(R.id.instrument); //Instrument Button
       buttonInstrument.setOnClickListener(view -> {
           if (instrument == 0) { //violin
               buttonInstrument.setText("Viola");
               instrument = 1;
               setCurrentScale();
           } else if (instrument == 1){ //viola
               buttonInstrument.setText("Cello");
               instrument = 2;
               setCurrentScale();
           }
           else if (instrument == 2){ //cello
               buttonInstrument.setText("Double Bass");
               instrument = 3;
               setCurrentScale();
           }
           else if (instrument == 3){ //cello
               buttonInstrument.setText("Violin");
               instrument = 0;
               setCurrentScale();
           }
       });

       buttonInstrument.setBackgroundColor(Color.WHITE);
       if(isDarkModeEnabled) {
           buttonInstrument.setBackgroundColor(Color.parseColor("#FF212121"));
           buttonInstrument.setTextColor(Color.WHITE);
       }
       
       buttonMajorMinor = findViewById(R.id.majorMinor); //MajorMinor Button
       buttonMajorMinor.setOnClickListener(view -> {
           isOnMajor = !isOnMajor;
           if (isOnMajor) {
               buttonMajorMinor.setText("Minor");
               majorMinor = 1;
               setCurrentScale();
           } else {
               buttonMajorMinor.setText("Major");
               majorMinor = 0;
               setCurrentScale();
           }
       });

       buttonMajorMinor.setBackgroundColor(Color.WHITE);
       if(isDarkModeEnabled) {
           buttonMajorMinor.setBackgroundColor(Color.parseColor("#FF212121"));
           buttonMajorMinor.setTextColor(Color.WHITE);
       }

       buttonScalesArpeggios = findViewById(R.id.scalesArpeggios); //ScalesArpeggios Button
       buttonScalesArpeggios.setOnClickListener(view -> {
           isOnScales = !isOnScales;
           if (isOnScales) {
               buttonScalesArpeggios.setText("Arpeggios");
               scalesArpeggios = 1;
               setCurrentScale();
           } else {
               buttonScalesArpeggios.setText("Scales");
               scalesArpeggios = 0;
               setCurrentScale();
           }
       });

       buttonScalesArpeggios.setBackgroundColor(Color.WHITE);
       if(isDarkModeEnabled) {
           buttonScalesArpeggios.setBackgroundColor(Color.parseColor("#FF212121"));
           buttonScalesArpeggios.setTextColor(Color.WHITE);
       }
       
        buttonTest = findViewById(R.id.startButton);
            buttonTest.setOnClickListener(view -> {
                isTesting = !isTesting;
                if (isTesting) {
                    buttonTest.setText("Stop Test");
                    startTest();
                } else {
                    tunerView.endTest();
                    buttonTest.setText("Start Test");
                    AlertDialog.Builder results = new AlertDialog.Builder(Scales.this, R.style.AlertDialogLight);
                    if (isDarkModeEnabled) {
                        results = new AlertDialog.Builder(Scales.this, R.style.AlertDialogDark);
                    }
                    String resultString = getMissedNotes();
                    results.setTitle("Missed Notes: ");
                    results.setMessage(resultString);
                    results.setCancelable(true);
                    AlertDialog resultsScreen = results.create();
                    resultsScreen.show();
                }
            });

            buttonTest.setBackgroundColor(Color.WHITE);
            if(isDarkModeEnabled){
                buttonTest.setBackgroundColor(Color.parseColor("#FF212121"));
                buttonTest.setTextColor(Color.WHITE);
                
                
       }
            
    }

    public void startTest(){
        if(instrument == 0) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    notesInScale = ViolinMajorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
                else
                    notesInScale = ViolinMinorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
            } else {
                if (majorMinor == 0)
                    notesInScale = ViolinMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
                else
                    notesInScale = ViolinMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
            }
        }
        else if(instrument == 1) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    notesInScale = ViolaMajorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
                else
                    notesInScale = ViolaMinorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
            } else {
                if (majorMinor == 0)
                    notesInScale = ViolaMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
                else
                    notesInScale = ViolaMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
            }
        }
        else if(instrument == 2) {
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    notesInScale = CelloMajorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
                else
                    notesInScale = CelloMinorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
            } else {
                if (majorMinor == 0)
                    notesInScale = CelloMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
                else
                    notesInScale = CelloMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
            }
        }
        else{
            if (scalesArpeggios == 0) {
                if (majorMinor == 0)
                    notesInScale = DoubleBassMajorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
                else
                    notesInScale = DoubleBassMinorScalesMapper.getScaleFromPosition(scalePosition).getNotes();
            } else {
                if (majorMinor == 0)
                    notesInScale = DoubleBassMajorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
                else
                    notesInScale = DoubleBassMinorArpeggiosMapper.getArpeggioFromPosition(scalePosition).getNotes();
            }
        }
        int numberOfNotes = notesInScale.length;
        correctNotes = new boolean[numberOfNotes];
        tunerView.test(notesInScale, correctNotes);
    }

    public String getMissedNotes(){
        String missedNotes = "";
        correctNotes = tunerView.getCanvasPainter().getCorrectNotesArray();
        for(int i = 0; i < correctNotes.length; i++)
            if(correctNotes[i] == false)
                missedNotes += notesInScale[i].getName() + notesInScale[i].getSign() + notesInScale[i].getOctave() + "\n";
        if(missedNotes.equals("")) //Missed no notes
            return "Congrats! \n0 missed notes.";
        return missedNotes;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tuner:{
                Intent myIntent = new Intent(Scales.this, MainActivity.class);
                Scales.this.startActivity(myIntent);
                break;
            }
            case R.id.show_privacy_policy: {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.privacy_policy_link)));
                startActivity(browserIntent);

                break;
            }
            case R.id.set_notation: {
                final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                        MODE_PRIVATE);
                final boolean useScientificNotation =
                        preferences.getBoolean(USE_SCIENTIFIC_NOTATION, true);

                int checkedItem = useScientificNotation ? 0 : 1;

                Builder builder = new Builder(new ContextThemeWrapper(this,
                        R.style.AppTheme));
                builder.setTitle(R.string.choose_notation);
                builder.setSingleChoiceItems(R.array.notations, checkedItem,
                        (dialog, which) -> {
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putBoolean(USE_SCIENTIFIC_NOTATION, which == 0);
                            editor.apply();

                            dialog.dismiss();

                            tunerView = findViewById(R.id.pitch);
                            tunerView.invalidate();
                        });
                builder.show();

                break;
            }
            case R.id.set_reference_pitch: {
                final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                        MODE_PRIVATE);
                int referencePitch = preferences.getInt(REFERENCE_PITCH, 440);

                NumberPickerDialog dialog = new NumberPickerDialog();

                Bundle bundle = new Bundle();
                bundle.putInt("current_value", referencePitch);
                dialog.setArguments(bundle);

                dialog.setValueChangeListener(this);
                dialog.show(getSupportFragmentManager(), "number_picker");

                break;
            }
            case R.id.show_information:{
                AlertDialog.Builder results = new AlertDialog.Builder(Scales.this, R.style.AlertDialogLight);
                if (isDarkModeEnabled) {
                    results = new AlertDialog.Builder(Scales.this, R.style.AlertDialogDark);
                }
                results.setTitle("How the Test works:");
                results.setMessage(" \nThe test checks your accuracy in your chosen 3 octave scale or arpeggio going up or down." +
                        " \n\nChromatic scale is a 3 octave C chromatic scale. \n\nMinor scale is in natural minor.\n\nPress START TEST to begin." +
                        " \n\nPlay the 3 octave scale or arpeggio, 2 octaves for double bass. \n\nTest works up to 80 BPM. \n\nPress stop when done. " +
                        " \n\nThe results screen show your missed notes, if any. \n\n" );
                results.setCancelable(true);
                AlertDialog resultsScreen = results.create();
                resultsScreen.show();

                break;
            }
        }

        return false;
    }

    @Override
    public void onProgressUpdate(PitchDifference pitchDifference) {
        tunerView = this.findViewById(R.id.pitch);
        if(pitchDifference != null) {
            pitchDifference.setActivity(ACTIVITY);
        }
        tunerView.setPitchDifference(pitchDifference);
        frequency = listenerFragment.getFrequency();
        if(frequency != null && tunerView != null)
            tunerView.setFrequency(frequency);
        tunerView.invalidate();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[],
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case RECORD_AUDIO_PERMISSION: {
                if (grantResults.length > 0) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        startRecording();
                    } else {
                        AlertDialog alertDialog = new Builder(Scales.this).create();
                        alertDialog.setTitle(R.string.permission_required);
                        alertDialog.setMessage(getString(R.string.microphone_permission_required));
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, getString(R.string.ok),
                                (dialog, which) -> {
                                    dialog.dismiss();
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                        finishAffinity();
                                    } else {
                                        finish();
                                    }
                                });
                        alertDialog.show();
                    }
                }
            }
        }
    }

    @Override
    public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
        final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(CURRENT_SCALE, position);
        editor.apply();

        scalePosition = position;
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldValue, int newValue) {
        final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(REFERENCE_PITCH, newValue);
        editor.apply();

        setPitchAdjuster();

        tunerView = this.findViewById(R.id.pitch);
        tunerView.invalidate();
    }

    private void startRecording() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        listenerFragment = (ListenerFragment)
                fragmentManager.findFragmentByTag(TAG_LISTENER_FRAGMENT);
        if (listenerFragment == null) {
            listenerFragment = new ListenerFragment();
            fragmentManager
                    .beginTransaction()
                    .add(listenerFragment, TAG_LISTENER_FRAGMENT)
                    .commit();
        }
        listenerFragment.setActivity(ACTIVITY);
    }

    private void setCurrentScale() {
        final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                MODE_PRIVATE);
        scalePosition = preferences.getInt(CURRENT_SCALE, 0);
        int textColorDark = getResources().getColor(R.color.colorTextDark);

        MaterialSpinner spinner = findViewById(R.id.scales);
        MaterialSpinnerAdapter<String> adapter; //Check if any errors with chromatic maybe change scaleposition to 0 if change to arpeggio
        if(scalesArpeggios == 0) {
            if (majorMinor == 0)
                adapter = new MaterialSpinnerAdapter<>(this,
                        Arrays.asList(getResources().getStringArray(R.array.majorScales)));
            else
                adapter = new MaterialSpinnerAdapter<>(this,
                        Arrays.asList(getResources().getStringArray(R.array.minorScales)));
        }
        else {
            if (majorMinor == 0)
                adapter = new MaterialSpinnerAdapter<>(this,
                        Arrays.asList(getResources().getStringArray(R.array.majorArpeggios)));
            else
                adapter = new MaterialSpinnerAdapter<>(this,
                        Arrays.asList(getResources().getStringArray(R.array.minorArpeggios)));
        }
        if (isDarkModeEnabled) {
            spinner.setTextColor(textColorDark);
            spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            spinner.setTextColor(textColorDark);
            spinner.setArrowColor(textColorDark);
        }
        scalePosition = 0;
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner.setSelectedIndex(scalePosition);
    }

    private void enableTheme() {
        final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                MODE_PRIVATE);
        isDarkModeEnabled = preferences.getBoolean(USE_DARK_MODE, true);

        int mode = AppCompatDelegate.MODE_NIGHT_NO;
        if (isDarkModeEnabled) {
            mode = AppCompatDelegate.MODE_NIGHT_YES;
        }

        AppCompatDelegate.setDefaultNightMode(mode);
    }

    private void setPitchAdjuster() {
        final SharedPreferences preferences = getSharedPreferences(PREFS_FILE,
                MODE_PRIVATE);
        int referencePitch = preferences.getInt(REFERENCE_PITCH, 440);

        pitchAdjuster = new PitchAdjuster(referencePitch);
    }

    private void requestRecordAudioPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO},
                RECORD_AUDIO_PERMISSION);
    }

}
