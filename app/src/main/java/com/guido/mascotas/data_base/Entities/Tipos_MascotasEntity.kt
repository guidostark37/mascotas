package com.guido.mascotas.data_base.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "tipos_mascotas")
data class Tipos_MascotasEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo (name = "id") val id:Int,
    @ColumnInfo(name = "tipo_mascota") val tipo_mascota:String

)