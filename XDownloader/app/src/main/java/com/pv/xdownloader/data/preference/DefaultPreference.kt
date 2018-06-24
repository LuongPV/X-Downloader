package com.pv.xdownloader.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.pv.xdownloader.data.DataConstant

class DefaultPreference(context: Context) : Preference {
    private var nativePreference: SharedPreferences = context.getSharedPreferences(DataConstant.PREF_FILE_NAME, Context.MODE_PRIVATE)


}