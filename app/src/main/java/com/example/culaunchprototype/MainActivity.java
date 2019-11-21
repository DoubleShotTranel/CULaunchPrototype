package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String hi = "hi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRequestButtonPressed(View v)
    {
        openActivityRequest();
    }

    public void onListButtonPressed(View v)
    {
        openListView();
    }

    public void openActivityRequest()
    {
        Intent intent = new Intent (this, PostActivity.class);
        startActivity(intent);
    }

    public void openListView()
    {
        Intent intent = new Intent (this, volunteerList.class);
        startActivity(intent);
    }
}
