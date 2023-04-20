package com.ananas.serialization_codeoffuture_module4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edTxt_ID, edTxt_FromAddress, edTxt_FromTime, edTxt_Cost;

    private String sID, sAddress, sTime, sCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt_ID = findViewById(R.id.edTxt_ID);
        edTxt_FromAddress = findViewById(R.id.edTxt_FromAddress);
        edTxt_FromTime = findViewById(R.id.edTxt_FromTime);
        edTxt_Cost = findViewById(R.id.edTxt_Cost);
    }

    public void onClick(View view) {

        sID = edTxt_ID.getText().toString();
        sAddress = edTxt_FromAddress.getText().toString();
        sTime = edTxt_FromTime.getText().toString();
        sCost = edTxt_Cost.getText().toString();


        Railway railway = new Railway(sID, sAddress, sTime, sCost);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("user1", railway);
        startActivity(intent);


    }
}