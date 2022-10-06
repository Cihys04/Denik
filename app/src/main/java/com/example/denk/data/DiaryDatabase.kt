package com.example.denk.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DiaryEntity::class], version = 1)
abstract class DiaryDatabase: RoomDatabase() {

    abstract fun diaryDao(): DiaryDao

    companion object{
            private var INSTANCE: DiaryDatabase? = null
            fun getInstance(context: Context): DiaryDatabase{
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DiaryDatabase::class.java,
                        "diary_database"
                    ).fallbackToDestructiveMigration().build()
                }
                return instance
            }
    }
}