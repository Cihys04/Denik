package com.example.denk.data

import androidx.room.*

@Dao
interface DiaryDao {
    @Query("SELECT * FROM DiaryEntity")
    fun displayAll() : List<DiaryEntity>

    @Query("SELECT * FROM DiaryEntity WHERE id=:id")
    fun findById(id: Long) : DiaryEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertDiaryEntry(entity: DiaryEntity)

    @Delete
    fun deleteDiaryEntry(entity: DiaryEntity)

    @Update
    fun updateDiaryEntry(entity: DiaryEntity)
}