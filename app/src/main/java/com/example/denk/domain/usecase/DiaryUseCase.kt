package com.example.denk.domain.usecase

import com.example.denk.data.room.DiaryEntity
import com.example.denk.domain.repository.DiaryRepository
import kotlinx.coroutines.flow.Flow

class DiaryUseCase(private val repository: DiaryRepository) {

    fun getEntries() : Flow<List<DiaryEntity>>{
        return repository.getEntries()
    }

    suspend fun findById(id: Long): DiaryEntity?{
        return repository.findById(id)
    }

    suspend fun insert(entity: DiaryEntity){
        repository.insertEntry(entity)
    }

    suspend fun delete(entity: DiaryEntity){
        repository.deleteEntry(entity)
    }

    suspend fun update(entity: DiaryEntity){
        repository.updateEntry(entity)
    }
}