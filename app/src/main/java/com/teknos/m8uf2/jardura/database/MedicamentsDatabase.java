package com.teknos.m8uf2.jardura.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.teknos.m8uf2.jardura.entitats.Medicaments;

@Database(entities = {Medicaments.class}, version = 1)
public abstract class MedicamentsDatabase extends RoomDatabase {

    public abstract MedicamentsDAO getMedicamentDAO();

    // Singleton
    private static MedicamentsDatabase dbInstance;

    public static synchronized MedicamentsDatabase getInstance(Context context) {
        // Si no hi ha cap instància:
        if (dbInstance == null) {
            dbInstance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    MedicamentsDatabase.class,
                    "medicaments_db"
            ).fallbackToDestructiveMigration().build();
        }
        return dbInstance;
    }
}
