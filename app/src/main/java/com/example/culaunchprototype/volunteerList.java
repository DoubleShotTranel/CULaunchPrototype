package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class volunteerList extends AppCompatActivity
{
    private EditText requestTitleET, discriptionET, emailET, phoneET;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        Intent tranferData = getIntent();
        Button first = new Button(this);
        String text = tranferData.getStringExtra(Intent.EXTRA_TEXT);

        first.setText(text);
        int i = 250;

        //linearLayout.setHeight(i);
        first.setHeight (i);

        linearLayout.addView(first);
    }
}
