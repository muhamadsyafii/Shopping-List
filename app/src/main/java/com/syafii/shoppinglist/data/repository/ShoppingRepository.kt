package com.syafii.shoppinglist.data.repository

import com.syafii.shoppinglist.data.db.ShoppingDatabase
import com.syafii.shoppinglist.data.entities.ShoppingItem

class ShoppingRepository(
    private val db : ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}