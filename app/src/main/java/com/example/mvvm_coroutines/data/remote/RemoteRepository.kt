package com.example.mvvm_coroutines.data.remote

import com.example.mvvm_coroutines.data.remote.service.ItemService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteRepository @Inject constructor(
    private val itemService: ItemService
) {

}