package com.example.atividade1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.atividade1.ui.login.LoginActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alterTxt();
            }
        });
    }

    public void alterTxt() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}