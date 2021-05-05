package com.syafii.shoppinglist.ui.shoppinglist

import com.syafii.shoppinglist.data.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}