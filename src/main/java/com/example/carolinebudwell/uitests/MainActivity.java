package com.example.carolinebudwell.uitests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {

        if (view.getId() == R.id.buttonClear) {
            TextView viewHello = (TextView) findViewById(R.id.textViewHello);
            if (viewHello.getText() == getString(R.string.hello_world)) {
                viewHello.setText("Clear");
            } else {
                viewHello.setText(getString(R.string.hello_world));
            }

        }
    }


}
