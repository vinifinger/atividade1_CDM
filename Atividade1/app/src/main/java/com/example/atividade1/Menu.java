package com.example.atividade1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.atividade1.ui.login.LoginActivity;

public class Menu extends AppCompatActivity {

    private Button btn_login;
    private Button btn_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_inicio = (Button) findViewById(R.id.btn_inicio);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_login();
            }
        });

        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_inicio();
            }
        });
    }

    public void view_login() {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void view_inicio() {
        startActivity(new Intent(this, MainActivity.class));
    }
}