package com.websarva.wings.android.menusample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {

    private var _menuList:MutableList<MutableMap<String, Any>> = mutableListOf()
    private var _from = arrayOf("name", "price")
    private var _to = intArrayOf(R.id.tvMenuNameRow, R.id.tvMenuPriceRow)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _menuList = createTeishokuList()
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        val adapter = SimpleAdapter(this@MainActivity, _menuList, R.layout.row, _from, _to)
        lvMenu.adapter = adapter
        lvMenu.onItemClickListener = ListItemClickListener()

    }
    private fun createTeishokuList():MutableList<MutableMap<String, Any>> {
        val menuList:MutableList<MutableMap<String, Any>> = mutableListOf()
        var menu = mutableMapOf<String, Any>("name" to "からあげ定食", "price" to 800, "desc" to "若鶏のからあげにサラダ、ご飯とおみそ汁が付きます。")
        menuList.add(menu)
        menu = mutableMapOf<String, Any>("name" to "ハンバーグ定食", "price" to 800, "desc" to "手捏ねハンバーグにサラダ、ご飯とおみそ汁が付きます。")
        menuList.add(menu)
        return menuList
    }
    private fun createCurryList():MutableList<MutableMap<String, Any>>{
        val menuList:MutableList<MutableMap<String, Any>> = mutableListOf()
        var menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to 520, "desc" to "特選スパイスを聞かせた国産ビーフ")
        menuList.add(menu)
        menu = mutableMapOf<String, Any>("name" to "ポークカレー", "price" to 520, "desc" to "特選スパイスを聞かせた国産豚")
        menuList.add(menu)
        return menuList
    }
    private inner class ListItemClickListener: AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as MutableMap<String, Any>
            val menuName = item["name"] as String
            val menuPrice = item["price"] as Int
            val intent2MenuThanks = Intent(this@MainActivity, MenuThanksActivity::class.java)
            intent2MenuThanks.putExtra("menuName", menuName)
            intent2MenuThanks.putExtra("menuPrice", "${menuPrice}円")
            startActivity(intent2MenuThanks)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu):Boolean{
        menuInflater.inflate(R.menu.menu_options_menu_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var returnVal = true
        when(item.itemId) {
            R.id.menuListOptionTeishoku ->
                _menuList = createTeishokuList()
            R.id.menuListOptionCurry ->
                _menuList = createCurryList()
            else ->
                returnVal = super.onOptionsItemSelected(item)
        }
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        val adapter = SimpleAdapter(this@MainActivity, _menuList, R.layout.row, _from, _to)
        lvMenu.adapter = adapter
        return returnVal
    }
}