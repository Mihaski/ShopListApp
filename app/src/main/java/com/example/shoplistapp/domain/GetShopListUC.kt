package com.example.shoplistapp.domain

import androidx.lifecycle.LiveData
import javax.inject.Inject

class GetShopListUC @Inject constructor(private val shopListRepository: ShopListRepository) {

    fun getShopListUC(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopListR()
    }
}