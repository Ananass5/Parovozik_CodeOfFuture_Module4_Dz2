package com.ananas.serialization_codeoffuture_module4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView_2act;
    private Railway railway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) railway = (Railway) bundle.getSerializable("user1");

        textView_2act = findViewById(R.id.textView_2act);

        textView_2act.setText("ID пользователя: " + railway.getID() + "\n\n"
                + "Адрес отправления: " + railway.getAddress() + "\n\n"
                + "Время отправления: " + railway.getTime() + "\n\n"
                + "Цена билета: " + railway.getCost() + "\n\n");


    }
}