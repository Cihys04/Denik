package com.example.denk.data.repository

import com.example.denk.data.room.EntryDao
import com.example.denk.data.room.Entry
import com.example.denk.domain.repository.EntryRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@AndroidEntryPoint
class EntryRepositoryImpl(@Inject private val dao: EntryDao) : EntryRepository {

    override fun getEntries(): Flow<List<Entry>> {
        return dao.getEntries()
    }

    override suspend fun findById(id: Long): Entry? {
        return dao.findById(id)
    }

    override suspend fun insertEntry(entry: Entry) {
        return dao.insertEntry(entry)
    }

    override suspend fun deleteEntry(entry: Entry) {
        return dao.deleteEntry(entry)
    }

    override suspend fun updateEntry(entry: Entry) {
        return dao.updateEntry(entry)
    }
}