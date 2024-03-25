package com.example.shoplistapp.di

import com.example.shoplistapp.data.ShopListRepositoryImpl
import dagger.Component

@Component
interface ShopListRepositoryImplComponent {

    fun injectShopListRepositoryImpl(repositoryImpl: ShopListRepositoryImpl)
}