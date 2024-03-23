package com.example.shoplistapp.data

import com.example.shoplistapp.domain.ShopItem
import javax.inject.Inject

class ShopListMapper @Inject constructor() {

    fun mapEntityToDBModel(shopItem: ShopItem) = ShopItemDBModel(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled
    )

    fun mapDBModelToEntity(shopItemDBModel: ShopItemDBModel) = ShopItem(
        id = shopItemDBModel.id,
        name = shopItemDBModel.name,
        count = shopItemDBModel.count,
        enabled = shopItemDBModel.enabled
    )

    fun listDBModelToListEntity(list: List<ShopItemDBModel>) = list.map {
        mapDBModelToEntity(it)
    }
}