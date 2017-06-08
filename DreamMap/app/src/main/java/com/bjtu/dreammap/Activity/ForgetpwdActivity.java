package com.bjtu.dreammap.Activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bjtu.dreammap.R;

public class ForgetpwdActivity extends AppCompatActivity {

    private Button ModifyButton;
    private Button SendverifyButton;
    private EditText TPhonenumber;
    private EditText TVerify;
    private EditText TPassword;
    private EditText TSePassword;


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpwd);

        ModifyButton = (Button)findViewById(R.id.btn_modify);
        SendverifyButton = (Button)findViewById(R.id.btn_sendverify);
        TPhonenumber = (EditText)findViewById(R.id.txt_phonenumber);
        TVerify = (EditText)findViewById(R.id.txt_verify);
        TPassword = (EditText)findViewById(R.id.txt_password);
        TSePassword = (EditText)findViewById(R.id.txt_spassword);

    }
}
