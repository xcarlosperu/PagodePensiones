package com.example.upch_registropagos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
    }

    public void cargar(View v){

        Log.i("====>","En el metodo cargar()");

        startActivity(new Intent(this,MainActivity.class));
    }

}
