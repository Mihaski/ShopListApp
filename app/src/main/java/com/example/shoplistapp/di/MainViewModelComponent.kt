package com.example.shoplistapp.di

import com.example.shoplistapp.presentation.MainViewModel
import dagger.Component

@Component(modules = [ModuleData::class])
interface MainViewModelComponent {

    fun injectMainViewModel(mainViewModel: MainViewModel)
}