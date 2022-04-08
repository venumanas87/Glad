package xyz.v.glad.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import xyz.v.glad.R
import xyz.v.glad.RpDao
import xyz.v.glad.adapters.TileAdapter
import xyz.v.glad.utils.MySp


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        initSetup(view)

        return view
    }

    @SuppressLint("SetTextI18n")
    private fun initSetup(view:View) {
        val recyclerView:RecyclerView = view.findViewById(R.id.recyclerView)
        val tileList:ArrayList<RpDao> = ArrayList()
        tileList.add(RpDao("Sleep",""))
        tileList.add(RpDao("Night time",""))
        tileList.add(RpDao("Rainy",""))
        val adapter = TileAdapter(tileList)
        recyclerView.adapter = adapter

        val nameTV:TextView = view.findViewById(R.id.nameTV)
        val name = MySp.get("nickname",requireContext())
        nameTV.text = "Hi $name,"




    }

}