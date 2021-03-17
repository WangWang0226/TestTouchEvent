package com.example.testtouchevent

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.example.testtouchevent.data.mTag

class MyTextView(context: Context,attrs: AttributeSet): AppCompatTextView(context,attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d(mTag,"TextView dispatchTouchEvent action="+ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(mTag,"TextView onTouchEvent action="+event?.action)
        return super.onTouchEvent(event)
    }

//    override fun setOnTouchListener(l: OnTouchListener?) {
//        super.setOnTouchListener(l)
//
//    }


}