package com.androidwavelength.rinzify.auth.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidwavelength.rinzify.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var activityLoginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding.root)

        initListeners()
    }


    private fun initListeners() {

//        activityLoginBinding.btnSignIn.setOnClickListener {
//
//        }
    }
}