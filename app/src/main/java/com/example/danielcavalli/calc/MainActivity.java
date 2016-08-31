package com.example.danielcavalli.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Double parameter;
    public Double parameter2;
    public String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewById(R.id.)
    }
    public void setText(View v)
    {
        Button b = (Button) v;
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(t.getText() +""+ b.getText());
    }
    public void operation(View v)
    {
        Button b = (Button) v;
        TextView t = (TextView) findViewById(R.id.textView);
        parameter = Double.parseDouble(t.getText().toString());
        operator = b.getText().toString();
        t.setText("");
    }
    public void equal(View v){
        TextView t = (TextView) findViewById(R.id.textView);
        parameter2 = Double.parseDouble(t.getText().toString());
        switch (operator)
        {
            case"+":
                t.setText(String.valueOf(parameter + parameter2));
                break;

            case"-":
                t.setText(String.valueOf(parameter - parameter2));
                break;

            case"*":
                t.setText(String.valueOf(parameter * parameter2));
                break;

            case"/":
                t.setText(String.valueOf(parameter / parameter2));
                break;

            case"%":
                Double a = parameter * (parameter2/100);
                Log.d("Main Activity", a.toString());
                t.setText(a.toString());
                break;
        }
    }
    public void clearLast(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        String b = t.getText().toString();
        String a = b.substring(0,b.length() - 1);
        t.setText(a);
    }
    public void clearText(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText("");
    }
    public void clearAll(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText("");
        parameter = Double.NaN;
        parameter2 = Double.NaN;
        operator = "";
    }

    public void oneAbove (View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        Double a = Double.parseDouble(t.getText().toString());
        a = 1/a;
        Log.e("Main Activity", a.toString());
        t.setText(a.toString());
    }


    public void invertSignal (View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        Double a = Double.parseDouble(t.getText().toString());

        if(a >= 0)
            t.setText("-" + a.toString());
        else {
            String b = a.toString();
            b = b.substring(1);
            t.setText(b);
        }
    }
    public void squareRoot (View v) {
        TextView t = (TextView) findViewById(R.id.textView);
        Double a = Double.parseDouble(t.getText().toString());
        a = Math.sqrt(a);
        t.setText(a.toString());
    }

}
