package com.example.restuarateurio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.restuarateurio.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
        setContentView(layout.activity_main);

    }
}
