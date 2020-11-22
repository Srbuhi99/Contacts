package com.example.contacts.model

data class ContactGroup(
    var name: String,
    var description:String,
    var color: Int
) {
    constructor():this("","",0)
}