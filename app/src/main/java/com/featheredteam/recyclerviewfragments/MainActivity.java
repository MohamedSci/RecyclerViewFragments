package com.featheredteam.recyclerviewfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edN, edP;
    TextView tvnd, tvphd;
    Button btnAdd;
    ImageView ivDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edN = findViewById(R.id.edN);
        edP = findViewById(R.id.edP);
        tvnd = findViewById(R.id.tvnd);
        tvphd = findViewById(R.id.tvphd);
        ivDetail = findViewById(R.id.ivDetail);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        
            }
        });
    }
}