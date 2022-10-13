package com.example.denk.domain.usecase

import com.example.denk.domain.repository.EntryRepository

class GetEntries(private val repository: EntryRepository) {

    operator fun invoke(){
        repository.getEntries()
    }

}