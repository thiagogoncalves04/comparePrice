package com.example.dell.compareprice;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

   private Button botaoCalcular;
   private Button resultadoPeso;
   private Button resultadoVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoCalcular = findViewById(R.id.button_calcular_id);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularClicado();


            }
        });
    }

        public void calcularClicado() {
            Intent intent = new Intent(this, ConsultorActivity.class);
            startActivity(intent);

            //            FragmentManager manager = getSupportFragmentManager();
//            FragmentTransaction transaction = manager.beginTransaction();
//            transaction.replace(R.id.container_fragment_id, new PesoFragment());
//            transaction.commit();

        }
    }

