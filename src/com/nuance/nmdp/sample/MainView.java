package com.nuance.nmdp.sample;

import com.nuance.nmdp.speechkit.Prompt;
import com.nuance.nmdp.speechkit.SpeechKit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainView extends Activity {
    
    private static SpeechKit _speechKit;
    public static final String _languageCode = "vi_VN";
    
    // Allow other activities to access the SpeechKit instance.
    static SpeechKit getSpeechKit()
    {
        return _speechKit;
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // If this Activity is being recreated due to a config change (e.g. 
        // screen rotation), check for the saved SpeechKit instance.
        _speechKit = (SpeechKit)getLastNonConfigurationInstance();
        if (_speechKit == null)
        {
            _speechKit = SpeechKit.initialize(getApplication().getApplicationContext(), AppInfo.SpeechKitAppId, AppInfo.SpeechKitServer, AppInfo.SpeechKitPort, AppInfo.SpeechKitSsl, AppInfo.SpeechKitApplicationKey);
            _speechKit.connect();
            // TODO: Keep an eye out for audio prompts not working on the Droid 2 or other 2.2 devices.
            Prompt beep = _speechKit.defineAudioPrompt(R.raw.beep);
            _speechKit.setDefaultRecognizerPrompts(beep, Prompt.vibration(100), null, null);
        }
        
        final Button dictationButton = (Button)findViewById(R.id.btn_dictation);
        final Button ttsButton = (Button)findViewById(R.id.btn_tts);

        Button.OnClickListener l = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (v == dictationButton)
                {
                    Intent intent = new Intent(v.getContext(), DictationView.class);
                    MainView.this.startActivity(intent);
                } else if (v == ttsButton)
                {
                    Intent intent = new Intent(v.getContext(), TtsView.class);
                    MainView.this.startActivity(intent);
                }
            }
        };
        
        dictationButton.setOnClickListener(l);
        ttsButton.setOnClickListener(l);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (_speechKit != null)
        {
            _speechKit.release();
            _speechKit = null;
        }
    }
    
    @Override
    public Object onRetainNonConfigurationInstance()
    {
        // Save the SpeechKit instance, because we know the Activity will be
        // immediately recreated.
        SpeechKit sk = _speechKit;
        _speechKit = null; // Prevent onDestroy() from releasing SpeechKit
        return sk;
    }
}