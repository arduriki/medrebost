package com.teknos.m8uf2.jardura.repositories;

import android.os.Handler;
import android.os.Looper;

import com.teknos.m8uf2.jardura.database.MedicamentsDAO;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private final MedicamentsDAO medicamentsDAO;
    ExecutorService executor;
    Handler handler;

    public Repository(MedicamentsDAO medicamentsDAO) {
        this.medicamentsDAO = medicamentsDAO;

        // Used for Background Database Operations
        executor = Executors.newSingleThreadExecutor();

        // Used for updating the UI
        handler = new Handler(Looper.getMainLooper());
    }

    // Methods in DAO being executed from Repository
    public void addMedicament(Medicaments medicament) {
        // Runnable: Executing Tasks on Separate Thread
        executor.execute(new Runnable() {
            @Override
            public void run() {
                // Execute this code asynchronously on separate thread.
                medicamentsDAO.insert(medicament);
            }
        });
    }

    public void deleteMedicament(Medicaments medicament) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                medicamentsDAO.delete(medicament);
            }
        });
    }

    public void updateMedicament(Medicaments medicament) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                medicamentsDAO.update(medicament);
            }
        });
    }

    public List<Medicaments> getAllMedicaments() {
        return medicamentsDAO.getAllMedicaments();
    }
}
