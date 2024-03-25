package com.example.shoplistapp.di

import com.example.shoplistapp.presentation.MainActivity
import dagger.Component

@Component(modules = [ModuleData::class])
interface MainActivityComponent {

    fun injectMainActivity(activity: MainActivity)
}