package com.bjtu.dreammap.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bjtu.dreammap.R;

public class HomepageActivity extends AppCompatActivity {
    private TextView VDeal;
    private TextView VScenic;
    private TextView VUser;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        VDeal = (TextView)findViewById(R.id.v_deal);
        VScenic = (TextView)findViewById(R.id.v_scenic);
        VUser = (TextView)findViewById(R.id.v_user);

    }
}
