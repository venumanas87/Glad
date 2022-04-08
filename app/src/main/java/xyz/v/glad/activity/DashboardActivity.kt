package xyz.v.glad.activity

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.FrameLayout
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.card.MaterialCardView
import xyz.v.glad.R
import xyz.v.glad.fragment.HomeFragment

class DashboardActivity : AppCompatActivity() {
    private lateinit var fragmentContainer:FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        fragmentContainer = findViewById(R.id.fragment_container)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container,HomeFragment())
            .commit()
        val bottomNavigationView: BottomNavigationView =findViewById(R.id.bottom_nav);
        val menuView: BottomNavigationMenuView = bottomNavigationView.getChildAt(0) as BottomNavigationMenuView

        for (i in 0 until menuView.childCount) {

            if (i == 2) {

                val iconView: View = menuView.getChildAt(i).findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view)
                val layoutParams: ViewGroup.LayoutParams = iconView.layoutParams;
                val displayMetrics: DisplayMetrics = resources.displayMetrics;
                layoutParams.height =
                    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics)
                        .toInt()
                layoutParams.width =
                    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50f, displayMetrics)
                        .toInt()
                iconView.layoutParams = layoutParams;
            }
            bottomNavigationView.setOnNavigationItemSelectedListener { item->
                when(item.itemId){
                    R.id.home ->{
                    true
                    }

                    R.id.add ->{
                        showModal()
                        true
                    }

                    else -> {
                        true
                    }
                }
            }
        }
    }
    private fun showModal() {
        val btmsht = BottomSheetDialog(this)
        btmsht.requestWindowFeature(Window.FEATURE_NO_TITLE)
        btmsht.window?.decorView?.setBackgroundResource(android.R.color.transparent)
        btmsht.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
        btmsht.setContentView(R.layout.bottom_sheet_msg)
        btmsht.setOnShowListener { dia ->
            val bottomSheetDialog = dia as BottomSheetDialog
            val bottomSheetInternal: FrameLayout =
                bottomSheetDialog.findViewById(com.google.android.material.R.id.design_bottom_sheet)!!
            bottomSheetInternal.setBackgroundResource(R.drawable.et_bg)
        }
        btmsht.show()
    }

}