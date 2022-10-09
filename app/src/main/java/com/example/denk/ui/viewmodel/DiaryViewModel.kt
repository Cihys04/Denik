package com.example.denk.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.denk.data.DiaryEntity
import com.example.denk.domain.repository.DiaryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DiaryViewModel(private val repo: DiaryRepository) : ViewModel() {

    private val _state = MutableStateFlow(DiaryEntity())
    val state: StateFlow<DiaryEntity> = _state.asStateFlow()

    private fun findById() = viewModelScope.launch {
        //repo.findById()
    }
}