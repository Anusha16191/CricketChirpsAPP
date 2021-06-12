package com.example.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BT1= findViewById(R.id.BT1);
        TextView TV1=findViewById(R.id.TV1);
        EditText ET1=findViewById(R.id.ET1);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ET= ET1.getText().toString().trim();
                int num = Integer.parseInt(ET);
                float cal = num/3+4;
                TV1.setText(getString(R.string.result)+ cal + getString(R.string.unit));

            }
        });

    }
}