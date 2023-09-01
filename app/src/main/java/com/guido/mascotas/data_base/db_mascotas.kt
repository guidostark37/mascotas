package com.guido.mascotas.data_base

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.guido.mascotas.data_base.Daos.ControlDAO
import com.guido.mascotas.data_base.Daos.MascotasDAO
import com.guido.mascotas.data_base.Daos.VacunasDAO
import com.guido.mascotas.data_base.Daos.TiposDAO
import com.guido.mascotas.data_base.Entities.Control_VacunasEntity
import com.guido.mascotas.data_base.Entities.MascotasEntity
import com.guido.mascotas.data_base.Entities.Tipos_MascotasEntity
import com.guido.mascotas.data_base.Entities.VacunasEntity

@Database(
    entities = [VacunasEntity::class, Tipos_MascotasEntity::class,MascotasEntity::class,
        Control_VacunasEntity::class], version = 1
)

abstract class db_mascotas : RoomDatabase() {

    abstract fun mascotasDAO(): MascotasDAO

    abstract fun vacunasDAO(): VacunasDAO

    abstract fun tiposDAO(): TiposDAO

    abstract fun controlDAO(): ControlDAO

    companion object {
        @Volatile
        private var INSTANCE: db_mascotas? = null
        fun getDATABASE(context: Context): db_mascotas {
            if (INSTANCE != null) {
                return INSTANCE!!
            }

            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                db_mascotas::class.java,
                "mascotas"
            )
                .build()
            return INSTANCE!!
        }
    }


}