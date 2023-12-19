package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.databinding.ActivityMedDetailBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

public class MedDetailActivity extends AppCompatActivity {

    private ActivityMedDetailBinding activityMedDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_detail);

        activityMedDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_med_detail);

        Medicaments medicament = (Medicaments) getIntent().getSerializableExtra("Medicament");

        activityMedDetailBinding.setMedicina(medicament);
    }
}