package com.example.cristian.ec601_hw2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class PAO_Lock_v1 extends AppCompatActivity {
    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pao__lock_v1);
    }

    String message = "Your guess is:";
//    TextView guess = new TextView(this);
    //guess.setTextSize(40);
    //guess.setText(message);

    public void concatenate02(View view) { message = message+"02";}
    public void concatenate03(View view) { message = message+"03";}
    public void concatenate05(View view) { message = message+"05";}
    public void concatenate10(View view) { message = message+"10";}
    public void concatenate13(View view) { message = message+"13";}
    public void concatenate20(View view) { message = message+"20";}
    public void concatenate24(View view) { message = message+"24";}
    public void concatenate25(View view) { message = message+"25";}
    public void concatenate26(View view) { message = message+"26";}
}
