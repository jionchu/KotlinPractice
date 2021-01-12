package com.jionchu.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }
        })

        //1. Kotlin 인터페이스가 아닌 자바 인터페이스여야 합니다.
        //2. 그 인터페이스는 딱 하나의 메소드만 가져야 합니다.
        button.setOnClickListener{
            // TO DO...
        }
    }
}