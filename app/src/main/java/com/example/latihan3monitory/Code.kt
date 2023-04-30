package com.example.latihan3monitory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.code_layout.*

// NIM : 10120906
// NAMA : Sansan Fajrian
// KELAS : IF10K
// TGL : 30/4/2022

class Code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.code_layout)

        btn_getCode.setOnClickListener() {
            intent = Intent(this, Form::class.java);
            startActivity(intent)
        }
        btn_masuk.setOnClickListener() {
            intent = Intent(this, Form::class.java);
            startActivity(intent)
        }
    }
}