package com.example.shoplistapp.data

import com.example.shoplistapp.domain.ShopItem
import com.example.shoplistapp.domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            val item = ShopItem("Name $i", i, true)
            addShopItemR(item)
        }
    }

    override fun getShopItemR(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopListR(): List<ShopItem> {
        return shopList.toList()
    }

    override fun addShopItemR(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItemR(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItemR(shopItem: ShopItem) {
        val oldElement = getShopItemR(shopItem.id)
        shopList.remove(oldElement)
        addShopItemR(shopItem)
    }
}