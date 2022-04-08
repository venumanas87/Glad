package xyz.v.glad.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import xyz.v.glad.utils.MySp
import xyz.v.glad.R
import xyz.v.glad.utils.Singleton.Companion.transparentStatusBar

class AnonymousActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var nxt_btn:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anonymous)
        transparentStatusBar()

        etName = findViewById(R.id.et_name)
        nxt_btn = findViewById(R.id.next_btn)
        nxt_btn.setOnClickListener{
            MySp.insert("nickname", etName.text.toString(), this)
            startActivity(Intent(this,DashboardActivity::class.java))
        }

    }
}