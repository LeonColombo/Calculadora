package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerVolver implements View.OnClickListener {

    private ActivityResultado context;

    public ListenerVolver(ActivityResultado context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        context.onBackPressed();

    }
}
