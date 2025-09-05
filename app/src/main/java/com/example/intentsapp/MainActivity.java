package com.example.intentsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnTela1 = findViewById(R.id.btn_tela1);
        Button btnTela2 = findViewById(R.id.btn_tela2);

        EditText editTextNome = findViewById(R.id.editText_nome);

        btnTela1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Tela 1", Toast.LENGTH_SHORT).show();
                        String nome = editTextNome.getText().toString();
                        Intent intent = new Intent(MainActivity.this, Tela1Activity.class);
                        intent.putExtra("nome", nome);
                        startActivity(intent);
                    }
                }
        );

        btnTela2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Tela 2", Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}