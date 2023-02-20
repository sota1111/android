package com.websarva.wings.android.euniclus_latestapi

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import java.util.*

class Block(private val blockInfo: Array<IntArray> ){
    var paint: Paint = Paint()
    private var xPos = BLOCK_START_X
    private var yPos = BLOCK_START_Y

    fun draw(canvas: Canvas){
        paint.style = Paint.Style.FILL
        val _color_index = 4
        paint.color = Color.argb(
            blockInfo[_color_index][0],
            blockInfo[_color_index][1],
            blockInfo[_color_index][2],
            blockInfo[_color_index][3]
        )
        for(i in 0 until _color_index ){
            canvas.drawRect(Rect(
                xPos + blockInfo[i][0],
                yPos + blockInfo[i][1],
                xPos + BLOCK_SIZE+blockInfo[i][0],
                yPos + BLOCK_SIZE+blockInfo[i][1]), paint)
        }
    }

    fun updatePos(x: Int, y:Int) {
        xPos += x
        yPos += y
    }
    fun setPos(x: Int, y: Int) {
        xPos = x
        yPos = y
    }

}