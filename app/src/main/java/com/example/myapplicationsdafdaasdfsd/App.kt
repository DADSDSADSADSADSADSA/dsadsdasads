package com.example.myapplicationsdafdaasdfsd

import android.app.Application
import com.example.myapplicationsdafdaasdfsd.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDatabase(this) }
}