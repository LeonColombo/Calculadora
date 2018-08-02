package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button botonsuma, botonresta, botondivision, botonmultiplicacion;
    private EditText numero1, numero2;
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerDivision listenerDivision;
    private ListenerMultiplicacion listenerMultiplicacion;

    public EditText getNumero1() {
        return numero1;
    }

    public EditText getNumero2() {
        return numero2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botonsuma = findViewById(R.id.botonsuma);
        botonresta = findViewById(R.id.botonresta);
        botondivision = findViewById(R.id.botondivision);
        botonmultiplicacion = findViewById(R.id.botonmultipicacion);

        listenerSuma = new ListenerSuma(this);
        botonsuma.setOnClickListener(listenerSuma);

        listenerResta = new ListenerResta(this);
        botonresta.setOnClickListener(listenerResta);

        listenerDivision = new ListenerDivision(this);
        botondivision.setOnClickListener(listenerDivision);

        listenerMultiplicacion = new ListenerMultiplicacion(this);
        botonmultiplicacion.setOnClickListener(listenerMultiplicacion);



    }
}
