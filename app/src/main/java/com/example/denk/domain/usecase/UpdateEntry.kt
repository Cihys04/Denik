package com.example.denk.domain.usecase

import com.example.denk.data.room.Entry
import com.example.denk.domain.repository.EntryRepository

class UpdateEntry(private val repository: EntryRepository) {

    suspend operator fun invoke(entry: Entry){
        repository.updateEntry(entry)
    }

}