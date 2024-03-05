package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

EditText regNumber,fullName,Department,Level,Faculty,Country,State;
MaterialButton submit_area;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regNumber =findViewById(R.id.regNumber);
        fullName =findViewById(R.id.fullName);
        Department =findViewById(R.id.Department);
        Level =findViewById(R.id.Level);
        Faculty=findViewById(R.id.Faculty);
        Country=findViewById(R.id.Country);
        State =findViewById(R.id.State);

        submit_area = findViewById(R.id.submit_area);


        submit_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regNumber1 = regNumber.getText().toString();
                Toast.makeText(MainActivity.this, "reg number is"+regNumber1, Toast.LENGTH_SHORT).show();

            }
        });
    }
}