package com.example.worknotes.newnotes.recyclerviewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worknotes.newnotes.recyclerviewlesson.databinding.ActivityMainBinding
import com.example.worknotes.newnotes.recyclerviewlesson.model.NoteModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = NoteAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {

        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.adapter = adapter
            addButton.setOnClickListener {
                val note = NoteModel("1", "2")
                adapter.addNote(note)
            }
        }

    }
}

