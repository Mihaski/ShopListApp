package com.example.shoplistapp.di

import com.example.shoplistapp.data.ShopListRepositoryImpl
import com.example.shoplistapp.presentation.MainActivity
import dagger.Component

@Component(modules = [ModuleData::class])
interface NewComponent {

    fun injectShopListRepositoryImpl(repositoryImpl: ShopListRepositoryImpl)

    fun injectMainActivity(activity: MainActivity)
}