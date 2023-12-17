package com.teknos.m8uf2.jardura.handlers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.teknos.m8uf2.jardura.activities.MedsListActivity;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.view.AppViewModel;

public class AddMedsClickHandler {

    Medicaments medicaments;
    Context context;
    AppViewModel appViewModel;

    public AddMedsClickHandler(Medicaments medicaments, Context context, AppViewModel appViewModel) {
        this.medicaments = medicaments;
        this.context = context;
        this.appViewModel = appViewModel;
    }

    public void onSubmitBtnClicked(View view){
        if(medicaments.getNomMedicament() == null || medicaments.getFabricantMedicament() == null) {
            Toast.makeText(context, "Camps no poden estar buits", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(context, MedsListActivity.class);
            //i.putExtra("Nom", medicaments.getNomMedicament());
            //i.putExtra("Fabricant", medicaments.getFabricantMedicament());

            Medicaments m = new Medicaments(
                    medicaments.getId(),
                    medicaments.getNomMedicament(),
                    medicaments.getFabricantMedicament()
            );

            appViewModel.addNewMedicament(m);

            context.startActivity(i);
        }
    }
}
