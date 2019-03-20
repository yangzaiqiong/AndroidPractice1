package com.example.androidpractice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.out.println("onCreate");
        Log.i("MainActivityLife", "调用onCreate() ");
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        //System.out.println("onStart");
        Log.i("MainActivityLife", "调用onStart() ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        //System.out.println("onResume");
        Log.i("MainActivityLife", "调用onResume() ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        //System.out.println("onPause");
        Log.i("MainActivityLife", "调用onPause() ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        //System.out.println("onStop");
        Log.i("MainActivityLife", "调用onStop() ");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        //System.out.println("onRestart");
        Log.i("MainActivityLife", "调用onRestart() ");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        //System.out.println("onDestroy");
        Log.i("MainActivityLife", "调用onDestroy() ");
        super.onDestroy();
    }
}
