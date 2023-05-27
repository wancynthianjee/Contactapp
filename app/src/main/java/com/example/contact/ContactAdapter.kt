package com.example.contact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactListBinding

class ContactAdapter(private val contactList: List<ContactData>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactData = contactList[position]
        holder.bind(contactData)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    inner class ContactViewHolder(private val binding: ContactListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contactData: ContactData) {
            binding.contactNameTextView.text = contactData.name
        }
    }
}