package com.example.testtouchevent

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.FrameLayout
import com.example.testtouchevent.data.mTag

class MyViewGroup(context: Context,attrs: AttributeSet):FrameLayout(context,attrs) {

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
//        Log.d(mTag,"ViewGroup onInterceptTouchEvent action="+ev?.action)
        return super.onInterceptTouchEvent(ev)
    }
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d(mTag,"ViewGroup dispatchTouchEvent action="+ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(mTag,"ViewGroup onTouchEvent action="+event?.action)
        return super.onTouchEvent(event)
    }


}