package com.teknos.m8uf2.jardura.repositories;

import com.teknos.m8uf2.jardura.database.MedicamentsDAO;
import com.teknos.m8uf2.jardura.entitats.Medicaments;

import java.util.List;

public class Repository {
    private final MedicamentsDAO medicamentsDAO;

    public Repository(MedicamentsDAO medicamentsDAO) {
        this.medicamentsDAO = medicamentsDAO;
    }

    // Methods in DAO being executed from Repository
    public void addMedicament(Medicaments medicament) {
        medicamentsDAO.insert(medicament);
    }

    public void deleteMedicament(Medicaments medicament) {
        medicamentsDAO.delete(medicament);
    }

    public void updateMedicament(Medicaments medicament) {
        medicamentsDAO.update(medicament);
    }

    public List<Medicaments> getAllMedicaments() {
        return medicamentsDAO.getAllMedicaments();
    }
}
