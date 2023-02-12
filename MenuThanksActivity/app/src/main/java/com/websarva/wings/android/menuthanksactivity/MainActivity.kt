package com.websarva.wings.android.menuthanksactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //リスト画面から渡されたデータを取得。
        val menuName = intent.getStringExtra("menuName")
        val menuPrice = intent.getStringExtra("menuPrice")

        val tvMenuName = findViewById<TextView>(R.id.txMenuName)
        val tvMenuPrice = findViewById<TextView>(R.id.txMenuPrice)

        tvMenuName.text = menuName
        tvMenuPrice.text = menuPrice
    }
    fun onBackButtonClick(view:View) {
        finish()
    }
    private inner class onItemClickListener:AdaptView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id:Long){
            val item = parent.getItemAtPosition(position) as MutableMap<String, String>
            val menuName = item["name"]
            val menuPrice = item["price"]
            val intent2MenuThanks = Intent(this@MainActivity, MenuThanksActivity::class.java)
            inten2MenuThanks.putExtra("menuName", menuName)
            inten2MenuThanks.putExtra("menuExtraPrice", menuPrice)
            startActivities(intent2MenuThanks)
        }
    }
}