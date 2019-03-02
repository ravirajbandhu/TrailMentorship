package com.jis.mentorship;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.welcome);
        textView = findViewById(R.id.mento_tv);
        textView = findViewById(R.id.mentee_tv);

        typeface = Typeface.createFromAsset(this.getAssets(),"fonts/Poppins-Regular.ttf");
        textView.setTypeface(typeface);
    }
}
