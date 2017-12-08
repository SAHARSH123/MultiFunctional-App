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

public class First extends AppCompatActivity {

    RelativeLayout myLayout;
    AnimationDrawable animationDrawable;
    Button b1,b2;
    EditText e1,e2;
    String s3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        myLayout=(RelativeLayout)findViewById(R.id.myLayout);


        animationDrawable=(AnimationDrawable)myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(First.this,Second.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if(s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(First.this, "Fill The Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("net",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists camp(name varchar, password varchar,email varchar)");
                    String s4="select * from camp where name='"+s1+"' and password='"+s2+"'and email='"+s3+"'";
                    Cursor cursor = data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(First.this, "Login successful", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(First.this,Third.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(First.this, "Invalid Username Password", Toast.LENGTH_SHORT).show();
                        e1.setText("");
                        e2.setText("");
                    }
                }
            }
        });
    }
}
