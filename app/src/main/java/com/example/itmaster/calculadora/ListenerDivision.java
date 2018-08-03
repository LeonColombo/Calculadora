package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerDivision implements View.OnClickListener {

    private MainActivity context;

    public ListenerDivision(MainActivity context) {
        this.context = context;
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, ActivityResultado.class);

        Integer division = Integer.valueOf(context.getNumero1().getText().toString()) / Integer.valueOf(context.getNumero2().getText().toString());

        intent.putExtra("RESULTADO", division);

        context.startActivity(intent);

    }
}
