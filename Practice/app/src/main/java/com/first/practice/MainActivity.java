package com.first.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt,text;
    Button btn , button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button1);
        txt = findViewById(R.id.textView1);
        text = findViewById(R.id.textView2);
        button = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Muhammad (S.A.W) is the last Prophet of Allah");
                txt.append("   Muhammad (S.A.W) is the last Prophet of Allah");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("        ALLAH hu Akbar");
            }
        });

    }
}