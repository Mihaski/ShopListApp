package com.example.shoplistapp.domain

import javax.inject.Inject

class EditShopItemUC @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun editShopItemUC(shopItem: ShopItem) {
        shopListRepository.editShopItemR(shopItem)
    }
}