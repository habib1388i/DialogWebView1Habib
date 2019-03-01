package com.example.dialogwebview1habib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv1 = findViewById(R.id.tv_tv);
//        tv2 = findViewById(R.id.tv_tv2);

        tv1.setText("welcome " + getIntent().getStringExtra("Gmail"));
//        tv2.setText(getIntent().getStringExtra("Password"));

    }

}
