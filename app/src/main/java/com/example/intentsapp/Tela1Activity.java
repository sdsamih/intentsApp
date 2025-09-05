package com.example.intentsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela1);

        String nome = getIntent().getStringExtra("nome");
        TextView txt_titulo = findViewById(R.id.txt_titulo);
        txt_titulo.setText(nome +", você chegou na tela 1");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn_voltar = findViewById(R.id.btn_voltar);
        btn_voltar.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
    }
}