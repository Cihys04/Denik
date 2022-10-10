package com.example.denk.domain.repository

import com.example.denk.data.room.DiaryEntity
import kotlinx.coroutines.flow.Flow

interface DiaryRepository {

    fun getEntries(): Flow<List<DiaryEntity>>

    suspend fun findById(id : Long) : DiaryEntity?

    suspend fun insertEntry(entity: DiaryEntity)

    suspend fun deleteEntry(entity: DiaryEntity)

    suspend fun updateEntry(entity: DiaryEntity)

}