package com.example.aluno.aplicativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }


   public void clickbtnOk(View view){
        EditText editTextName = (EditText) findViewById(R.id.Name);
        EditText editTextsobrenome = (EditText) findViewById(R.id.sobrenome);

        String name = "Seja bem vindo " + editTextName.getText().toString();

        name += " " + editTextsobrenome.getText().toString();

       Toast.makeText(this,name,Toast.LENGTH_LONG).show();


   }
}
