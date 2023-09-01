package com.guido.mascotas.data_base.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vacunas")
data class VacunasEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo (name = "id") val id:Int,
    @ColumnInfo (name = "nombre_vacuna") val nombre_vacuna:String

)
