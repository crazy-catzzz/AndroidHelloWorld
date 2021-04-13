package com.crazycatzzz.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button helloButton;

    private boolean helloActive = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = (TextView) findViewById(R.id.helloWorldText);
        helloButton = (Button) findViewById(R.id.helloButton);
    }

    public void onHelloButtonClick (View v) {

        if(!this.helloActive) {
            helloText.setText("Sup World!");
            helloButton.setText("hello");
            this.helloActive = true;
        }
        else {
            helloText.setText("Hello World!");
            helloButton.setText("sup");
            this.helloActive = false;
        }
    }
}