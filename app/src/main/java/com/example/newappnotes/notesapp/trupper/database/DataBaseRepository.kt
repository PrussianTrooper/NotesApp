package com.example.newappnotes.notesapp.trupper.database

import androidx.lifecycle.LiveData
import com.example.newappnotes.notesapp.trupper.model.AppNote
//Вставка и удаление новых записей в репозиторий
interface DataBaseRepository {
    val allNotes: LiveData<List<AppNote>>
    suspend fun insert(note: AppNote,onSuccess:()->Unit)
    suspend fun delete(note: AppNote,onSuccess:()->Unit)

}