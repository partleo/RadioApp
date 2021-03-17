package com.example.radioapp.cardrecyclerview

interface CardClickListener {
    fun onCardClicked(holder: CardViewHolder, position: Int)
    fun onCardLongClicked(holder: CardViewHolder, position: Int)
}