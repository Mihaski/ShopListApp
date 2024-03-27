package com.example.shoplistapp.domain

import javax.inject.Inject

class DeleteShopItemUC @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItemUC(shopItem: ShopItem) {
        shopListRepository.deleteShopItemR(shopItem)
    }
}