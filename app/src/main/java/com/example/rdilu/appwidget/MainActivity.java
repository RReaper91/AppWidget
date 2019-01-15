package com.example.rdilu.appwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int clicks = getSharedPreferences("sp", MODE_PRIVATE).getInt("clicks", 0);
        ((TextView)findViewById(R.id.clicksTextView)).setText(String.valueOf(clicks));
    }
}
