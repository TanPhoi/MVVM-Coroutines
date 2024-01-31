package com.example.mvvm_coroutines.data.local

import com.example.mvvm_coroutines.data.local.dao.ItemDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalRepository @Inject constructor(
    private val itemDao: ItemDao
) {

}