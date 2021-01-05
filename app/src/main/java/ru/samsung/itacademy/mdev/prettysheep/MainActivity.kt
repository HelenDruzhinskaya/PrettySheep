package ru.samsung.itacademy.mdev.prettysheep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click = findViewById<Button>(R.id.click)
click.setOnClickListener({ click.text = "Сейчас овечек " + (++i) +" штук" })
        val sheep = findViewById<ImageView>(R.id.sheep)
        sheep.setOnLongClickListener(View.OnLongClickListener {
            sheep.setImageResource(R.drawable.slsheep)
        true})
    }
}
