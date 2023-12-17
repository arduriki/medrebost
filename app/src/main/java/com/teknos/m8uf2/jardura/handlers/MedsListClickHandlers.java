package com.teknos.m8uf2.jardura.handlers;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.teknos.m8uf2.jardura.activities.AddNewMedicineActivity;

public class MedsListClickHandlers {

    Context context;

    public MedsListClickHandlers(Context context) {
        this.context = context;
    }

    public void onFABClicked(View view) {
        Intent i = new Intent(view.getContext(), AddNewMedicineActivity.class);
        context.startActivity(i);
    }
}
