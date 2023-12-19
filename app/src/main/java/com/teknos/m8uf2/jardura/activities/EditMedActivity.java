package com.teknos.m8uf2.jardura.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.database.MedicamentsDatabase;
import com.teknos.m8uf2.jardura.databinding.ActivityEditMedBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

public class EditMedActivity extends AppCompatActivity {

    private ActivityEditMedBinding activityEditMedBinding;
    private Medicaments medicament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_med);

        activityEditMedBinding = DataBindingUtil.setContentView(this, R.layout.activity_edit_med);

        medicament = (Medicaments) getIntent().getSerializableExtra("Medicament");

        activityEditMedBinding.setMedicina(medicament);

        activityEditMedBinding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the data from the EditText fields
                String nomMedicament = activityEditMedBinding.editNameEt.getText().toString();
                String fabricantMedicament = activityEditMedBinding.editFabricantEt.getText().toString();

                // Update the Medicament object
                medicament.setNomMedicament(nomMedicament);
                medicament.setFabricantMedicament(fabricantMedicament);

                // Save the Medicament object to the database.
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        MedicamentsDatabase db = MedicamentsDatabase.getInstance(getApplicationContext());
                        db.getMedicamentDAO().update(medicament);

                        // Close EditMedicamentActivity and return to MedDetailActivity
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                finish();
                            }
                        });
                    }
                }).start();
            }
        });
    }
}