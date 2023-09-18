package com.example.commoncode.room

//import android.app.Application
//import androidx.room.Room
//import com.pdfReaderApp.database.ReaderDataBase
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object DataBaseModule {
//
//    @Provides
//    @Singleton
//    internal fun provideDB(app: Application): ReaderDataBase {
//        return Room.databaseBuilder(app, ReaderDataBase::class.java, "PDF_reader")
//            .fallbackToDestructiveMigration()
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun providesReaderDao(readerDataBase: ReaderDataBase) = readerDataBase.getDao()
//}