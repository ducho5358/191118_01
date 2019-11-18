package com.tjoeun.a191118_01.utils

import android.content.Context


class ContextUtil {

    companion object {


        // 메모장의 파일 이름에 대응되는 개념.
        val prefName = "PracticePrefference"


        // 사용자의 아이디를 저장하는 항목 이름
        val USER_ID = "USER_ID"

        //메모장(파일이름 : PracticePrefference)을 실제로 여는 동작
        fun setUserId(context: Context, userId:String) {

            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString(USER_ID, userId).apply()
        }


        fun getUserId(context: Context) : String {


            //메모장(파일이름 : PracticePrefference)을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            return pref.getString(USER_ID, "")!!

        }

    }
}