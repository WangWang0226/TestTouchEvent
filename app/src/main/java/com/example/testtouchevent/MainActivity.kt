package com.example.testtouchevent

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import com.example.testtouchevent.data.mTag
import com.example.testtouchevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.textview.setOnClickListener {
            Log.d(mTag,"Activity Textview setOnclickLietener")
        }
        val vb = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        binding.textview.setOnTouchListener { v, event ->
            when(event.action){
                MotionEvent.ACTION_DOWN->{
                    //第一個參數是震動時間(毫秒)，第二個參數是震動強度(1~255)
                    if(Build.VERSION.SDK_INT>=26)
                        vb.vibrate(VibrationEffect.createOneShot(2000,255))
                }
                MotionEvent.ACTION_MOVE->{}
                MotionEvent.ACTION_UP-> vb.cancel()
            }
            true
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d(data.mTag,"Activity dispatchTouchEvent action="+ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(data.mTag,"Activity onTouchEvent action="+event?.action)
        return super.onTouchEvent(event)
    }
}