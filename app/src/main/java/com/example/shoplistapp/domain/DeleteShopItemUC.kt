package com.example.shoplistapp.domain

class DeleteShopItemUC(private val shopListRepository: ShopListRepository) {

    fun deleteShopItemUC(shopItem: ShopItem) {
        shopListRepository.deleteShopItemR(shopItem)
    }
}