package com.example.corelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnklik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnklik = findViewById(R.id.btnklik);
        btnklik.setOnClickListener(this);
    }

    private void activity2(){startActivity(new Intent(getApplicationContext(),activity_kedua.class));}

    @Override
    public void onClick(View v) {
        activity2();
    }
}
