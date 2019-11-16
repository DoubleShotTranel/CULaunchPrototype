package com.example.culaunchprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RequestActivity extends AppCompatActivity
{
    private EditText requestTitleET, disciptionET, emailET, phoneET, fNameET, lNameET;
    private static Request newRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        this.requestTitleET = this.findViewById(R.id.requestTitleET);
        this.disciptionET = this.findViewById(R.id.discriptionET);
        this.emailET = this.findViewById((R.id.emailET));
        this.phoneET = this.findViewById(R.id.phoneET);
        this.fNameET = this.findViewById(R.id.fNameET);
        this.lNameET = this.findViewById(R.id.lNameET);
    }

    public void onAddButtonClick(View v)
    {
        String title = this.requestTitleET.getText().toString();
        String discription = this.disciptionET.getText().toString();
        String email = this.emailET.getText().toString();
        int phone = Integer.parseInt(this.phoneET.getText().toString());
        String fName = this.fNameET.getText().toString();
        String lName = this.lNameET.getText().toString();
        this.newRequest = new Request(title, discription, email, phone, fName, lName);

        String info = this.newRequest.getString();
        Intent transferData = new Intent(this, volunteerList.class);
        transferData.putExtra(Intent.EXTRA_TEXT, info);
        startActivity(transferData);
    }
}
