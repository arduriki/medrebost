package com.teknos.m8uf2.jardura.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.teknos.m8uf2.jardura.entitats.Medicaments;

import java.util.List;

@Dao
public interface MedicamentsDAO {

    @Insert
    void insert(Medicaments medicament);

    @Delete
    void delete(Medicaments medicament);

    @Update
    void update(Medicaments medicament);

    @Query("SELECT * FROM medicaments")
    LiveData<List<Medicaments>> getAllMedicaments();
}
