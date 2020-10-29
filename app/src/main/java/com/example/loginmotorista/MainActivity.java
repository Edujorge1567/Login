package com.example.loginmotorista;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<et_> extends AppCompatActivity {
    EditText et_username, et_password;
    Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    et_username = findViewById(R.id.et_username);
    et_password = findViewById(R.id.et_password);
    bt_entrar = findViewById(R.id.bt_entrar);

    bt_entrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String username = et_username.getText().toString();
            String password = et_password.getText().toString();

            if (username.equals("User") && password.equals("pass")){
                Intent i = new Intent ( packageContextMainActivity.this, LoginOkActivity);
                startActivity(i);

            }
            else{
                Intent i = new Intent(MainActivity.this,LoginErradoActivity );
                startActivity(i);
            }
        }
    }

    }
}
