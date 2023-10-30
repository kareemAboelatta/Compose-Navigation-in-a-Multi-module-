package com.example.chat.di

import android.content.Context
import androidx.navigation.NavHostController
import com.example.chat.navigation.ChatNavigationImpl
import com.example.core.utils.ChatNavigationContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ChatModule {

    @Provides
    @Singleton
    fun provideChatNavigationContract(): ChatNavigationContract =  ChatNavigationImpl()

}