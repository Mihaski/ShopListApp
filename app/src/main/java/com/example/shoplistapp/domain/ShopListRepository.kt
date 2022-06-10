package com.example.shoplistapp.domain

interface ShopListRepository {

    fun getShopItemR(shopItemId: Int): ShopItem

    fun getShopListR(): List<ShopItem>

    fun addShopItemR(shopItem: ShopItem)

    fun deleteShopItemR(shopItem: ShopItem)

    fun editShopItemR(shopItem: ShopItem)
}