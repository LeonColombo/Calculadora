package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerMultiplicacion implements View.OnClickListener{
    private MainActivity context;

    public ListenerMultiplicacion(MainActivity context) {
        this.context = context;
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, ActivityResultado.class);
        



    }
}
