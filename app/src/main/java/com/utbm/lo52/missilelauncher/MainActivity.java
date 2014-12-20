package com.utbm.lo52.missilelauncher;

import android.annotation.TargetApi;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucnher);

        Button up = (Button) findViewById(R.id.up);
        Button down = (Button) findViewById(R.id.down);
        Button left = (Button) findViewById(R.id.left);
        Button right = (Button) findViewById(R.id.right);
        Button fire = (Button) findViewById(R.id.fire);
        AnimationDrawable animationDrawable;

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundResource(R.drawable.up_pressed);
                AnimationDrawable animationDrawable = (AnimationDrawable) v.getBackground();
                animationDrawable.stop();
                animationDrawable.start();
                //up();
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundResource(R.drawable.down_pressed);
                AnimationDrawable animationDrawable = (AnimationDrawable) v.getBackground();
                animationDrawable.stop();
                animationDrawable.start();
                //down();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundResource(R.drawable.left_pressed);
                AnimationDrawable animationDrawable = (AnimationDrawable) v.getBackground();
                animationDrawable.stop();
                animationDrawable.start();
                //left();
            }
        });


        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundResource(R.drawable.right_pressed);
                AnimationDrawable animationDrawable = (AnimationDrawable) v.getBackground();
                animationDrawable.stop();
                animationDrawable.start();
                //right();
            }
        });



        fire.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                v.setBackgroundResource(R.drawable.fire_anim);
                AnimationDrawable animationDrawable = (AnimationDrawable) v.getBackground();
                animationDrawable.stop();
                animationDrawable.start();
                //fire();
                //stop(); // I'm still wondering if that's necessary ?_?
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
