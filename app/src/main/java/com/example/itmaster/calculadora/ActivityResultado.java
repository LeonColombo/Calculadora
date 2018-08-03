package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {


    private TextView resultado;
    private Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        resultado = findViewById(R.id.resultado);

        String solucion = String.valueOf(bundle.getInt("RESULTADO"));
        resultado.setText(solucion);




    }
}
