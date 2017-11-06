package com.adrian.project.ui.main.di

import com.adrian.project.ui.main.model.MainModel
import com.adrian.project.ui.main.service.ApiService
import com.adrian.project.ui.main.view.MainActivity
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
class MainModule {

    @Provides
    fun providesMainRouter(mainActivity: MainActivity) = mainActivity

    @Provides
    fun provideMainModel(apiService: ApiService) = MainModel(apiService)

}