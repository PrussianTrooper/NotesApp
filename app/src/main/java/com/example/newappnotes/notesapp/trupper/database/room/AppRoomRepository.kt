package com.example.newappnotes.notesapp.trupper.database.room

import androidx.lifecycle.LiveData
import com.example.newappnotes.notesapp.trupper.database.DataBaseRepository
import com.example.newappnotes.notesapp.trupper.model.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao): DataBaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
      appRoomDao.delete(note)
          }
}