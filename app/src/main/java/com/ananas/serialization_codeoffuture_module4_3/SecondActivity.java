package com.ananas.serialization_codeoffuture_module4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView_2act;
    private Railway railway;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.btnBack);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) railway = (Railway) bundle.getSerializable("user1");

        textView_2act = findViewById(R.id.textView_2act);

        textView_2act.setText("ID пользователя: " + railway.getID() + "\n\n"
                + "Адрес отправления: " + railway.getAddress() + "\n\n"
                + "Время отправления: " + railway.getTime() + "\n\n"
                + "Цена билета: " + railway.getCost() + "\n\n");

        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}