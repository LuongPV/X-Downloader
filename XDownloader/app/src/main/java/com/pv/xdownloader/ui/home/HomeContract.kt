package com.pv.xdownloader.ui.home

import com.pv.xdownloader.ui.base.MVPPresenter
import com.pv.xdownloader.ui.base.MVPView

interface HomeContract {
    interface HomeView : MVPView {

        fun setupBottomMenu(bottomMenus: Array<BottomMenuItem>)

        fun showAddNewDownloadDialog()

    }

    interface HomePresenter<V : HomeView> : MVPPresenter<V> {

        fun loadBottomMenu()

        fun addNewDownload()

    }


}