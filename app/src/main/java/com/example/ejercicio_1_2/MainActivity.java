package com.example.ejercicio_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
    }

    public void Enviar(View view){
        Intent i = new Intent(this, ActivitySegundaPantalla.class);
        i.putExtra("dato1",txtNombre.getText().toString());
        i.putExtra("dato2",txtApellido.getText().toString());
        i.putExtra("dato3",txtEdad.getText().toString());
        i.putExtra("dato4",txtCorreo.getText().toString());
        startActivity(i);
    }
}