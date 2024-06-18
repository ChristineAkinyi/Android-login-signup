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
import com.akirachix.mentorgram.databinding.ActivityLoginPageBinding
import com.akirachix.mentorgram.databinding.ActivityMainBinding

class login_page : AppCompatActivity() {
    lateinit var binding: ActivityLoginPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnPrev.setOnClickListener {
            validateRegistration()
        }

//        setContentView(R.layout.activity_login_page)
//        var textView = findViewById<TextView>(R.id.textView4)
//        textView.setOnClickListener {
//            var intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
        }

    fun validateRegistration(){
        var formErr = false
        clearErrors()
        val username = binding.etUsername.text.toString()
        if (username.isBlank()){
            formErr = true
            binding.tilUsername.error = "Username is required"
        }

        val password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formErr = true
            binding.tilPassword.error = "Password is required"
        }

    }

    fun clearErrors(){
        binding.tilUsername.error = null
        binding.tilPassword.error = null
    }

    }
