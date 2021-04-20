package com.example.icapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcularIc = calcularIc
        val resultado = resultado
        var sexo:String = ""
        val btHomem = homem
        val btMulher = mulher

        btHomem.setOnClickListener {

            sexo = "Homem"
            Toast.makeText(this, sexo, Toast.LENGTH_SHORT).show()

        }
        btMulher.setOnClickListener{

            sexo = "Mulher"
            Toast.makeText(this, sexo, Toast.LENGTH_SHORT).show()

        }



        btCalcularIc.setOnClickListener {

            val genero = sexo
            val peso = Integer.parseInt(peso.text.toString())
            val altura = Integer.parseInt(altura.text.toString())
            val cintura = Integer.parseInt(cintura.text.toString())
            val ic = (cintura.toFloat()/100)/(0.109*sqrt(peso/(altura.toFloat()/100)))
            val s = "%.2f".format(ic)



            if(genero == "Mulher" && ic >= 1.18){

                resultado.setText("Seu resultado foi $s você possui alto risco de doenças coronarianas")

            }
            else if(genero == "Homem" && ic >= 1.25 ){

                resultado.setText("Seu resultado foi $s você possui alto risco de doenças coronarianas")

            }

            else{
                resultado.setText("Seu resultado foi $s você  não possui alto risco de doenças coronarianas")
            }





        }
    }
}