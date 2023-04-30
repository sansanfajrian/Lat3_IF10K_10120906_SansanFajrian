package com.example.latihan3monitory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// NIM : 1011901
// NAMA : Sansan Fajrian
// KELAS : IF10K
// TGL : 30/4/2022

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)

        btn_mulai.setOnClickListener() {
            intent = Intent(this, Code::class.java)
            startActivity(intent)
        }
    }
}