package com.company.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar


class MainActivity : AppCompatActivity() {

    fun goSecondView(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }

    // 뷰가 생성 되엇을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 파일을 연결 시켜준다. 즉 설정한다.
        setContentView(R.layout.activity_main)

    }

}
