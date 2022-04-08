package xyz.v.glad.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import xyz.v.glad.R
import xyz.v.glad.RpDao
import xyz.v.glad.adapters.TherapyAdapter
import xyz.v.glad.adapters.TileAdapter
import xyz.v.glad.utils.MySp

class MentorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_mentor, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcTherapists)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        val list = ArrayList<RpDao>()
        list.add(RpDao("Dr. Namita Sen",""))
        list.add(RpDao("Dr. Khusboo Pandey",""))
        list.add(RpDao("Dr. Rai Chadhary",""))
        list.add(RpDao("Dr. Seema Majumdar",""))
        list.add(RpDao("Dr. Don Bosco",""))
        list.add(RpDao("Dr. Venu Manas",""))
        recyclerView.adapter = TherapyAdapter(list)


        return view
    }


}