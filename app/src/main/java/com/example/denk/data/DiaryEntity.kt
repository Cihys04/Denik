package com.example.denk.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class DiaryEntity(
    @PrimaryKey(autoGenerate = true) var id: Long = 0L,
    val date: Date? = null,
    val entry: String? = null
)
