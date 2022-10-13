package com.example.denk.domain.repository

import com.example.denk.data.room.Entry
import kotlinx.coroutines.flow.Flow

interface EntryRepository {

    fun getEntries(): Flow<List<Entry>>

    suspend fun findById(id : Long) : Entry?

    suspend fun insertEntry(entry: Entry)

    suspend fun deleteEntry(entry: Entry)

    suspend fun updateEntry(entry: Entry)

}