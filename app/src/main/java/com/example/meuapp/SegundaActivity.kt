package com.example.meuapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }

        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura = findViewById<EditText>(R.id.editAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        btnCalcular.setOnClickListener {
            val peso = editPeso.text.toString().toFloatOrNull()
            val altura = editAltura.text.toString().toFloatOrNull()

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura)
                val classificacao = when {
                    imc < 18.5 -> "Abaixo do peso"
                    imc < 24.9 -> "Peso normal"
                    imc < 29.9 -> "Sobrepeso"
                    imc < 34.9 -> "Obesidade Grau 1"
                    imc < 39.9 -> "Obesidade Grau 2"
                    else -> "Obesidade Grau 3"
                }
                textResultado.text = "IMC: %.2f\n%s".format(imc, classificacao)
            } else {
                textResultado.text = "Digite valores válidos!"
            }
        }
    }
}
