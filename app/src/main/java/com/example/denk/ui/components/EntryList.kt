package com.example.denk.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.denk.data.room.Entry
import com.example.denk.ui.viewmodel.EntryViewModel

@Composable
fun EntryList(viewModel: EntryViewModel, entry: Entry){
    for (i in viewModel.state){
        Card(modifier = Modifier.fillMaxWidth().height(30.dp),
            shape = MaterialTheme.shapes.medium,
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = MaterialTheme.colors.surface) {
                Text(text = entry.date.toString())
        }
    }
}