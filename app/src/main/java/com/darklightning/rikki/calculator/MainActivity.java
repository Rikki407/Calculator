package com.darklightning.rikki.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    TextView space;
    float a=0,b=0;
    boolean madd,msub,mpro,mdiv,mper;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        space = (TextView) findViewById(R.id.space);


    }
    public void one(View v)
    {
        space.append("1");

    }
    public void two(View v)
    {
        space.append("2");
    }
    public void three(View v)
    {
        space.append("3");
    }
    public void four(View v)
    {
        space.append("4");
    }
    public void five(View v)
    {
        space.append("5");
    }
    public void six(View v)
    {
        space.append("6");
    }
    public void seven(View v)
    {
        space.append("7");
    }
    public void eight(View v)
    {
        space.append("8");
    }
    public void nine(View v)
    {
        space.append("9");
    }
    public void zero(View v)
    {
        space.append("0");
    }
    public void dec(View v)
    {
        space.append(".");
    }

    public void add(View v)
    {
        a=Float.parseFloat(space.getText()+"");
        madd=true;
        space.setText(null);
    }
    public void subtract(View v)
    {
        a=Float.parseFloat(space.getText()+"");
        msub=true;
        space.setText(null);
    }
    public void divide(View v)
    {
        a=Float.parseFloat(space.getText()+"");
        mdiv=true;
        space.setText(null);
    }
    public void product(View v)
    {
        a=Float.parseFloat(space.getText()+"");
        mpro=true;
        space.setText(null);
    }
    public void clearscr(View v)
    {
        a=b=0;
        space.setText(null);
    }
    public void del(View v)
    {
        String text = space.getText().toString();
        space.setText(text.substring(0, text.length() - 1));
    }
    public void per(View v)
    {
        a=Float.parseFloat(space.getText()+"");
        mper=true;
        space.setText(null);
    }
    public void equal(View v)
    {

        b=Float.parseFloat(space.getText()+"");
        if(madd == true)
        {
            space.setText(a+b+"");
            madd=false;
        }
        else if (msub == true)
        {
            space.setText(a-b+"");
            msub=false;
        }
        else if(mdiv == true)
        {
            space.setText(a/b+"");
            mdiv=false;
        }
        else if(mpro == true)
        {
            space.setText(a*b+"");
            mpro=false;
        }
        else if(mper == true)
        {
            space.setText(a/b*100+"");
            mper=false;
        }

    }

}
