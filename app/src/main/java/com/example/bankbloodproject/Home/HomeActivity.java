package com.example.bankbloodproject.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bankbloodproject.R;
import com.example.bankbloodproject.dooner.doonerRegister;
import com.example.bankbloodproject.patient.PatientRegister;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnPatient=findViewById(R.id.btnPatient);
        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, PatientRegister.class));
                finish();
            }
        });
        Button btnDooner=findViewById(R.id.btnDooner);
        btnDooner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, doonerRegister.class));
                finish();
            }
        });


    }
}
