package com.guido.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.guido.mascotas.data_base.db_mascotas
import com.guido.mascotas.databinding.ActivityRegistrarBinding

class Registrar : AppCompatActivity() {
    lateinit var binding: ActivityRegistrarBinding
    lateinit var db:db_mascotas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = db_mascotas.getDATABASE(this)
        navegation()


    }

    private fun navegation() {
        val buttomnavegation = binding.botonnavegationview
        val navMostfragment = supportFragmentManager.findFragmentById(R.id.contenedor_nav_fragment) as NavHostFragment
    }
}