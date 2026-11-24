package com.example.lifecyclecounterandeventregistrationscreen_flojemon;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countText;

    private static final String TAG= "FLOJEMON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = findViewById(R.id.count_text);
        Button countButton = findViewById(R.id.count_button);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }
        countText.setText("Flojemon's Count: " + count);

        countButton.setOnClickListener(v -> {
            count++;
            countText.setText("Flojemon's Count: " + count);
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    @Override protected void onStart(){
        super.onStart(); Log.d(TAG, "onStart");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }
    @Override protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
    }
