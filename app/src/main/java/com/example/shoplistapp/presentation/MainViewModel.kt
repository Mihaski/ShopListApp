package com.example.shoplistapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplistapp.data.ShopListRepositoryImpl
import com.example.shoplistapp.domain.DeleteShopItemUC
import com.example.shoplistapp.domain.EditShopItemUC
import com.example.shoplistapp.domain.GetShopListUC
import com.example.shoplistapp.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUC(repository)
    private val deleteShopItemUseCase = DeleteShopItemUC(repository)
    private val editShopItemUseCase = EditShopItemUC(repository)

    val shopListVM = MutableLiveData<List<ShopItem>>()

    fun getShopListVM() {
        val list = getShopListUseCase.getShopListUC()
        shopListVM.value = list
    }

    fun deleteShopItemVM(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItemUC(shopItem)
        getShopListVM()
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopItemUC(newItem)
        getShopListVM()
    }

}