package com.teknos.m8uf2.jardura.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.activities.MedDetailActivity;
import com.teknos.m8uf2.jardura.databinding.MedicamentItemBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.MedicamentsViewHolder> {

    private ArrayList<Medicaments> medicaments;

    public AppAdapter(ArrayList<Medicaments> medicaments) {
        this.medicaments = medicaments;
    }

    @NonNull
    @Override
    public MedicamentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creating new View holders for items in recyclerView

        MedicamentItemBinding medicamentItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.medicament_item,
                parent,
                false
        );
        return new MedicamentsViewHolder(medicamentItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicamentsViewHolder holder, int position) {
        // Called by recyclerview when it needs to display or update an item
        // at a specific position in the list or grid

        final Medicaments currentMedicament = medicaments.get(position);

        holder.medicamentItemBinding.setMedicament(currentMedicament);

        holder.medicamentItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MedDetailActivity.class);
                i.putExtra("Medicament", currentMedicament);
                view.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        // Determines the total number of items in the dataset that will
        // be displayed in the recyclerview

        if (medicaments != null) {
            return medicaments.size();
        } else {
            return 0;
        }
    }

    public void setMedicaments(ArrayList<Medicaments> medicaments) {
        this.medicaments = medicaments;
        // To report the associated RecyclerView that the underlying
        // dataset has changed, and the RecyclerView should refresh
        // its views to reflect these changes.
        notifyDataSetChanged();
    }

    class MedicamentsViewHolder extends RecyclerView.ViewHolder {

        private MedicamentItemBinding medicamentItemBinding;

        public MedicamentsViewHolder(MedicamentItemBinding medicamentItemBinding) {
            super(medicamentItemBinding.getRoot());
            this.medicamentItemBinding = medicamentItemBinding;
        }
    }
}
