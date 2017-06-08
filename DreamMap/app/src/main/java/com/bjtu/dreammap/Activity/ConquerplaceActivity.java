package com.bjtu.dreammap.Activity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Button;
        import android.widget.ImageView;

        import com.bjtu.dreammap.R;


public class ConquerplaceActivity extends AppCompatActivity {

        private ImageView ImageVHelp;

        public void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_conquerplace);
                ImageVHelp = (ImageView)findViewById(R.id.imagev_help);

        }



}
