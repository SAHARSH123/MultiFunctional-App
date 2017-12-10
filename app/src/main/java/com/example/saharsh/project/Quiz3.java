package com.example.saharsh.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {

    RadioButton r1,r2,r3,r4;
    Button b2;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        b2=(Button)findViewById(R.id.button22);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r4.isChecked()) {
                    ++Quiz1.score;
                } else {
                    --Quiz1.score;
                }
                Intent i=new Intent(Quiz3.this,Quiz5.class);
                startActivity(i);
                finish();
            }
        });
    }
}

