package com.Danilo.Realidad;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        controlador();
    }

    public void controlador() {
        Button button = (Button)findViewById(R.id.btn);
//hago clic y se abre el 2
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Toast.makeText(Inicio.this, "Bienvenido",Toast.LENGTH_LONG).show();

                Intent ListSong = new Intent(Inicio.this, UnityPlayerActivity.class);
                startActivity(ListSong);
            }
        });
    }

}
