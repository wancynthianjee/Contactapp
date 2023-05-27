package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      lateinit var binding: ActivityMainBinding
      lateinit var contactList: List<ContactData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        contactList=createContactList()
        val adapter=ContactAdapter(contactList)
        binding.recyclerView.adapter=adapter

        val contactList = listOf<Contact>()
        val adapter=ContactAdapter(contactList = contactList)
        binding.recyclerView.layoutManager =LinearLayoutManager(this)
        binding.recyclerView.adapter=adapter
    }
    fun createContactList(): List<Contact> {
        val contacts = mutableListOf<Contact>()

        contacts.add(Contact("Izzy", "0756453672", "izzy@gmail.com", R.drawable.cutepanda))
        contacts.add(Contact("Fabbi", "070645302", "fabbi@gmail.com", R.drawable.cutepanda))
        contacts.add(Contact("Tami", "01566773672", "tami@gmail.com", R.drawable.cutepanda))
        contacts.add(Contact("Kim", "07450001002", "kim@gmail.com", R.drawable.cutepanda))

        return contacts
    }}
}