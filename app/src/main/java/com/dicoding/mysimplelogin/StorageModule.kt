package com.dicoding.mysimplelogin

import org.koin.dsl.module

val StorageModule = module {
    factory {
        SessionManager(get())
    }

    single {
        UserRepository(get())
    }
}