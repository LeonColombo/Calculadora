package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {


    private TextView resultado;
    private Button volver;
    private ListenerVolver listenerVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        listenerVolver = new ListenerVolver(this);
        volver = findViewById(R.id.volver);
        resultado = findViewById(R.id.resultado);

        volver.setOnClickListener(listenerVolver);

        String solucion = String.valueOf(bundle.getInt("RESULTADO"));
        resultado.setText(solucion);




    }
}
