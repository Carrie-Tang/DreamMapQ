package com.bjtu.dreammap.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.bjtu.dreammap.R;

import static android.support.v7.appcompat.R.styleable.View;

public class LoginActivity extends AppCompatActivity{
    //定义一个button
    private Button LoginButton;
    private TextView VForgetpsw;
    private TextView VRegister;
    private EditText TUsername;
    private EditText TPhonenumber;
    private EditText TPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //将activity和对应的layout联系起来
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //将对象传递过来
        LoginButton = (Button)findViewById(R.id.btn_login);
        VForgetpsw = (TextView)findViewById(R.id.v_forgetpsw);
        VRegister = (TextView)findViewById(R.id.v_register);
        TUsername = (EditText)findViewById(R.id.txt_username);
        TPhonenumber = (EditText)findViewById(R.id.txt_phonenumber);
        TPassword = (EditText)findViewById(R.id.txt_password);
    }

       //登陆button的响应事件,跳转LoveActivity

    public void login(){
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this,LoveActivity.class);
        startActivity(intent);

    }

/*
    LoginButton.setOnClickListener( new OnClickListener（）{
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this,LoveActivity.class);
            startActivity(intent);
        }

    });
*/
    /*
    LoginButton.setOnClickListener(new OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this,LoveActivity.class);
            startActivity(intent);
        }
    });
    */
    /*
        //忘记密码的响应事件,跳转ForgetpwdActivity
    VForgetpsw.setOnClickListener(new OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this,ForgetpwdActivity.class);
            startActivity(intent);
        }
    });
    */
    public void forgetpwd(){
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this,ForgetpwdActivity.class);
        startActivity(intent);
    }
        //注册的响应事件，跳转RegisterActivity
    /*
    VRegister.setOnClickListener(new OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);
        }
    });
    */
}

