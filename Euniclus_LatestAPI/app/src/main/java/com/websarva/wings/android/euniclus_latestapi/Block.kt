package com.websarva.wings.android.euniclus_latestapi

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import java.util.*

class Block(private val blockInfo: Array<IntArray> ){
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
        paint.style = Paint.Style.FILL
        val _color_index = 4
        paint.color = Color.argb(
            blockInfo[_color_index][0],
            blockInfo[_color_index][1],
            blockInfo[_color_index][2],
            blockInfo[_color_index][3]
        )
            //paint.color = Color.argb(0xFF, 0xFF, 0x00, 0xFF)
        for(i in 0 until _color_index ){
            canvas.drawRect(Rect(
                BLOCKSTARTX+blockInfo[i][0],
                BLOCKSTARTY+blockInfo[i][1],
                BLOCKSTARTX+BLOCKSIZE+blockInfo[i][0],
                BLOCKSTARTY+BLOCKSIZE+blockInfo[i][1]), paint)
        }

    }
}