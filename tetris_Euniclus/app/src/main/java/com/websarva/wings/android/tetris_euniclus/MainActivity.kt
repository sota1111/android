package com.websarva.wings.android.tetris_euniclus

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

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

            // ライン表示
            val wm: WindowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
            //val disp = wm.getDefaultDisplay()
            val size = Point()
            //disp.getSize(size)

            val startX = 200f
            val startY = 300f
            val height = 1000
            val sqSize = 700

            paint.style = Paint.Style.STROKE

            paint.color = Color.argb(255, 190, 200, 255)
            paint.strokeWidth = 10f
            canvas.drawLine(startX, startY+sqSize, startX+width, startY*height)
        }

    }
}

private fun Canvas.drawLine(startX: Float, fl: Float, fl1: Float, fl2: Float) {

}
