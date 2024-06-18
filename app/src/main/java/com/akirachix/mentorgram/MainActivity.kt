package com.akirachix.mentorgram

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorgram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener{
        val intent = Intent(this,login_page::class.java)
        startActivity(intent)
    }

        binding.btnNext.setOnClickListener {
            validateRegistration()
        }
//        var textView = findViewById<TextView>(R.id.tvLogin)
//        textView.setOnClickListener {
//            var intent = Intent(this,login_page::class.java)
//            startActivity(intent)
//        }

            }
    fun validateRegistration(){
        var formErr = false
        clearErrors()
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()){
            formErr = true
            binding.tilFirstName.error = "First name is required"
        }

        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()){
            formErr = true
            binding.tilLastName.error = "Last name is required"
        }

        val email = binding.etEmail.text.toString()
        if (email.isBlank()){
            formErr = true
            binding.tilEmail.error ="Email is required"
        }

        val codehiveId = binding.etCodehiveId.text.toString()
        if (codehiveId.isBlank()){
            formErr = true
            binding.tilCodehiveId.error ="CodehiveID is required"
        }

        val userName = binding.etUserName.text.toString()
        if (userName.isBlank()){
            formErr = true
            binding.tilUserName.error ="Username is required"
        }

        val password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formErr = true
            binding.tilPassword.error ="Username is required"
        }

        val passwordConf = binding.etPasswordConf.text.toString()
        if (passwordConf.isBlank()){
            formErr = true
            binding.tilPasswordConf.error ="Username is required"
        }

        if (password!=passwordConf){
            formErr = true
            binding.tilPasswordConf.error = "Passwords don't match"
        }
    }

    fun clearErrors(){
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodehiveId.error = null
        binding.tilUserName.error = null
        binding.tilPassword.error = null
        binding.tilPasswordConf.error = null
    }
}