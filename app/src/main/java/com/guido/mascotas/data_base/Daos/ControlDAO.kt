package com.guido.mascotas.data_base.Daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.guido.mascotas.data_base.Entities.Control_VacunasEntity


@Dao
interface ControlDAO {
    @Query( "SELECT * FROM tipos_mascotas ORDER BY id ASC")
    suspend fun mostrartodo():List<Control_VacunasEntity>

    @Query("SELECT * FROM tipos_mascotas WHERE id = :id")
    suspend fun mostrar_con_id(id:Int):Control_VacunasEntity

    @Update()
    suspend fun actualizar(tipo:Control_VacunasEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertar(type:Control_VacunasEntity)

    @Delete
    suspend fun borrar(tipo:Control_VacunasEntity)

}