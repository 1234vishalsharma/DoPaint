package com.example.dopaint

import android.graphics.Color
import android.graphics.Color.YELLOW
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.dopaint.paintview.Companion.colorlist
import com.example.dopaint.paintview.Companion.currentbrush
import com.example.dopaint.paintview.Companion.pathlist

class MainActivity : AppCompatActivity() {
    companion object{
        var path=Path()
        var brush=Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redbtn=findViewById<ImageButton>(R.id.red_color)
        val yellowbtn=findViewById<ImageButton>(R.id.yellow_color)
        val blackbtn=findViewById<ImageButton>(R.id.black_color)
        val greenbtn=findViewById<ImageButton>(R.id.green_color)
        val eraser=findViewById<ImageButton>(R.id.white_color)

        redbtn.setOnClickListener {
            Toast.makeText(this,"Red applied",Toast.LENGTH_SHORT).show()
            brush.color=Color.RED
            currentcolor(brush.color)
        }
        yellowbtn.setOnClickListener {
            Toast.makeText(this,"Yellow applied",Toast.LENGTH_SHORT).show()
            brush.color=Color.YELLOW
            currentcolor(brush.color)
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this,"Black applied",Toast.LENGTH_SHORT).show()
            brush.color=Color.BLACK
            currentcolor(brush.color)
        }
        greenbtn.setOnClickListener {
            Toast.makeText(this,"Green applied",Toast.LENGTH_SHORT).show()
            brush.color=Color.GREEN
            currentcolor(brush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"All Cleared",Toast.LENGTH_SHORT).show()
            pathlist.clear()
            colorlist.clear()
            path.reset()
        }
    }
    private fun currentcolor(color : Int){
        currentbrush=color
        path= Path()
    }
}