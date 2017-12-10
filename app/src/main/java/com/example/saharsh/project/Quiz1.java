package com.example.saharsh.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz1 extends AppCompatActivity {

    RadioButton r1,r2,r3,r4;
    Button b1,b2;
    TextView t1;
    static int score=0;     //Score is variable whose value is zero


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button20);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;        //It is important because if we do not then again when we open app score is resumed.
                if (r1.isChecked()) {
                    ++score;
                } else {
                    --score;
                }
                Intent i=new Intent(Quiz1.this,Quiz2.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Quiz1.this,QuizPlayer.class);
                startActivity(i);
                finish();

            }
        });
    }
}
