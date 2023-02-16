package com.websarva.wings.android.tetris_euniclus

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Graphic(this))
    }
    inner class Graphic(context: Context): View(context){
        private var paint: Paint = Paint()

        override fun onDraw(canvas: Canvas){
            //四角形を表示
            paint.style = Paint.Style.FILL
            paint.color = Color.argb(255, 255, 0, 255)
            canvas.drawRect(Rect(110, 210, 190, 290), paint)
        }

    }
}