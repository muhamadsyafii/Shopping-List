/*
 * Created by Muhamad Syafii
 * Wednesday, 05/5/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.shoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.syafii.shoppinglist.data.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item : ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems() : LiveData<List<ShoppingItem>>
}