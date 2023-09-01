package com.guido.mascotas.data_base.Daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.guido.mascotas.data_base.Entities.VacunasEntity

@Dao
interface VacunasDAO {
    @Query( "SELECT * FROM tipos_mascotas ORDER BY id ASC")
    suspend fun mostrartodo():List<VacunasEntity>

    @Query("SELECT * FROM tipos_mascotas WHERE id = :id")
    suspend fun mostrar_con_id(id:Int):VacunasEntity

    @Update()
    suspend fun actualizar(tipo:VacunasEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertar(type:VacunasEntity)

    @Delete
    suspend fun borrar(tipo:VacunasEntity)

}