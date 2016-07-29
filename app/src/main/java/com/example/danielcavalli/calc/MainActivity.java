package com.example.danielcavalli.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
-
            case"-":
                t.setText(String.valueOf(parameter - parameter2));
            break;

            case"*":
                t.setText(String.valueOf(parameter * parameter2));
            break;

            case"/":
                t.setText(String.valueOf(parameter / parameter2));
            break;
        }
    }

}
