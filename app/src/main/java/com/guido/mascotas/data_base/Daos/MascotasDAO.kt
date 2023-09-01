package com.guido.mascotas.data_base.Daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.guido.mascotas.data_base.Entities.MascotasEntity

@Dao
interface MascotasDAO {
  @Query("SELECT * FROM mascotas")
  suspend fun get(): List<MascotasEntity>

  @Query("SELECT * FROM mascotas WHERE id = :id")
  suspend fun mostrar_con_id(id:Int):MascotasEntity

    @Update()
    suspend fun actualizar(mascotas: MascotasEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertar(pet: MascotasEntity)

    @Delete
    suspend fun borrar(mascota: MascotasEntity)
}
