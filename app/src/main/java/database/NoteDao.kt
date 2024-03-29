package database

import androidx.lifecycle.LiveData
import androidx.room.*
import model.Note

@Dao
interface NoteDao {
    @Insert
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM Note LIMIT 1")
    fun getNotepad(): LiveData<Note?>

    @Update
    suspend fun updateNote(note: Note)
}