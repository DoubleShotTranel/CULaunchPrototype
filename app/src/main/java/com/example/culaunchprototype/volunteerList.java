package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
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

        TextView title = new TextView(this);
        title.setText("Volunteer Opportunities");
        title.setTextColor(Color.parseColor("#009688"));
        title.setTextSize(32);
        title.setGravity(17);
        linearLayout.addView(title);

        Intent transferData = getIntent();
        Button first = new Button(this);
        String text = transferData.getStringExtra(Intent.EXTRA_TEXT);
        first.setText(text);
        int i = 250;

        //linearLayout.setHeight(i);
        first.setHeight (i);
        linearLayout.addView(first);

        //on click
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDetailButtonClick();
            }
        });

    }
    public void onDetailButtonClick()

    {
        Intent intent = new Intent(this, Details.class);
        intent.putExtra(Intent.EXTRA_TEXT, PostActivity.newRequest.getTitle());
        startActivity(intent);
    }
}
