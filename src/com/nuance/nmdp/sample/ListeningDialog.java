package com.nuance.nmdp.sample;

import android.app.Activity;
import android.app.Dialog;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

class ListeningDialog extends Dialog
{
    private String _text;
    private String _level;
    private boolean _recording;
    
    public ListeningDialog(Activity owner) 
    {
        super(owner);
        
        _text = null;
        _level = null;
        _recording = false;
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.listening);
        setOwnerActivity(owner);
        setCancelable(true); 

        WindowManager.LayoutParams layout = getWindow().getAttributes();
        layout.gravity = Gravity.BOTTOM;
        layout.width = WindowManager.LayoutParams.FILL_PARENT;
    }
    
    public void setText(String text)
    {
        _text = text;
        TextView t = (TextView)findViewById(R.id.text_listeningStatus);
        if (t != null)
        {
            t.setText(text);
        }
    }
    
    public void setLevel(String level)
    {
        TextView t = (TextView)findViewById(R.id.text_recordLevel);
        t.setText(level);
    }
    
    public void setRecording(boolean recording)
    {
        _recording = recording;
    }
    
    public String getText()
    {
        return _text;
    }
    
    public String getLevel()
    {
        return _level;
    }
    
    public boolean isRecording()
    {
        return _recording;
    }
     
    public void setStoppable(boolean stoppable)
    {
        setButtonEnabled((Button)findViewById(R.id.btn_listeningStop), stoppable);
    }
    
    private void setButtonEnabled(Button b, boolean enabled)
    {
        if (b != null) b.setEnabled(enabled);
    }

    public void prepare(Button.OnClickListener stopButtonListener)
    {
        if (_text != null)
        {
            setText(_text);
        }
        setLevel("");
        _recording = false;
        
        Button b = (Button)findViewById(R.id.btn_listeningStop);
        setButtonEnabled(b, true);
        b.setOnClickListener(stopButtonListener);
    }
}
