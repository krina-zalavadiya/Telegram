package com.dhuli.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dhuli.telegram.Model.ChatList
import com.dhuli.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var Names = arrayOf("HM","Chinki","Minki","A","B","C","D","E","F","G")
        var imges = arrayOf(R.drawable.img,R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img,R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img,R.drawable.img1)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        binding.ChatList.layoutManager = LinearLayoutManager(applicationContext)
        binding.ChatList.adapter = ChatList(Names)

        setContentView(binding.root)

        binding.menu.setOnClickListener {
            binding.drawer.openDrawer(Gravity.LEFT)
        }

       /* for ( x in 0..imges.size-1){
                  var data = ChatList(Names.get(x),imges.get(x))
        }
*/
    }
}