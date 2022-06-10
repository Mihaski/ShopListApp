package com.example.shoplistapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopItemR(shopItemId: Int): ShopItem

    fun getShopListR(): LiveData<List<ShopItem>>

    fun addShopItemR(shopItem: ShopItem)

    fun deleteShopItemR(shopItem: ShopItem)

    fun editShopItemR(shopItem: ShopItem)
}