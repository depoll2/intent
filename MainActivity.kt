package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim = Edit_Nim.text
        val nama = Edit_Nama.text
        val nilai = Edit_Nilai.text

        prosses.setOnClickListener {
            intent = Intent(this,pindahEmpty::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai",nilai)

            val nilaiKet = nilai.toString().toInt()
            if (nilaiKet >= 80){
                intent.putExtra("Keterangan", "A")}
            else if (nilaiKet >=60){
                intent.putExtra("Keterangan", "B")
            }
            else if (nilaiKet >=40){
                intent.putExtra("Keterangan", "C")
            }
            else if (nilaiKet >=20){
                intent.putExtra("Keterangan","D")
            }
            else if (nilaiKet >=20){
                intent.putExtra("Keterangan","E")
            }
            startActivity(intent)
        }
    }
}
