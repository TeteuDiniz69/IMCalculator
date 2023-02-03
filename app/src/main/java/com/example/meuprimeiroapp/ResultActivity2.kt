package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvresult = findViewById<TextView>(R.id.TextView_Result)
        val tvClassificacao = findViewById<TextView>(R.id.TVclassificacao)


        val result = intent.getFloatExtra("RESULT_EXTRA", 0.1f)

        tvresult.text = result.toString()

        val classificacao = if (result < 18.5f) {
            "ABAIXO DO PESO"
        } else if (result in 18.5f..24.9f){
            "NORMAL"
        } else if (result in 25.0f..29.9f){
            "SOBREPESO"
        } else if (result in 30.0f..34.9f) {
            "OBESIDADE"
        } else{
            "OBESIDADE GRAVE"
        }

        tvClassificacao.text = getString(R.string.message_classificacao,classificacao)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        finish()
        return super.onOptionsItemSelected(item)
    }

}