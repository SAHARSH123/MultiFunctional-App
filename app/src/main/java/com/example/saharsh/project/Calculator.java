package com.example.saharsh.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bmul,bequ,bzero,bdot,b35;
    EditText ans;
    Double v1,v2;
    Boolean add,sub,div,mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button)findViewById(R.id.button27);
        b2=(Button)findViewById(R.id.button28);
        b3=(Button)findViewById(R.id.button30);
        b4=(Button)findViewById(R.id.button23);
        b5=(Button)findViewById(R.id.button24);
        b6=(Button)findViewById(R.id.button25);
        b7=(Button)findViewById(R.id.button19);
        b8=(Button)findViewById(R.id.button20);
        b9=(Button)findViewById(R.id.button21);
        bzero=(Button)findViewById(R.id.button31);
        bdot=(Button)findViewById(R.id.button32);
        bequ=(Button)findViewById(R.id.button13);
        badd=(Button)findViewById(R.id.button29);
        bsub=(Button)findViewById(R.id.button26);
        bdiv=(Button)findViewById(R.id.button34);
        bmul=(Button)findViewById(R.id.button22);
        b35=(Button)findViewById(R.id.button35);

        ans=(EditText)findViewById(R.id.editText6);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Calculator.this,Third.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"9");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans.setText(null);
            }
        });

        bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(v1+v2+"");
                    add=false;
                }

                if(sub==true)
                {
                    ans.setText(v1-v2+"");
                    sub=false;
                }

                if(div==true)
                {
                    ans.setText(v1/v2+"");
                    div=false;
                }

                if(mul==true)
                {
                    ans.setText(v1*v2+"");
                    mul=false;
                }
            }
        });

    }
}
