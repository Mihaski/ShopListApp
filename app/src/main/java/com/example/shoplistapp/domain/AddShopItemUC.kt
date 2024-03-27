package com.example.shoplistapp.domain

import javax.inject.Inject

class AddShopItemUC @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun addShopItemUC(shopItem: ShopItem) {
        shopListRepository.addShopItemR(shopItem)
    }
}