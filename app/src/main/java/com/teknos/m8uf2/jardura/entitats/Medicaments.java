package com.teknos.m8uf2.jardura.entitats;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "medicaments")
public class Medicaments implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nom_medicament")
    private String nomMedicament;

    @ColumnInfo(name = "fabricant_medicament")
    private String fabricantMedicament;

    public Medicaments(int id, String nomMedicament, String fabricantMedicament) {
        this.id = id;
        this.nomMedicament = nomMedicament;
        this.fabricantMedicament = fabricantMedicament;
    }

    public Medicaments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public String getFabricantMedicament() {
        return fabricantMedicament;
    }

    public void setFabricantMedicament(String fabricantMedicament) {
        this.fabricantMedicament = fabricantMedicament;
    }
}
