package com.teknos.m8uf2.jardura.entitats;

public class Medicaments {
    private String nomMedicament;
    private String fabricantMedicament;
    private boolean prenFrequent;
    private String quantaFrequencia;
    private String momentDia;
    private int numDosisQueden;

    // Constructora plena
    public Medicaments(String nomMedicament, String fabricantMedicament, boolean prenFrequent, String quantaFrequencia, String momentDia, int numDosisQueden) {
        this.nomMedicament = nomMedicament;
        this.fabricantMedicament = fabricantMedicament;
        this.prenFrequent = prenFrequent;
        this.quantaFrequencia = quantaFrequencia;
        this.momentDia = momentDia;
        this.numDosisQueden = numDosisQueden;
    }

    // Constructora buida pel Firebase
    public Medicaments() {

    }

    // Getters i setters
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

    public boolean isPrenFrequent() {
        return prenFrequent;
    }

    public void setPrenFrequent(boolean prenFrequent) {
        this.prenFrequent = prenFrequent;
    }

    public String getQuantaFrequencia() {
        return quantaFrequencia;
    }

    public void setQuantaFrequencia(String quantaFrequencia) {
        this.quantaFrequencia = quantaFrequencia;
    }

    public String getMomentDia() {
        return momentDia;
    }

    public void setMomentDia(String momentDia) {
        this.momentDia = momentDia;
    }

    public int getNumDosisQueden() {
        return numDosisQueden;
    }

    public void setNumDosisQueden(int numDosisQueden) {
        this.numDosisQueden = numDosisQueden;
    }
}
