package com.example.denk.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Entry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val date: Date,
    val entry: String
)
