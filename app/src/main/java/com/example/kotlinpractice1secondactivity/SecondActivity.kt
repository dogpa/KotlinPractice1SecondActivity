package com.example.kotlinpractice1secondactivity

import android.content.Intent
import android.os.Bundle
import com.example.kotlinpractice1secondactivity.databinding.ActivitySecondBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import com.example.kotlinpractice1secondactivity.databinding.ActivityMainBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //隱藏標題欄
        supportActionBar?.hide()

        //viewBinding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //取得上一頁的傳入的值並顯示在textView上
        val showTextStr = intent.getStringExtra("inputText")
        binding.textView.text = showTextStr

        //設定返回MainActivtiy的Button
        binding.button3.text = "返回"
        binding.button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}
