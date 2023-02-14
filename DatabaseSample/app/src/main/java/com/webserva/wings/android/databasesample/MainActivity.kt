package com.webserva.wings.android.databasesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var _cocktailId = -1
    private var _cocktailName = ""
    // データベースヘルパーオブジェクト
    private val _helper = DatabaseHelper(this@MainActivity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvCocktail = findViewById<ListView>(R.id.lvCocktail)
        lvCocktail.onItemClickListener = ListItemClickListener()
    }

    override fun onDestroy(){
        _helper.close()
        super.onDestroy()
    }

    fun onSaveButtonClick(view: View){
        val etNote = findViewById<EditText>(R.id.etNote)
        val note = etNote.text.toString()
        //etNote.setText("")
        //データベースヘルパーオブジェクトからデータベース接続オブジェクトを取得
        val db = _helper.writableDatabase
        // リストで選択されたカクテルのメモデータを削除。その後、インサートを行う。
        val sqlDelete = "DELETE FROM cocktailmemos WHERE _id = ?"
        // SQL文字列を元にプリペアドステートメントを取得
        var stmt = db.compileStatement(sqlDelete)
        // 変数のバイド
        stmt.bindLong(1, _cocktailId.toLong())
        // 削除SQLの実行
        stmt.executeUpdateDelete()
        // インサート用SQL文字列の用意
        val sqlInsert = "INSERT INTO cocktailmemos (_id, name, note) VALUES (?, ?, ?)"
        // SQL文字列を元にプリペアドステートメントを取得
        stmt = db.compileStatement(sqlInsert)
        // 変数のバイド
        stmt.bindLong(1, _cocktailId.toLong())
        stmt.bindString(2, _cocktailName)
        stmt.bindString(3, note)
        stmt.executeInsert()
        etNote.setText("")

        val tvCocktailName = findViewById<TextView>(R.id.tvCocktailName)
        tvCocktailName.text = getString(R.string.tv_name)
        val btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.isEnabled = false
    }

    private inner class ListItemClickListener: AdapterView.OnItemClickListener{
        override fun onItemClick(parent:AdapterView<*>, view:View, position:Int, id:Long){
            _cocktailId = position
            _cocktailName = parent.getItemAtPosition(position) as String
            val tvCocktailName = findViewById<TextView>(R.id.tvCocktailName)
            tvCocktailName.text = _cocktailName
            val btnSave = findViewById<Button>(R.id.btnSave)
            btnSave.isEnabled = true

            val db = _helper.writableDatabase
            val sql = "SELECT * FROM cocktailmemos WHERE _id = ${_cocktailId}"
            val cursor = db.rawQuery(sql, null)
            var note =""
            while(cursor.moveToNext()){
                val idxNote = cursor.getColumnIndex("note")
                note = cursor.getString(idxNote)
            }
            val etNote = findViewById<EditText>(R.id.etNote)
            etNote.setText(note)
        }
    }


}