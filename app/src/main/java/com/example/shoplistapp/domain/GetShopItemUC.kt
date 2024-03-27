package com.example.shoplistapp.domain

import javax.inject.Inject

class GetShopItemUC @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItemUC(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemR(shopItemId)
    }
}