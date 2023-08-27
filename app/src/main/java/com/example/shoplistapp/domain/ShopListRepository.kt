package com.example.shoplistapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    suspend fun getShopItemR(shopItemId: Int): ShopItem

    fun getShopListR(): LiveData<List<ShopItem>>

    suspend fun addShopItemR(shopItem: ShopItem)

    suspend fun deleteShopItemR(shopItem: ShopItem)

    suspend fun editShopItemR(shopItem: ShopItem)
}