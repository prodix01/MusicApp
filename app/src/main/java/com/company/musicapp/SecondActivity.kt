package com.company.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity(){

    //배열
    var modelList = ArrayList<MyModel>()

    private lateinit var appRecylerAdapter : AppRecylerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
        //        액션바->툴바
//        setSupportActionBar(toolbar)


//        var mySong1 = MyModel()
//        var mySong2 = MyModel()
//        var mySong3 = MyModel()
//        var mySong4 = MyModel()
//        var mySong5 = MyModel()


        //반목문
        for (i in 1..30) {
            var myModel  = MyModel(name = "노래제목 $i", songImg = "https://cdnimg.melon.co.kr/cm2/album/images/104/37/339/10437339_20200529153602_500.jpg/melon/resize/120/quality/80/optimize")
            this.modelList.add(myModel)
        }


        appRecylerAdapter = AppRecylerAdapter()

        appRecylerAdapter.submitList(modelList)

        App_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@SecondActivity, LinearLayoutManager.VERTICAL, false)
            adapter = appRecylerAdapter
        }



    }
}