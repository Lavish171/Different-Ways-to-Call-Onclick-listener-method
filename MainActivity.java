package com.example.truecitiizenquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button falsebutton;
    Button truebutton;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        falsebutton=findViewById(R.id.falsebutton);
        truebutton=findViewById(R.id.truebutton);
        /*falsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"False Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        truebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"True Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });*/
         falsebutton.setOnClickListener(this);//register our event to the on click listener
         truebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       switch (view.getId())
       {
           case R.id.falsebutton:
               Toast.makeText(getApplicationContext(),"False Button Clicked",Toast.LENGTH_SHORT).show();
           case R.id.truebutton:
               Toast.makeText(getApplicationContext(),"True Button Clicked",Toast.LENGTH_SHORT).show();
       }
    }
}
