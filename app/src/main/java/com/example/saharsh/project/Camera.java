package com.example.saharsh.project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Camera extends AppCompatActivity {
    RelativeLayout myLayout;
    AnimationDrawable animationDrawable;
    Button b13,b14;
    ImageView i1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        myLayout=(RelativeLayout)findViewById(R.id.myLayout);


        animationDrawable=(AnimationDrawable)myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        i1=(ImageView)findViewById(R.id.imageView2);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Camera.this,Third.class);
                startActivity(i);
                finish();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        i1.setImageBitmap(b);
    }
}
