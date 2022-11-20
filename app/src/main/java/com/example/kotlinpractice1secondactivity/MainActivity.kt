package com.example.kotlinpractice1secondactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.example.kotlinpractice1secondactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //viewBinding綁定使用
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //隱藏上方的標題Bar
        supportActionBar?.hide()

        //綁定viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //設定binding元件
        binding.greetingStr.text = "哈囉你好"

        //設定按鈕執行後跳轉到SecondActivity
        binding.sendBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            //透過intent帶其他值給下一頁SecondActivity
            intent.putExtra("inputText", binding.inputTextView.text.toString())

            //跳轉頁面
            startActivity(intent)

            //本頁消失
            finish()
        }
    }
}