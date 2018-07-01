package com.pv.xdownloader.data.preference

interface Preference {

    fun isGuideCompleted(): Boolean

    fun setGuideComplete(isComplete: Boolean): Boolean

    fun getDownloadingCount(): Int

    fun getDownloadedCount(): Int

    fun getNotStartedCount(): Int

    fun getStopCount(): Int

}