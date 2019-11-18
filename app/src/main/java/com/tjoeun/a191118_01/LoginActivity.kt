package com.tjoeun.a191118_01


import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupEvents()
        setValues()


    }


    override fun setupEvents() {

        loginBtn.setOnClickListener {
            if(rememberIdCheckBox.isChecked) {
                Toast.makeText(mContext, "아이디를 저장해야 합니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(mContext, "아이디 저장 X", Toast.LENGTH_SHORT).show()
            }

    }

    override fun setValues() {

    }


    }


