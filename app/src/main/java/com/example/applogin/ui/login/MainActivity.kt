package com.example.applogin.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.applogin.databinding.ActivityMainBinding
import com.example.applogin.ui.register.RegisterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.btnGoLogin.setOnClickListener {
            loadLoginUsers()
        }

    }

    private fun loadLoginUsers() {
        binding.apply {

            var isComplet = true
            val lista = listOf(edtEmail, edtPassword)
            lista.forEach {
                if (it.text.toString().isEmpty()){
                    isComplet = false
                    it.error = "Campos requiridos"
                }
            }
            
            if (isComplet){

            }


        }
    }
}