package com.example.latihan3monitory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.form_layout.*

// NIM : 1011901
// NAMA : Sansan Fajrian
// KELAS : IF10K
// TGL : 30/4/2022

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.form_layout)

        btnNext.setOnClickListener() {
            var name:String;
            if (textNama.text.isNullOrEmpty()) {
                name = "kamu"
            } else name = textNama.text.toString()

            intent = Intent(this, Home::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }

    }
}