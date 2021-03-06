/*
 * Created by Muhamad Syafii
 * Wednesday, 05/5/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.syafii.shoppinglist.data.repository.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository: ShoppingRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}