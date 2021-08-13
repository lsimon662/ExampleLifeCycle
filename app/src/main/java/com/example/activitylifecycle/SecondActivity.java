package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Toast.makeText(this, "onCreate: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, TAG + "onStart: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, TAG + "onRestart: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, TAG + "onResume: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, TAG + "onPause: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, TAG + "onStop: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, TAG + "onDestroy: ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy: ");
    }

}