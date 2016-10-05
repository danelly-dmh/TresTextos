package com.example.danelly.trestextos;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2,e3;
    private TextView out;
    private Button show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.texto1);
        e2 = (EditText) findViewById(R.id.texto2);
        e3 = (EditText) findViewById(R.id.texto3);
        out = (TextView) findViewById(R.id.salida);
        show = (Button) findViewById(R.id.btn);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textos = null;
                textos= e1.getText().toString() +e2.getText().toString() +e3.getText().toString();
                out.setText(textos);
            }
        });

    }
}
