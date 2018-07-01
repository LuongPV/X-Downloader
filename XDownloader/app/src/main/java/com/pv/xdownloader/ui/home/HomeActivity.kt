package com.pv.xdownloader.ui.home

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import com.pv.xdownloader.R
import com.pv.xdownloader.data.model.DownloadInfo
import com.pv.xdownloader.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.layout_top_bar.*
import java.io.File
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeContract.HomeView {
    @Inject
    lateinit var homePresenter: HomeContract.HomePresenter<HomeContract.HomeView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        getActivityComponent().inject(this)
        homePresenter.injectView(this)
        homePresenter.loadBottomMenu()

        iv_drawer.setOnClickListener {
            openLeftMenu()
        }

        iv_add_download_task.setOnClickListener {
            homePresenter.addNewDownload()
        }
    }

    override fun showAddNewDownloadDialog() {
        val dialog = AddNewDownloadDialog(this, object: AddNewDownloadDialog.Callback {

            override fun onDownloadStarted(downloadInfo: DownloadInfo) {
                homePresenter.startDownload(downloadInfo)
            }

        })
        dialog.show()
    }

    override fun notifyDownloadDone(downloadInfo: DownloadInfo) {
        showMessage("Download done file name = ${File(downloadInfo.url).name}")
    }

    fun openLeftMenu() {
        drawerLayout.openDrawer(Gravity.START)
    }

    fun closeLeftMenu() {
        drawerLayout.closeDrawer(Gravity.START)
    }

    override fun setupBottomMenu(bottomMenus: Array<BottomMenuItem>) {
        rv_bottom_menu.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_bottom_menu.adapter = BottomMenuAdapter(bottomMenus, { bottomMenuItem -> tv_title.text = bottomMenuItem.name })
    }
}
