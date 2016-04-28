package com.example.joel.me_animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView jwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jwelcome=(TextView)findViewById(R.id.welcome);

        //animation for 3 seconds
        Animation slideup= AnimationUtils.loadAnimation(this, R.anim.animationfile);
        jwelcome.startAnimation(slideup);

        final Thread splashscreen=new Thread()
        {
            public void run()
            {
                try {
                    sleep(5 * 1000);
                    Intent i=new Intent(MainActivity.this,Dashboard.class);
                    startActivity(i);

                }
                catch (Exception e)
                {

                }
            }
        };splashscreen.start();




    }
}
