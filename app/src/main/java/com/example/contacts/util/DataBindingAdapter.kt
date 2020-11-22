package com.example.contacts.util

import android.view.View
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {
    companion object {

        @JvmStatic
        @BindingAdapter("app:backgraundColor")
        fun setBackgroundColor(view: CardView, color:Int) {
         view.setCardBackgroundColor(view.context.resources.getColor(color))
        }
    }
}