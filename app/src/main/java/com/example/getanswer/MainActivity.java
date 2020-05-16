package com.example.getanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Ask=findViewById(R.id.ask);

        final ImageView Ball = findViewById(R.id.ball);

        final int[] ball_array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random Number_generator = new Random();
                int number = Number_generator.nextInt(5);
                Ball.setImageResource(ball_array[number]);
            }
        });




    }
}
