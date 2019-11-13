package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRequestButtonPressed(View v)
    {
        openActivityRequest();
    }

    public void openActivityRequest()
    {
        Intent intent = new Intent (this, RequestActivity.class);
        startActivity(intent);
    }
}
