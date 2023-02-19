package com.websarva.wings.android.euniclus_latestapi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.Log
import android.view.WindowInsets
import android.view.WindowMetrics

class Field {
    private var paint: Paint = Paint()


    fun draw(canvas: Canvas, context: Context){
        // ラインを表示

        //val windowMetrics: WindowMetrics = this.windowManager.currentWindowMetrics
        //val insets = windowMetrics.windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())

        //val ScreenWidth = windowMetrics.bounds.width()
        // val ScreenHeight = windowMetrics.bounds.height()
        // val StatusBar = insets.top
        // val NavigationBar = insets.bottom

        val _ScreenWidth = 1100
        val sqSize = (_ScreenWidth - 200)/10
        Log.i("Display","sqSize:$sqSize"
        )

        val startX = FIELDSTARTX
        val startY = FIELDSTARTY

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