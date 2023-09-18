package com.example.commoncode.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RecentPDF::class, StarredPDF::class, SearchHistoryRecord::class],version = 4,exportSchema = false)
abstract class ReaderDataBase : RoomDatabase() {
    abstract fun getDao() : ReaderDao
}