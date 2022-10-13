package com.example.denk.ui.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import com.example.denk.data.room.Entry
import com.example.denk.ui.viewmodel.EntryViewModel


@Composable
fun EntryScaffold(viewModel: EntryViewModel, entry: Entry) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = {Text("Deník")}, backgroundColor = MaterialTheme.colors.primary)  },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { FloatingActionButton(onClick = {viewModel.create(entry = entry)}){
            Icon(imageVector = Icons.Default.Add, contentDescription = "fab icon")
        } },
        drawerContent = { Text(text = "Drawer Menu 1") },
        content = { },
        bottomBar = { BottomAppBar(backgroundColor = MaterialTheme.colors.primary) { Text("Bottom App Bar") } }
    )
}