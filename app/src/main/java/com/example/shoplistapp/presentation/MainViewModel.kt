package com.example.shoplistapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoplistapp.data.ShopListRepositoryImpl
import com.example.shoplistapp.domain.DeleteShopItemUC
import com.example.shoplistapp.domain.EditShopItemUC
import com.example.shoplistapp.domain.GetShopListUC
import com.example.shoplistapp.domain.ShopItem
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    application: Application,
    repository: ShopListRepositoryImpl,
) : AndroidViewModel(application) {

//    private val repository = ShopListRepositoryImpl(application) //by dagger

    private val getShopListUseCase = GetShopListUC(repository)
    private val deleteShopItemUseCase = DeleteShopItemUC(repository)
    private val editShopItemUseCase = EditShopItemUC(repository)


    val shopListVM = getShopListUseCase.getShopListUC()

    fun deleteShopItemVM(shopItem: ShopItem) {
        viewModelScope.launch {
            deleteShopItemUseCase.deleteShopItemUC(shopItem)
        }
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        viewModelScope.launch {
            editShopItemUseCase.editShopItemUC(newItem)
        }
    }
}