package com.example.shoplistapp.di

import com.example.shoplistapp.presentation.ShopItemFragment
import dagger.Component

@Component(modules = [ModuleData::class])
interface ShopItemFragmentComponent {

    fun injectShopItemFragment(fragment: ShopItemFragment)
}