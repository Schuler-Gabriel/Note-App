package com.schuler.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.schuler.noteapp.data.NoteDataSource
import com.schuler.noteapp.model.Note

class NoteViewModel: ViewModel() {
    var noteList = mutableStateListOf<Note>()
    private set

    init {
        noteList.addAll(NoteDataSource().loadNote())
    }
    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }

//    fun getAllNotes(): List<Note> {
//        return noteList
//    }
}