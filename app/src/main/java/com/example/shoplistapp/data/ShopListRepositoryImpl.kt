package com.example.shoplistapp.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.shoplistapp.di.DaggerShopListRepositoryImplComponent
import com.example.shoplistapp.domain.ShopItem
import com.example.shoplistapp.domain.ShopListRepository
import javax.inject.Inject

class ShopListRepositoryImpl @Inject constructor(
    application: Application,
    private val mapper: ShopListMapper
) : ShopListRepository {

    private val shopListDao = AppDataBase.getInstance(application).shopListDao()

//  @Inject
//  lateinit var mapper: ShopListMapper // init by dagger however init dagger, move in constructor

    init {
        DaggerShopListRepositoryImplComponent.create().injectShopListRepositoryImpl(this)
    }

    override suspend fun getShopItemR(shopItemId: Int): ShopItem =
        mapper.mapDBModelToEntity(
            shopListDao.getShopItem(shopItemId)
        )

    override fun getShopListR(): LiveData<List<ShopItem>> =
        MediatorLiveData<List<ShopItem>>().apply {
            addSource(shopListDao.getShopList()) {
                value = mapper.listDBModelToListEntity(it)
            }
        }

    override suspend fun addShopItemR(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDBModel(shopItem))
    }

    override suspend fun deleteShopItemR(shopItem: ShopItem) {
        shopListDao.delShopItem(shopItem.id)
    }

    override suspend fun editShopItemR(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDBModel(shopItem))
    }
}