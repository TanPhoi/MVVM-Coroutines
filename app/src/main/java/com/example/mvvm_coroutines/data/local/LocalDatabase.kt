package com.example.mvvm_coroutines.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm_coroutines.data.local.dao.ItemDao
import com.example.mvvm_coroutines.data.local.model.Item

@Database(
    entities = [Item::class],
    version = 1,
    exportSchema = false
)
abstract class LocalDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}