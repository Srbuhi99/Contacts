package com.example.contacts.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.R
import com.example.contacts.view.adapter.ContactGroupsAdapter
import com.example.contacts.viewmodel.ContactGroupsViewModel
import kotlinx.android.synthetic.main.fragment_contact_groups.*


class ContactGroupsFragment : Fragment() {

     companion object{
        fun newInstance() = ContactGroupsFragment()
     }

    private lateinit var viewModel:ContactGroupsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_groups, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ContactGroupsViewModel::class.java)

        recycler.layoutManager = LinearLayoutManager(context)
        val items = viewModel.getContactGroups()

        recycler.adapter = ContactGroupsAdapter(items, requireContext())
    }

}