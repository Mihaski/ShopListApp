package com.example.shoplistapp.domain

class DeleteShopItemUC(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItemUC(shopItem: ShopItem) {
        shopListRepository.deleteShopItemR(shopItem)
    }
}