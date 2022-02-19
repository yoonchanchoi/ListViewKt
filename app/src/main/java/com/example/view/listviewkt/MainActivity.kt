package com.example.view.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "제롱동이1", "28", "안녕하세요"),
        User(R.drawable.android, "제롱동이2", "29", "반갑"),
        User(R.drawable.android, "제롱동이3", "30", "굿잡"),
        User(R.drawable.android, "제롱동이4", "31", "닌겐"),
        User(R.drawable.android, "제롱동이5", "32", "심심하당"),
        User(R.drawable.android, "제롱동이6", "33", "제롱의 숲"),
    )


    private lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {    //액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview=findViewById(R.id.listview)
        val Adapter = UserAdapter(this, UserList)
        listview.adapter = Adapter


        listview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectItem.name,Toast.LENGTH_SHORT).show()
        }


//        val item = arrayOf("사과", "배", "딸기", "키위", "제롱동이")
//        // context란 한 액티비티의 모든 정보를담고 있다.
//        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)

    }
}