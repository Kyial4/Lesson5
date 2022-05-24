package com.geektech.lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var btn_plus: Button? = null
    private var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text_view)
        btn_plus = findViewById(R.id.plus)
        btn_plus?.setOnClickListener {
            if (sum < 11 && btn_plus?.text == "+1") {
                sum++
                textView?.text = sum.toString()
                if (sum == 10) {
                    btn_plus?.text = "-1"
                }
            }
            else {
                    sum--
                    textView?.text = sum.toString()
                    if (sum == 0 && btn_plus?.text == "-1") {
                        btn_plus?.text = "+1"
                    }
                }
            }
        }
    }
