package com.websarva.wings.android.euniclus_latestapi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Graphic(context: Context): View(context) {
    private var paint: Paint = Paint()

    override fun onDraw(canvas: Canvas){
        drawBlock(canvas)
        drawField(canvas)
    }

    private fun drawBlock(canvas:Canvas){
        val block = Block(BlockTypeZ)
        block.draw(canvas)
    }
    private fun drawField(canvas: Canvas){
        val field = Field()
        field.draw(canvas, context)
    }
}