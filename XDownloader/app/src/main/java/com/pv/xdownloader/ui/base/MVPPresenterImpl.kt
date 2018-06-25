package com.pv.xdownloader.ui.base

abstract class MVPPresenterImpl<V : MVPView> : MVPPresenter<V> {
    private lateinit var mvpView: V

    override fun injectView(mvpView: V) {
        this.mvpView = mvpView
    }

    fun getMVPView(): V {
        return this.mvpView
    }

}