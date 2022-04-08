package xyz.v.glad.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import xyz.v.glad.utils.MySp
import xyz.v.glad.R
import xyz.v.glad.utils.Singleton.Companion.transparentStatusBar

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        transparentStatusBar()

        Handler().postDelayed({
            if(MySp.get("nickname", this) !="-1"){
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            }else{
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        },1500)


    }
}