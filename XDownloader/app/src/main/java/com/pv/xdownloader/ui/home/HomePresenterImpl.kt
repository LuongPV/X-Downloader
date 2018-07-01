package com.pv.xdownloader.ui.home

import android.content.Context
import com.pv.xdownloader.R
import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.ui.base.MVPPresenterImpl

class HomePresenterImpl(val preference: Preference, val context: Context) : MVPPresenterImpl<HomeContract.HomeView>(), HomeContract.HomePresenter<HomeContract.HomeView> {
    override fun loadBottomMenu() {
        val notStartedCount = preference.getNotStartedCount()
        val downloadingCount = preference.getDownloadingCount()
        val downloadedCount = preference.getDownloadedCount()
        val stopCount = preference.getStopCount()
        val all = notStartedCount + downloadingCount + downloadedCount + stopCount
        getMVPView().setupBottomMenu(arrayOf(
                BottomMenuItem(context.getString(R.string.text_bottom_menu_all), all, R.mipmap.bg_menu_all),
                BottomMenuItem(context.getString(R.string.text_bottom_menu_not_started), notStartedCount, R.mipmap.bg_menu_not_started),
                BottomMenuItem(context.getString(R.string.text_bottom_menu_downloading), downloadingCount, R.mipmap.bg_menu_downloading),
                BottomMenuItem(context.getString(R.string.text_bottom_menu_stop), stopCount, R.mipmap.bg_menu_stop),
                BottomMenuItem(context.getString(R.string.text_bottom_menu_downloaded), downloadingCount, R.mipmap.bg_menu_downloaded)
        ))

    }

    override fun addNewDownload() {
        getMVPView().showAddNewDownloadDialog()
    }

}