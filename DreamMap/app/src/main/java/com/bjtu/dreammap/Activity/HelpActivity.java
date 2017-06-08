package com.bjtu.dreammap.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bjtu.dreammap.R;


public class HelpActivity extends AppCompatActivity {

    private TextView VHelp;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        VHelp = (TextView)findViewById(R.id.v_help);


    }
}
