package com.teknos.m8uf2.jardura.view;

import android.app.Application;
import android.provider.ContactsContract;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.repositories.Repository;

import java.util.List;

public class AppViewModel extends AndroidViewModel {

    private Repository myRepository;
    // LiveData
    private LiveData<List<Medicaments>> allMedicaments;

    public AppViewModel(@NonNull Application application) {
        super(application);
        this.myRepository = new Repository(application);
    }

    public LiveData<List<Medicaments>> getAllMedicaments() {
        allMedicaments = myRepository.getAllMedicaments();
        return allMedicaments;
    }

    public void addNewMedicament(Medicaments medicament) {
        myRepository.addMedicament(medicament);
    }

    public void deleteMedicament(Medicaments medicament) {
        myRepository.deleteMedicament(medicament);
    }

    public void updateMedicament(Medicaments medicament){
        myRepository.updateMedicament(medicament);
    }

}
