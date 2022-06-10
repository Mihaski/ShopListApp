package com.example.shoplistapp.domain

import androidx.lifecycle.LiveData

class GetShopListUC(private val shopListRepository: ShopListRepository) {

    fun getShopListUC(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopListR()
    }
}