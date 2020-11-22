package com.example.contacts.viewmodel

import androidx.lifecycle.ViewModel
import com.example.contacts.R
import com.example.contacts.model.ContactGroup

class ContactGroupsViewModel : ViewModel() {

    fun getContactGroups(): ArrayList<ContactGroup>{
        return arrayListOf(
            ContactGroup("Parent","My parents and family", R.color.purple),
            ContactGroup("Work","My colleagues and boss",R.color.pink),
            ContactGroup("Friends","My friends and schoolmates",R.color.yellow),
            ContactGroup("Someone I don`t know","Some people I met on streen", R.color.green)
        )
    }

}