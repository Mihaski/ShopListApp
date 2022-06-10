package com.example.shoplistapp.domain

class GetShopItemUC(private val shopListRepository: ShopListRepository) {

    fun getShopItemUC(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemR(shopItemId)
    }
}