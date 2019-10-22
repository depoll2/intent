package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pindah_empty.*

class pindahEmpty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_empty)

        val bundle = intent.extras
        val getNim = bundle?.get("Nim")
        val getName = bundle?.get("Nama")
        val  getNilai = bundle?.get("Nilai")
        val  getKet = bundle?.get("Keterangan")

        Nim.text = getNim.toString()
        Nama.text = getName.toString()
        Nilai.text = getNilai.toString()
        Keterangan.text= getKet.toString()

    }
}
