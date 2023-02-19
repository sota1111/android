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
    inner class FieldParam(context: Context): View(context) {

        public fun getFieldParam() {

            // ラインを表示
            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
            val insets = windowMetrics.windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())

            val ScreenWidth = windowMetrics.bounds.width()

        }
    }
}
