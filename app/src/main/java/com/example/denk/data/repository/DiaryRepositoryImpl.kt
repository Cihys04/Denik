package com.example.denk.data.repository

import com.example.denk.data.room.DiaryDao
import com.example.denk.data.room.DiaryEntity
import com.example.denk.domain.repository.DiaryRepository
import kotlinx.coroutines.flow.Flow

class DiaryRepositoryImpl(private val dao: DiaryDao) : DiaryRepository {

    override fun getEntries(): Flow<List<DiaryEntity>> {
        return dao.getEntries()
    }

    override suspend fun findById(id: Long): DiaryEntity? {
        return dao.findById(id)
    }

    override suspend fun insertEntry(entity: DiaryEntity) {
        return dao.insertDiaryEntry(entity)
    }

    override suspend fun deleteEntry(entity: DiaryEntity) {
        return dao.deleteDiaryEntry(entity)
    }

    override suspend fun updateEntry(entity: DiaryEntity) {
        return dao.updateDiaryEntry(entity)
    }
}