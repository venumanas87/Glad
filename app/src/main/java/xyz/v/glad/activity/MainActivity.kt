package xyz.v.glad.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import xyz.v.glad.R
import xyz.v.glad.utils.Singleton.Companion.transparentStatusBar

class MainActivity : AppCompatActivity() {
    lateinit var anonym_btn:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anonym_btn = findViewById(R.id.anonym_btn)
        anonym_btn.setOnClickListener {
            startActivity(Intent(this, AnonymousActivity::class.java))
            overridePendingTransition(R.anim.screen_slide_in_from_right,R.anim.screen_slide_out_to_left)
        }
        
        transparentStatusBar()
    }





}