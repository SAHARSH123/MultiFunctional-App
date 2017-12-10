package com.example.saharsh.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class QuizPlayer extends AppCompatActivity {

    RelativeLayout myLayout;
    AnimationDrawable animationDrawable;
    Button b15,b16,b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_player);

        myLayout=(RelativeLayout)findViewById(R.id.myLayout);


        animationDrawable=(AnimationDrawable)myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(QuizPlayer.this,Third.class);
                startActivity(i);
                finish();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(QuizPlayer.this,Effect.class);
                startActivity(i);
                finish();

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(QuizPlayer.this,Quiz1.class);
                startActivity(i);
                finish();


            }
        });

    }
}
