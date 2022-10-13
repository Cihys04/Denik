package com.example.denk.domain.usecase

import com.example.denk.data.room.Entry
import com.example.denk.domain.repository.EntryRepository

class CreateEntry(private val repository: EntryRepository) {

    suspend operator fun invoke(entry: Entry) {
        repository.insertEntry(entry)
    }

}