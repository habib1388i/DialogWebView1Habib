package com.example.dialogwebview1habib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

Button btn;
EditText edt1,edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.btn_login_lgn);
        edt1 = findViewById(R.id.edt_email_lgn);
        edt2 = findViewById(R.id.edt_password_lgn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() == 0){
                    edt1.setError("Email wajib diisi");
                }
                if (edt2.getText().length() == 0){
                    edt2.setError("Password wajib diisi");
                }else{
                    Intent pindah = new Intent(LoginActivity.this,HomeActivity.class);
                    pindah.putExtra("Welcome" + "Gmail",edt1.getText().toString());
//                    pindah.putExtra("Password",edt2.getText().toString());
                    startActivity(pindah);
                }
            }
        });
    }
}
