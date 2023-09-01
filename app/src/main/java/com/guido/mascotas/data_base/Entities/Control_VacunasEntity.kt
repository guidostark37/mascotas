package com.guido.mascotas.data_base.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(tableName = "control_vacunas", foreignKeys = [ForeignKey(entity = MascotasEntity::class, parentColumns = ["id"], childColumns = ["id_mascotas"]),
    ForeignKey(entity = VacunasEntity::class, parentColumns = ["id"], childColumns = ["id_vacunas"])])
data class Control_VacunasEntity(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "id") val id:Int,
    @ColumnInfo (name = "id_mascotas") val id_mascotas:Int,
    @ColumnInfo (name = "id_vacunas") val id_vacunas:Int

)
