package com.professordiego.projetosorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random gerador = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView texto = findViewById(R.id.textoExibicao);
        int numero = gerador.nextInt(11);
        texto.setText("O número sorteado: " + String.valueOf(numero));
    }


}