package com.example.radioapp.cardrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.radioapp.R


class RecyclerViewAdapter(private val cardList: ArrayList<Card>, private val mListener: CardClickListener) : RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CardViewHolder(v)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindItems(cardList[position])
        holder.listLayout.setOnClickListener {
            mListener.onCardClicked(holder, position)
        }
        holder.listLayout.setOnLongClickListener {
            mListener.onCardLongClicked(holder, position)
            true
        }
        holder.animationScaleIn(holder.itemView, position)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }
}
