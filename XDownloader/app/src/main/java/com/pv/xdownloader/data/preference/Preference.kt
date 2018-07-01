package com.pv.xdownloader.data.preference

interface Preference {

    fun isGuideCompleted(): Boolean

    fun setGuideComplete(isComplete: Boolean): Boolean

}