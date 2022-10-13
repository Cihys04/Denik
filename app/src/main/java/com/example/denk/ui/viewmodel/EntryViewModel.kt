package com.example.denk.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.denk.data.room.Entry
import com.example.denk.domain.usecase.EntryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EntryViewModel(@Inject private val useCase: EntryUseCase) : ViewModel() {

    private val _state = MutableStateFlow<List<Entry>>(emptyList())
    val state
        get() = _state.asStateFlow().value

    init {
        viewModelScope.launch {
            useCase.getEntries()
        }
    }

    fun findById(id:Long){
        viewModelScope.launch {
            useCase.findEntryById(id)
        }
    }

    fun create(entry:Entry){
        viewModelScope.launch {
            useCase.createEntry(entry)
        }
    }

    fun delete(entry: Entry){
        viewModelScope.launch {
            useCase.deleteEntry(entry)
        }
    }

    fun update(entry: Entry){
        viewModelScope.launch {
            useCase.updateEntry(entry)
        }
    }
}