package com.example.saharsh.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz6 extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);
        t1=(TextView)findViewById(R.id.textView9);
        b1=(Button)findViewById(R.id.button25);
        b2=(Button)findViewById(R.id.button26);
        b3=(Button)findViewById(R.id.button27);
        b4=(Button)findViewById(R.id.button28);

        t1.setText("Your score is "+Quiz1.score);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Quiz6.this,Third.class);
                startActivity(i);
                finish();
            }
        });

    }

    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }

    public void browser2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(browserIntent);
    }
    public void browser3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        startActivity(browserIntent);
    }

}
