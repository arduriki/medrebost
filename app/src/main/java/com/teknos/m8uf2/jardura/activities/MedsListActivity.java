package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;

public class MedsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_list);

        FloatingActionButton addButton = findViewById(R.id.addBtn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch QR code scanner
                Intent i = new Intent(getApplicationContext(), QrCodeScannerActivity.class);
                startActivity(i);
            }
        });
    }
}