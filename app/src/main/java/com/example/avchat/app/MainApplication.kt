package com.example.avchat.app

import android.app.Application
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler

class MainApplication : Application() {
    override fun onCreate() {
        // 创建RootHandler
        val rootHandler = DefaultRootUriHandler(this)
        // 初始化，必须在主线程调用
        Router.init(rootHandler)

        super.onCreate()
    }
}