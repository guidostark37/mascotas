package com.guido.mascotas.data_base.Daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.guido.mascotas.data_base.Entities.Tipos_MascotasEntity

@Dao
interface TiposDAO {
    @Query( "SELECT * FROM tipos_mascotas ORDER BY id ASC")
    suspend fun mostrartodo():List<Tipos_MascotasEntity>

    @Query("SELECT * FROM tipos_mascotas WHERE id = :id")
    suspend fun mostrar_con_id(id:Int):Tipos_MascotasEntity

    @Update()
    suspend fun actualizar(tipo:Tipos_MascotasEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertar(type:Tipos_MascotasEntity)

    @Delete
    suspend fun borrar(tipo:Tipos_MascotasEntity)
}
