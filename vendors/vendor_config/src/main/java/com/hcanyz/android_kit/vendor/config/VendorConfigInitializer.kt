package com.hcanyz.android_kit.vendor.config

import android.content.Context
import android.content.pm.ApplicationInfo
import androidx.startup.Initializer


class VendorConfigInitializer : Initializer<IZConfig> {

    override fun create(context: Context): IZConfig {
        val canDebugInit =
            context.applicationInfo != null && context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
        return ZConfigImpl(canDebugInit, canDebugInit)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}