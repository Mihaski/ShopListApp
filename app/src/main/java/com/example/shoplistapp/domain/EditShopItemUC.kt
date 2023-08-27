package com.example.shoplistapp.domain

class EditShopItemUC(private val shopListRepository: ShopListRepository) {

    suspend fun editShopItemUC(shopItem: ShopItem) {
        shopListRepository.editShopItemR(shopItem)
    }
}