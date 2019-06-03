package br.senai.rn.conversor.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.senai.rn.conversor.R;

public class calcu extends AppCompatActivity {

    private EditText campoCelsiu;
    private TextView resuK;
    private TextView resuF;
    private Button botao1;
    private Button botao2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        campoCelsiu = findViewById(R.id.phone);
        resuK = findViewById(R.id.textView2);
        resuF = findViewById(R.id.textView3);
        botao1 = findViewById(R.id.button_Kelvin);
        botao2 = findViewById(R.id.button_Fahrenheit);
    }

    private void definirEventos() {
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converterKelvin();
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converterFahrenheit();
            }
        });
    }

    private void converterKelvin() {
        float medida = Float.valueOf(campoCelsiu.getText().toString());
        float v = (float)(medida + 273.15);
        resuK.setText(v+"K");
    }

    private void converterFahrenheit() {
        float medida = Float.valueOf(campoCelsiu.getText().toString());
        float v = (float) (medida*9/5)+32;
        resuF.setText(v+"ºF");
    }

}
