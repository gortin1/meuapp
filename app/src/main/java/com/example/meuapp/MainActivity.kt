package com.example.meuapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIrParaSegunda = findViewById<Button>(R.id.btnIrParaSegunda)

        btnIrParaSegunda.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
        val btnIrParaTerceira = findViewById<Button>(R.id.btnIrParaTerceira)
        btnIrParaTerceira.setOnClickListener {
            val intent = Intent(this, TerceiraActivity::class.java)
            startActivity(intent)
        }
    }
}
