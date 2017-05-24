package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBall= (ImageView)findViewById(R.id.image_8ball);

        final int[] ballArray={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        final Random randomNum=new Random();

        Button myButton=(Button)findViewById(R.id.askbutton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=randomNum.nextInt(5);

                eightBall.setImageResource(ballArray[number]);
            }
        });
    }
}
