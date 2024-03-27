package com.example.shoplistapp.di

import android.app.Application
import com.example.shoplistapp.data.ShopListRepositoryImpl
import com.example.shoplistapp.domain.ShopListRepository
import dagger.Module
import dagger.Provides

@Module
class ModuleData(private val application: Application) {

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    fun provideShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository {
        return impl
    }
}