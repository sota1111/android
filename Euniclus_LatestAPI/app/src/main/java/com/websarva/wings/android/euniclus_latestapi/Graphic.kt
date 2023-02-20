package com.websarva.wings.android.euniclus_latestapi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Graphic(context: Context): View(context) {
    private var paint: Paint = Paint()
    var blockSleepCnt = 0
    val block = Block(BlockTypeI)

    override fun onDraw(canvas: Canvas){
        drawBlock(canvas)
        drawField(canvas)
    }

    private fun drawBlock(canvas:Canvas){
        blockSleepCnt += 1
        if (blockSleepCnt > BLOCK_DOWN_CNT) {
            updateBlockPos(0, BLOCK_SPACE)
            blockSleepCnt = 0
        }
        block.draw(canvas)
    }
    private fun updateBlockPos(x: Int, y: Int) {
        block.updatePos(x,y)
    }
    private fun drawField(canvas: Canvas){
        val field = Field()
        field.draw(canvas, context)
    }
}