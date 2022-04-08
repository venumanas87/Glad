package xyz.v.glad.utils

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager

class Singleton {




    companion object{
        fun Activity.transparentStatusBar() {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                window.statusBarColor = Color.TRANSPARENT

            } else
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        }


    }
}