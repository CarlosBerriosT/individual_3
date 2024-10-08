package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;
    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);
        edit_numero_uno = findViewById(R.id.num1);
        edit_numero_dos = findViewById(R.id.num2);


        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(suma(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(resta(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(multiplicacion(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_division =findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(division(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });



    }

    public int suma(int a, int b){

        return a+b;
    }

    public int resta(int a, int b){

        return a-b;
    }
    public int multiplicacion(int a, int b){

        return a*b;
    }
    public int division(int a, int b){

        return a/b;
    }
    }
