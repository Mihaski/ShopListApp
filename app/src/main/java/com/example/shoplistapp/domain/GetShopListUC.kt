package com.example.shoplistapp.domain

class GetShopListUC(private val shopListRepository: ShopListRepository) {

    fun getShopListUC(): List<ShopItem> {
        return shopListRepository.getShopListR()
    }
}