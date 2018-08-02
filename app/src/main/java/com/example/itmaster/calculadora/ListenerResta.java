package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerResta implements View.OnClickListener {

    private MainActivity context;

    public ListenerResta(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, ActivityResultado.class);

        Integer resta = Integer.valueOf(context.getNumero1().getText().toString()) - Integer.valueOf(context.getNumero2().getText().toString());
        intent.putExtra("RESTA", resta);


        context.startActivity(intent);
    }
}
