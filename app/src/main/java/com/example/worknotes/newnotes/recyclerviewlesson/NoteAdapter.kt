package com.example.worknotes.newnotes.recyclerviewlesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.worknotes.newnotes.recyclerviewlesson.databinding.NoteCardBinding
import com.example.worknotes.newnotes.recyclerviewlesson.model.NoteModel

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteHolder>() {
    private val noteList = ArrayList<NoteModel>()

    class NoteHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = NoteCardBinding.bind(view)
        fun bind(note: NoteModel) {
            binding.textNote.text = note.text
            binding.nameNote.text = note.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_card, parent, false)
        return NoteHolder(view)
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        holder.bind(noteList[position])
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
    fun addNote(note:NoteModel){
        noteList.add(note)
        notifyDataSetChanged()
    }
}