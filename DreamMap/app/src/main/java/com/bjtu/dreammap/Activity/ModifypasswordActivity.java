package com.bjtu.dreammap.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.bjtu.dreammap.R;

public class ModifypasswordActivity extends AppCompatActivity {

    private EditText TCPhonenumber;
    private EditText TOldPassword;
    private EditText TNewPassword;
    private EditText TSeconNewPassword;
    private Button SaveButton;
    private Button SendverifyButton;



    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifypassword);

        TCPhonenumber = (EditText)findViewById(R.id.txt_cphonenumber);
        TOldPassword = (EditText)findViewById(R.id.txt_opassword);
        TNewPassword = (EditText)findViewById(R.id.txt_npassword);
        TSeconNewPassword = (EditText)findViewById(R.id.txt_spassword);
        SaveButton = (Button)findViewById(R.id.btn_save);
        SendverifyButton = (Button)findViewById(R.id.btn_sendverify);

    }
}
