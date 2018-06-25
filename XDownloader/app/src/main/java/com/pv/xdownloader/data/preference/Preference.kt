package com.pv.xdownloader.data.preference

import android.content.SharedPreferences

interface Preference {

    fun getNativePref(): SharedPreferences

}