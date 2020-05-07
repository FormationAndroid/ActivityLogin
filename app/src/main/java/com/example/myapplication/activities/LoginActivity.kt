package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.string
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnReset.setOnClickListener {
            editPassword.text.clear()
            editEmail.text.clear()
        }

        btnLogin.setOnClickListener {
            if (editPassword.text.toString() == "pass"){
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }

    }
}

