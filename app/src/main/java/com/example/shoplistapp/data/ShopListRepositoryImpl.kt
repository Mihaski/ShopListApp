package com.example.shoplistapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoplistapp.domain.ShopItem
import com.example.shoplistapp.domain.ShopListRepository
import kotlin.random.Random

object ShopListRepositoryImpl : ShopListRepository {

    private val shopListLD = MutableLiveData<List<ShopItem>>()
    private val shopList = sortedSetOf<ShopItem>({ p0, p1 -> p0.id.compareTo(p1.id) })

    private var autoIncrementId = 0

    init {
        for (i in 0 until 100) {
            val item = ShopItem("Name $i", i, Random.nextBoolean())
            addShopItemR(item)
        }
    }

    override fun getShopItemR(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopListR(): LiveData<List<ShopItem>> {
        return shopListLD
    }

    override fun addShopItemR(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()
    }

    override fun deleteShopItemR(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun editShopItemR(shopItem: ShopItem) {
        val oldElement = getShopItemR(shopItem.id)
        shopList.remove(oldElement)
        addShopItemR(shopItem)
    }

    private fun updateList() {
        shopListLD.value = shopList.toList()
    }
}