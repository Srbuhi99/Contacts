package com.example.contacts.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.R
import com.example.contacts.databinding.ContactGroupCardBinding
import com.example.contacts.model.ContactGroup

class ContactGroupsAdapter(val items: ArrayList<ContactGroup>, val context:Context):
    RecyclerView.Adapter<ContactGroupsAdapter.GroupsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupsViewHolder {
        var inflater = LayoutInflater.from(context)
        val view = DataBindingUtil.inflate<ContactGroupCardBinding>(inflater,R.layout.contact_group_card,parent,false)
       return GroupsViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroupsViewHolder, position: Int) {
        holder.view.model = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class GroupsViewHolder(var view : ContactGroupCardBinding):RecyclerView.ViewHolder(view.root)
}