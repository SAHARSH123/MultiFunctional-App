package com.example.saharsh.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    RelativeLayout myLayout;
    AnimationDrawable animationDrawable;

    Button b3,b4;
    EditText e3,e4,e5;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        myLayout=(RelativeLayout)findViewById(R.id.myLayout);


        animationDrawable=(AnimationDrawable)myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e3.getText().toString();
                s2=e4.getText().toString();
                s3=e5.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals(""))
                {
                    Toast.makeText(Second.this, "Fill All The Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("net",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists camp(name varchar, password varchar,email varchar)");
                    String s4="select * from camp where name='"+s1+"' and password='"+s2+"'and email='"+s3+"'";
                    Cursor cursor = data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Second.this, "User already exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into camp values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Second.this, "SIGNUP SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(Second.this,First.class);
                        startActivity(i);
                        finish();

                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this,First.class);
                startActivity(i);
                finish();
            }
        });
    }
}
