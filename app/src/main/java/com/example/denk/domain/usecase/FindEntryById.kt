package com.example.denk.domain.usecase

import com.example.denk.domain.repository.EntryRepository

class FindEntryById(private val repository: EntryRepository) {

    suspend operator fun invoke(id: Long){
        repository.findById(id)
    }

}