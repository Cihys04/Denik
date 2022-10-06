package com.example.denk.domain.repository

import com.example.denk.data.DiaryDao
import com.example.denk.data.DiaryEntity
import kotlinx.coroutines.flow.StateFlow

class DiaryRepository(private val dao: DiaryDao) {

    val showAll : List<DiaryEntity> = dao.displayAll()

    suspend fun findById(id : Long) : DiaryEntity?{
        return dao.findById(id)
    }

    suspend fun insertEntry(entity: DiaryEntity){
        return dao.insertDiaryEntry(entity)
    }

    suspend fun deleteEntry(entity: DiaryEntity){
        return dao.deleteDiaryEntry(entity)
    }

    suspend fun updateDiaryEntry(entity: DiaryEntity){
        return dao.updateDiaryEntry(entity)
    }

}