package com.example.meuapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }
        val nota1 = findViewById<EditText>(R.id.nota1)
        val nota2 = findViewById<EditText>(R.id.nota2)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        btnCalcular.setOnClickListener {
            val nota1 = nota1.text.toString().toFloatOrNull()
            val nota2 = nota2.text.toString().toFloatOrNull()

            if (nota1 != null && nota2 != null) {
                val media = nota1 + nota2 / 2
                val resultado = when {
                    media < 4 -> "Reprovado"
                    media >= 4 && media < 6 -> "Prova Sub"
                    else -> "Aprovado"
                }
                textResultado.text = "IMC: %.2f\n%s".format(media, resultado)
            } else {
                textResultado.text = "Digite valores válidos!"
            }
        }
    }
}