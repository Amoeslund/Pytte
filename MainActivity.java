package com.example.pytte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        final EditText atext = (EditText) findViewById(R.id.editText);
        final EditText btext = (EditText) findViewById(R.id.editText2);
        final TextView resulttext = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(atext.getText().toString());
                int b = Integer.parseInt(btext.getText().toString());
                String result = Double.toString(Math.sqrt(a*a + b*b));
                resulttext.setText(result);
            }
        });
    }
}
