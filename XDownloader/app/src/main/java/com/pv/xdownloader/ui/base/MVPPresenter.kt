package com.pv.xdownloader.ui.base

interface MVPPresenter<in V : MVPView> {

    fun injectView(mvpView: V)

}