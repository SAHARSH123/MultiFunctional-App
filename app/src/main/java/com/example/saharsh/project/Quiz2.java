package com.example.saharsh.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {

    RadioButton r1,r2,r3,r4;
    Button b2;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        b2=(Button)findViewById(R.id.button21);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r4.isChecked()) {
                    ++Quiz1.score;
                } else {
                    --Quiz1.score;
                }
                Intent i=new Intent(Quiz2.this,Quiz3.class);
                startActivity(i);
                finish();
            }
        });
    }
}

