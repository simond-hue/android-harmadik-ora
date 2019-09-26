package com.example.maozedong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button button_elso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

        button_elso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent masodik_activity = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(masodik_activity);
                finish();
            }
        });
    }

    public void init(){
        button_elso = findViewById(R.id.button_elso);
    }
}
