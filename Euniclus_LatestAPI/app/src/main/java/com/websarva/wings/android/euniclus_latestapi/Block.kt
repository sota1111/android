package com.websarva.wings.android.euniclus_latestapi

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import java.util.*

class Block {
    private var paint: Paint = Paint()
    init {
        paint.style = Paint.Style.FILL
        paint.color = Color.argb(
            255,
            Random().nextInt(200),
            Random().nextInt(200),
            Random().nextInt(200),
        )
    }
    fun draw(canvas: Canvas){
        canvas.drawRect(Rect(
            BLOCKSTARTX,
            BLOCKSTARTY,
            BLOCKSTARTX + BLOCKSIZE,
            BLOCKSTARTX + BLOCKSIZE), paint)
    }
}