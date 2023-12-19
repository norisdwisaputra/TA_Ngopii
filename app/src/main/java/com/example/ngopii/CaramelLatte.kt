package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CaramelLatte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caramel_latte)

        val bar = supportActionBar
        bar!!.title = "Caramel Latte"
        bar.setDisplayHomeAsUpEnabled(true)

        val button_keranjang = findViewById<Button>(R.id.button_keranjang)
        val total_harga = findViewById<TextView>(R.id.total_harga)
        val jumlah = findViewById<EditText>(R.id.kuantitas)

        fun main(args: Array<String>){
            val jumlah: Int=0
            val harga: Int = 35000
            val total_harga: Int = jumlah.times(harga)

//            println("$total_harga")
        }
        total_harga.text = " $total_harga"

        button_keranjang.setOnClickListener {
            val inten = Intent( this,Keranjang::class.java)
            startActivity(inten)
            Toast.makeText(this, "Pesanan Anda akan di proses", Toast.LENGTH_LONG).show()
        }
    }
}