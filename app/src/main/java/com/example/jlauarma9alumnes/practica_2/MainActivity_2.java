package com.example.jlauarma9alumnes.practica_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity_2 extends AppCompatActivity {

    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        Button createButton = (Button)findViewById(R.id.create);
        createButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
// create an Intent using the current Activity
// and the Class to be created
                Intent i = new Intent(MainActivity.this,MainActivity_2.class);  // se li passa com a parametre la pàgina del principi i la del final
// MainActivity és el .java del porojecte HelloWorld, i MainActivity_2 és el .java d'aquest projecte

// pass the Intent to the Activity,
// using the specified action defined in StartPage
                startActivity(i);
            }
        });

        // ara s'hauria de crear el boto



    }
}
