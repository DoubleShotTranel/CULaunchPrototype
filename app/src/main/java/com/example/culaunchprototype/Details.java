package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView detailTitle = this.findViewById(R.id.detailTitle);
        TextView descriptionTitle = this.findViewById(R.id.descriptionDetail);
        TextView nameDetail = this.findViewById(R.id.nameDetail);
        TextView phoneDetail = this.findViewById(R.id.phoneDetail);
        TextView emailDetail = this.findViewById(R.id.emailDetail);


        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);
        String description = PostActivity.newRequest.getDescription();
        String Name = PostActivity.newRequest.getfName() + " " + PostActivity.newRequest.getlName() ;
        detailTitle.setText(text);
        descriptionTitle.setText(description);
        nameDetail.setText(Name);
        String email = PostActivity.newRequest.getEmail();
        emailDetail.setText(email);
        String phoneNum = Integer.toString(PostActivity.newRequest.getPhone());
        phoneDetail.setText(phoneNum);
    }
}
