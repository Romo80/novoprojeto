package edu.android.trainning.novoprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate","Estou acordando!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("OnStart","Estou abrindo os olhos!");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("OnResume","Acordei!");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    public void apagarActivity(View v){
        Log.i("OnDestry","É hora de dizer tchau!!");
        finish();
    }
}
