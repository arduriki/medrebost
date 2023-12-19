package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.database.MedicamentsDatabase;
import com.teknos.m8uf2.jardura.databinding.ActivityMedDetailBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

public class MedDetailActivity extends AppCompatActivity {

    private ActivityMedDetailBinding activityMedDetailBinding;
    private Medicaments medicament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_detail);

        activityMedDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_med_detail);

        this.medicament = (Medicaments) getIntent().getSerializableExtra("Medicament");

        activityMedDetailBinding.setMedicina(medicament);

        Button editBtn = findViewById(R.id.editBtn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EditMedActivity.class);
                i.putExtra("Medicament", medicament);
                v.getContext().startActivity(i);
            }
        });

        // Barcode scan button
        FloatingActionButton scanButton = findViewById(R.id.scanBtn);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch QR code scanner
                Intent i = new Intent(getApplicationContext(), QrCodeScannerActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Reload the Medicament object from the database
        new Thread(new Runnable() {
            @Override
            public void run() {
                MedicamentsDatabase db = MedicamentsDatabase.getInstance(getApplicationContext());
                final Medicaments updatedMedicament = db.getMedicamentDAO().getMedicamentById(medicament.getId());

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        medicament = updatedMedicament;
                        activityMedDetailBinding.setMedicina(medicament);
                    }
                });
            }
        }).start();
    }
}