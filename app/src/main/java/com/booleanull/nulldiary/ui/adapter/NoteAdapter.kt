package com.booleanull.nulldiary.ui.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.booleanull.nulldiary.R
import com.booleanull.nulldiary.model.Note
import kotlinx.android.synthetic.main.note_view.view.*

class NoteAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.note_view, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(notes[holder.adapterPosition])

    override fun getItemCount() = notes.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(note: Note) {
            with(itemView) {
                textTheme.text = note.category
                textDate.text = note.date
                textDescription.text = note.description

                if(note.photo == null) {
                    imageDefault.visibility = View.VISIBLE
                    image.visibility = View.GONE
                } else {
                    imageDefault.visibility = View.GONE
                    image.visibility = View.VISIBLE
                    val url = Uri.parse(note.photo)
                    image.setImageURI(url)
                }
            }
        }
    }
}