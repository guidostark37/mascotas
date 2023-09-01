package com.guido.mascotas.data_base.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(tableName = "mascotas", foreignKeys = [ForeignKey(entity = Tipos_MascotasEntity::class, parentColumns = ["id"], childColumns = ["id_tipo"])])
data class MascotasEntity (
@PrimaryKey(autoGenerate = true)
    val id:Int,
@ColumnInfo(name = "nombre") val nombre:String,
@ColumnInfo (name = "raza")val raza:String,
@ColumnInfo (name = "edad") val edad:Int,
@ColumnInfo(name = "id_tipo")  val id_tipo:Int
)
