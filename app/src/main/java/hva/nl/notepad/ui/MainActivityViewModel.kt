package hva.nl.notepad.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()
}
