/*
 * Created by Muhamad Syafii
 * Wednesday, 05/5/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.syafii.shoppinglist.data.entities.ShoppingItem
import com.syafii.shoppinglist.data.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItem() = repository.getAllShoppingItem()
}