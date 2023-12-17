package com.teknos.m8uf2.jardura.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MedicamentsDAO_Impl implements MedicamentsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Medicaments> __insertionAdapterOfMedicaments;

  private final EntityDeletionOrUpdateAdapter<Medicaments> __deletionAdapterOfMedicaments;

  private final EntityDeletionOrUpdateAdapter<Medicaments> __updateAdapterOfMedicaments;

  public MedicamentsDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMedicaments = new EntityInsertionAdapter<Medicaments>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `medicaments` (`id`,`nom_medicament`,`fabricant_medicament`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          final Medicaments entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNomMedicament() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNomMedicament());
        }
        if (entity.getFabricantMedicament() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFabricantMedicament());
        }
      }
    };
    this.__deletionAdapterOfMedicaments = new EntityDeletionOrUpdateAdapter<Medicaments>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `medicaments` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          final Medicaments entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfMedicaments = new EntityDeletionOrUpdateAdapter<Medicaments>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `medicaments` SET `id` = ?,`nom_medicament` = ?,`fabricant_medicament` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          final Medicaments entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNomMedicament() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNomMedicament());
        }
        if (entity.getFabricantMedicament() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFabricantMedicament());
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public void insert(final Medicaments medicament) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedicaments.insert(medicament);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Medicaments medicament) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMedicaments.handle(medicament);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Medicaments medicament) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMedicaments.handle(medicament);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Medicaments>> getAllMedicaments() {
    final String _sql = "SELECT * FROM medicaments";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"medicaments"}, false, new Callable<List<Medicaments>>() {
      @Override
      @Nullable
      public List<Medicaments> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNomMedicament = CursorUtil.getColumnIndexOrThrow(_cursor, "nom_medicament");
          final int _cursorIndexOfFabricantMedicament = CursorUtil.getColumnIndexOrThrow(_cursor, "fabricant_medicament");
          final List<Medicaments> _result = new ArrayList<Medicaments>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Medicaments _item;
            _item = new Medicaments();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpNomMedicament;
            if (_cursor.isNull(_cursorIndexOfNomMedicament)) {
              _tmpNomMedicament = null;
            } else {
              _tmpNomMedicament = _cursor.getString(_cursorIndexOfNomMedicament);
            }
            _item.setNomMedicament(_tmpNomMedicament);
            final String _tmpFabricantMedicament;
            if (_cursor.isNull(_cursorIndexOfFabricantMedicament)) {
              _tmpFabricantMedicament = null;
            } else {
              _tmpFabricantMedicament = _cursor.getString(_cursorIndexOfFabricantMedicament);
            }
            _item.setFabricantMedicament(_tmpFabricantMedicament);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
