package com.example.denk.data.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DiaryDao {

    @Query("SELECT * FROM DiaryEntity")
    fun getEntries() : Flow<List<DiaryEntity>>

    @Query("SELECT * FROM DiaryEntity WHERE id=:id")
    suspend fun findById(id: Long) : DiaryEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDiaryEntry(entity: DiaryEntity)

    @Delete
    suspend fun deleteDiaryEntry(entity: DiaryEntity)

    @Update
    suspend fun updateDiaryEntry(entity: DiaryEntity)
}