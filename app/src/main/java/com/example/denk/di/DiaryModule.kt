package com.example.denk.di

import android.content.Context
import androidx.room.Room
import com.example.denk.data.room.EntryDao
import com.example.denk.data.room.EntryDatabase
import com.example.denk.domain.repository.EntryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DiaryModule {

    @Provides
    @Singleton
    fun provideDao(entryDatabase: EntryDatabase) : EntryDao{
        return entryDatabase.diaryDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : EntryDatabase{
        return Room.databaseBuilder(
            context,
            EntryDatabase::class.java,
            "diary_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(repository: EntryRepository) : EntryRepository{
        return repository
    }
}