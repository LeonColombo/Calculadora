package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerSuma implements View.OnClickListener
{
    private MainActivity context;

    public ListenerSuma(MainActivity context) {
        this.context = context;
    }

    public MainActivity getContext() {
        return context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, ActivityResultado.class);
        Integer suma = Integer.valueOf(context.getNumero1().getText().toString()) + Integer.valueOf(context.getNumero2().getText().toString());
        intent.putExtra("SUMA", suma);

        context.startActivity(intent);

    }
}
