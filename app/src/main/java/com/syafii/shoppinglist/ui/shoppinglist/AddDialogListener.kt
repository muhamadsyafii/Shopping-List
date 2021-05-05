/*
 * Created by Muhamad Syafii
 * Wednesday, 05/5/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.shoppinglist.ui.shoppinglist

import com.syafii.shoppinglist.data.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}