package com.example.dialogwebview1habib;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

WebView webView;
EditText edtInput;
Button btnSearch;


AlertDialog.Builder dialog;
private View dialogView;
LayoutInflater inflater;
FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.web_view);
        edtInput = findViewById(R.id.edt_input);
        btnSearch = findViewById(R.id.btn_search);
        floatingActionButton = findViewById(R.id.fab_login);




        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogshow();
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("http://www." + edtInput.getText().toString() + ".com");
                if (edtInput.getText().toString().length() == 0) {
                    edtInput.setError("url wajib diisi");
                }
            }
        });

    }


    private void dialogshow() {
        dialog = new AlertDialog.Builder(this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.activity_login,null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);

        final Button btnlogin;
        final EditText edt1, edt2;

        btnlogin = dialogView.findViewById(R.id.btn_login_lgn);
        edt1 = dialogView.findViewById(R.id.edt_email_lgn);
        edt2 = dialogView.findViewById(R.id.edt_password_lgn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() == 0){
                    edt1.setError("Email wajib diisi");
                }
                if (edt2.getText().length() == 0){
                    edt2.setError("Password wajib diisi");
                }else{
                    Intent pindah = new Intent(MainActivity.this,HomeActivity.class);
                    pindah.putExtra( "Gmail",edt1.getText().toString());
//                    pindah.putExtra("Password",edt2.getText().toString());
                    startActivity(pindah);
                }

            }
        });
        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


}

// btnlogin.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        if (edt1.getText().length() == 0) {
//        edt1.setError("Email harus diisi");
//        }
//        else if (edt2.getText().length() == 0) {
//        edt2.setError("Password Wajib Diisi");
//
//        }
//
//        else  {
//        Intent pindah = new Intent(MainActivity.this,HomeActivity.class);
//        pindah.putExtra("Gmail",edt1.getText().toString());
//        pindah.putExtra("Password",edt2.getText().toString());
//        startActivity(pindah);
//        }
//        }
//        });
//        }
