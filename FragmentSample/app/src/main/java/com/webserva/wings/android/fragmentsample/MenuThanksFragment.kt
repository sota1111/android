package com.webserva.wings.android.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MenuThanksFragment : Fragment() {
    private var _isLayoutXLarge = true
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val menuListFragment = parentFragmentManager.findFragmentById(R.id.fragmentMenuList)
        if(menuListFragment == null){
            _isLayoutXLarge = false
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu_thanks, container, false)
        val extras:Bundle?
        //大画面の場合
        if(_isLayoutXLarge){
            extras = arguments
        }
        else
        {
            val intent = activity?.intent
            extras = intent?.extras
        }

        val menuName = extras?.getString("menuName")
        val menuPrice = extras?.getString("menuPrice")
        val tvMenuName = view.findViewById<TextView>(R.id.tvMenuName)
        val tvMenuPrice = view.findViewById<TextView>(R.id.tvMenuPrice)
        tvMenuName.text = menuName
        tvMenuPrice.text = menuPrice

        val btBackButton = view.findViewById<Button>(R.id.btBackButton)
        btBackButton.setOnClickListener(ButtonClickListener())

        return view
    }
    private inner class ButtonClickListener:View.OnClickListener{
        override fun onClick(view: View){
            if(_isLayoutXLarge){
                val transaction =parentFragmentManager.beginTransaction()
                transaction.remove(this@MenuThanksFragment)
                transaction.commit()
            }
            else {
                activity?.finish()
            }
        }
    }
}