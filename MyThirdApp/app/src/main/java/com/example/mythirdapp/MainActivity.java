package com.example.mythirdapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText txtLogin;
    private EditText txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Inicio");
        getSupportActionBar().setSubtitle("Subtitulo");
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtLogin = (EditText) findViewById(R.id.txtUsuario);
        txtPass = (EditText) findViewById(R.id.txtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = txtLogin.getText().toString();
                Toast.makeText(getApplicationContext(),"El usuario es "+usuario + " y el password es ******",Toast.LENGTH_LONG)
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),"Se seleccione la opcion 1",Toast.LENGTH_LONG).show();
                return true;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),"Se seleccione la opcion 2",Toast.LENGTH_LONG).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(),"Se seleccione la opcion 3",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}