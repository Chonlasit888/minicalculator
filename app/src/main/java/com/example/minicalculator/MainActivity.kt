package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PULS.setOnClickListener{
            val nn=n1.text.toString().toInt()
            val nm=n2.text.toString().toInt()
            val sum = nn+nm
            tt.setText("$sum")
            kk.setText("+")
        }
        MINUS.setOnClickListener {
            val nn = n1.text.toString().toInt()
            val nm = n2.text.toString().toInt()
            val sum = nn-nm
            tt.setText("$sum")
            kk.setText("-")
        }
        MULTIPLY.setOnClickListener {
            val nn = n1.text.toString().toInt()
            val nm = n2.text.toString().toInt()
            val sum = nn * nm
            tt.setText("$sum")
            kk.setText("*")
        }
        DIVIDER.setOnClickListener {
            val nn = n1.text.toString().toInt()
            val nm = n2.text.toString().toInt()
            val sum = nn / nm
            tt.setText("$sum")
            kk.setText("/")
        }
        MODULO.setOnClickListener {
            val nn = n1.text.toString().toInt()
            val nm = n2.text.toString().toInt()
            val sum = nn % nm
            tt.setText("$sum")
            kk.setText("%")
        }
        CLEAR.setOnClickListener {
            n1.setText("")
            n2.setText("")
            tt.setText("")
            kk.setText("")
        }

    }
}