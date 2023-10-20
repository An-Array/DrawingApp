package com.daike.drawingview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var drawingView: DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizeForBrush(20.toFloat())



    }

    private fun showBrushSizeChooserDialog(){
        var brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dailog_brush_size)
        brushDialog.setTitle("Brush size: ")
        val smallBtn = brushDialog.ib_small_brush
        smallBtn.setOnClickListner {
            drawingView?.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }

        brushDialog.show()
    }
}