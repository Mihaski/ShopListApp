package com.example.shoplistapp.domain

class EditShopItemUC(private val shopListRepository: ShopListRepository) {

    fun editShopItemUC(shopItem: ShopItem) {
        shopListRepository.editShopItemR(shopItem)
    }
}