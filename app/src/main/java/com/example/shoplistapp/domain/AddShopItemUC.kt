package com.example.shoplistapp.domain

class AddShopItemUC(private val shopListRepository: ShopListRepository) {

    fun addShopItemUC(shopItem: ShopItem) {
        shopListRepository.addShopItemR(shopItem)
    }
}