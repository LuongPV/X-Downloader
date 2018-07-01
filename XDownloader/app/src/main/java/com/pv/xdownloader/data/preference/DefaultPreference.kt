package com.pv.xdownloader.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.pv.xdownloader.data.DataConstant

class DefaultPreference(context: Context) : Preference {

    override fun getDownloadingCount(): Int {
        return nativePreference.getInt(DataConstant.PREF_DOWNLOADING_COUNT, -1)
    }

    override fun getDownloadedCount(): Int {
        return nativePreference.getInt(DataConstant.PREF_DOWNLOADED_COUNT, -1)
    }

    override fun getNotStartedCount(): Int {
        return nativePreference.getInt(DataConstant.PREF_NOT_STARTED_COUNT, -1)
    }

    override fun getStopCount(): Int {
        return nativePreference.getInt(DataConstant.PREF_STOP_COUNT, -1)
    }

    private var nativePreference: SharedPreferences = context.getSharedPreferences(DataConstant.PREF_FILE_NAME, Context.MODE_PRIVATE)

    override fun isGuideCompleted(): Boolean {
        return nativePreference.getBoolean(DataConstant.PREF_GUIDE_COMPLETE, false)
    }

    override fun setGuideComplete(isComplete: Boolean): Boolean {
        return nativePreference.edit().putBoolean(DataConstant.PREF_GUIDE_COMPLETE, isComplete).commit()
    }

}