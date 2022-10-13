package com.example.denk.data.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EntryDao {

    @Query("SELECT * FROM Entry")
    fun getEntries() : Flow<List<Entry>>

    @Query("SELECT * FROM Entry WHERE id=:id")
    suspend fun findById(id: Long) : Entry?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertEntry(entry: Entry)

    @Delete
    suspend fun deleteEntry(entry: Entry)

    @Update
    suspend fun updateEntry(entry: Entry)
}