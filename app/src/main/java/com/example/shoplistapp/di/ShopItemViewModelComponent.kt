package com.example.shoplistapp.di

import com.example.shoplistapp.presentation.ShopItemViewModel
import dagger.Component

@Component(modules = [ModuleData::class])
interface ShopItemViewModelComponent {

    fun injectShopItemViewModel(shopItemViewModel: ShopItemViewModel)
}