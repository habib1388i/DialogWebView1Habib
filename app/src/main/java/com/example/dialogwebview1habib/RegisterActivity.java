package com.example.dialogwebview1habib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    Button btn;
    EditText edt1,edt2,edt3,edt4,edt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn = findViewById(R.id.btn_register_register);
        edt1 = findViewById(R.id.edt_first);
        edt2 = findViewById(R.id.edt_last);
        edt3 = findViewById(R.id.edt_email_register);
        edt4 = findViewById(R.id.edt_password_register);
        edt5 = findViewById(R.id.edt_password2_register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().length() == 0){
                    edt1.setError("Nama Wajib diisi");
                } if (edt2.getText().length() == 0){
                    edt2.setError("Nama Wajib diisi");
                } if (edt3.getText().length() == 0){
                    edt3.setError("Email Jangan Kosong");
                } if (edt4.getText().length() == 0){
                    edt4.setError("Password Harus diisi");
                } if (edt5.getText().length() == 0){
                    edt5.setError("Confirm password plis");
                } else {
                    startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                }
            }
        });
    }
}
