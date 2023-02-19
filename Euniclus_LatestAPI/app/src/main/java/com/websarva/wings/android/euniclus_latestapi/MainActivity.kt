package com.websarva.wings.android.euniclus_latestapi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowMetrics
import androidx.appcompat.app.AppCompatActivity
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Graphic(this))
    }
    inner class Graphic(context: Context): View(context) {
        private var paint: Paint = Paint()

        override fun onDraw(canvas: Canvas) {

            // ラインを表示
            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
            val insets = windowMetrics.windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())

            val ScreenWidth = windowMetrics.bounds.width()
            val ScreenHeight = windowMetrics.bounds.height()
            val StatusBar = insets.top
            val NavigationBar = insets.bottom

            //四角形を表示
            paint.style = Paint.Style.FILL
            paint.color = Color.argb(255, 255, 0, 255)

            val sqSize = (ScreenWidth - 200)/10
            Log.i("Display","sqSize" + sqSize)
            canvas.drawRect(Rect(sqSize, sqSize, sqSize*2, sqSize*2), paint)

            val startX = 100f
            val startY = 200f

            val _field_height = 20
            val _field_width = 10

            val height = _field_height * sqSize
            val width = _field_width * sqSize

            // 横線
            for (i in 0 until _field_height+1 ) {
                paint.style = Paint.Style.STROKE
                paint.color = Color.argb(0x3F, 0x00,0x00,0x00)
                paint.strokeWidth = 10f
                canvas.drawLine(startX, startY+i*sqSize ,startX+width,startY+i*sqSize , paint)
            }
            // 縦線
            for (i in 0 until _field_width+1 ) {
                paint.style = Paint.Style.STROKE
                paint.color = Color.argb(0x3F, 0x00,0x00,0x00)
                paint.strokeWidth = 10f
                canvas.drawLine(startX+i*sqSize , startY,startX+i*sqSize ,startY+height, paint)
            }




        }
    }
}
