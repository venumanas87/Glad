package xyz.v.glad.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import xyz.v.glad.R
import xyz.v.glad.RpDao

class TherapyAdapter(val tileList:ArrayList<RpDao>): RecyclerView.Adapter<TherapyAdapter.Mvh>() {


    inner class Mvh(view: View): RecyclerView.ViewHolder(view){
        val titleTV: TextView = view.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mvh {
        return Mvh(LayoutInflater.from(parent.context).inflate(R.layout.therapist_card, parent, false))
    }

    override fun onBindViewHolder(holder: Mvh, position: Int) {
        val obj = tileList[position]
        holder.titleTV.text = obj.title
    }

    override fun getItemCount(): Int {
        return tileList.size
    }


}