package com.teknos.m8uf2.jardura.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.adapters.AppAdapter;
import com.teknos.m8uf2.jardura.database.MedicamentsDatabase;
import com.teknos.m8uf2.jardura.databinding.ActivityMedsListBinding;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers;
import com.teknos.m8uf2.jardura.view.AppViewModel;

import java.util.ArrayList;
import java.util.List;

public class MedsListActivity extends AppCompatActivity {

    // DataSource
    private MedicamentsDatabase medicamentsDatabase;
    private ArrayList<Medicaments> medicamentsArrayList = new ArrayList<>();

    // Adapter
    private AppAdapter appAdapter;

    // Binding
    private ActivityMedsListBinding activityMedsListBinding;
    private MedsListClickHandlers medsListClickHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds_list);

        // Data Binding
        activityMedsListBinding = DataBindingUtil.setContentView(this, R.layout.activity_meds_list);
        medsListClickHandlers = new MedsListClickHandlers(this);

        activityMedsListBinding.setClickHandler(medsListClickHandlers);

        // RecyclerView
        RecyclerView recyclerView = activityMedsListBinding.medsRecyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Database
        medicamentsDatabase = MedicamentsDatabase.getInstance(this);

        // View Model
        AppViewModel appViewModel = new ViewModelProvider(this)
                .get(AppViewModel.class);

        // Loading data from ROOM DB
        appViewModel.getAllMedicaments().observe(this,
                new Observer<List<Medicaments>>() {
                    @Override
                    public void onChanged(List<Medicaments> medicaments) {

                        medicamentsArrayList.clear();

                        for (Medicaments m: medicaments) {
                            Log.v("TAGY", m.getNomMedicament());
                            medicamentsArrayList.add(m);
                        }
                        appAdapter.notifyDataSetChanged();
                    }
                });

        // Adapter
        appAdapter = new AppAdapter(medicamentsArrayList);

        // Link RecyclerView with the Adapter
        recyclerView.setAdapter(appAdapter);

        // Swipe to delete
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                // If swipe item to the left
                Medicaments m = medicamentsArrayList.get(viewHolder.getAdapterPosition());

                appViewModel.deleteMedicament(m);
            }
        }).attachToRecyclerView(recyclerView);
    }
}