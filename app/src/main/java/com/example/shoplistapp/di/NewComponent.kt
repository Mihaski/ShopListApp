package com.example.shoplistapp.di

import com.example.shoplistapp.data.ShopListRepositoryImpl
import dagger.Component

@Component(modules = [ModuleData::class])
interface NewComponent {

    fun inject(shopListRepositoryImpl: ShopListRepositoryImpl)
}