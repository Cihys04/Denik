package com.example.denk.domain.usecase

import javax.inject.Inject

data class EntryUseCase @Inject constructor(
    val createEntry: CreateEntry,
    val deleteEntry: DeleteEntry,
    val findEntryById: FindEntryById,
    val getEntries: GetEntries,
    val updateEntry: UpdateEntry
)