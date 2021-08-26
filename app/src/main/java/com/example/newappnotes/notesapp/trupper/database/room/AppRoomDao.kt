package com.example.newappnotes.notesapp.trupper.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newappnotes.notesapp.trupper.model.AppNote

@Dao
interface AppRoomDao {
    @Query("SELECT * from notes_tables")
    fun getAllNotes():LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)

}