package com.examlple.android.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.greeting_text_view);
    }

    public void showGreetings(View view){

        String button_text;
        button_text=((Button)view).getText().toString();
        if(button_text.equals("second activity")){
            Intent intent = new Intent(this,Second_Activity.class);
            startActivity(intent);

        }
        else if(button_text.equals("third activity")){
            Intent intent = new Intent(this,Third_Activity.class);
            startActivity(intent);
        }
    }


}

