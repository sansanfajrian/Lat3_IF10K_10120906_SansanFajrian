package com.example.latihan3monitory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home_layout.*

// NIM : 1011901
// NAMA : Sansan Fajrian
// KELAS : IF10K
// TGL : 30/4/2022

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()

        setContentView(R.layout.home_layout)
        var name = intent.getStringExtra("name").toString()

        resultTV.text = "Beres! Sekarang $name udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"


    }

}