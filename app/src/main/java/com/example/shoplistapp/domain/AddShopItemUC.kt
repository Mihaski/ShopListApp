package com.example.shoplistapp.domain

class AddShopItemUC(private val shopListRepository: ShopListRepository) {

    suspend fun addShopItemUC(shopItem: ShopItem) {
        shopListRepository.addShopItemR(shopItem)
    }
}