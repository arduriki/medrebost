package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.databinding.ActivityAddNewMedicineBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler;
import com.teknos.m8uf2.jardura.view.AppViewModel;

public class AddNewMedicineActivity extends AppCompatActivity {

    private ActivityAddNewMedicineBinding binding;
    private AddMedsClickHandler handler;
    private Medicaments medicaments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_medicine);

        medicaments = new Medicaments();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_medicine);

        // View Model
        AppViewModel appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        handler = new AddMedsClickHandler(medicaments, this, appViewModel);

        binding.setMedicina(medicaments);
        binding.setClickHandler(handler);
    }
}