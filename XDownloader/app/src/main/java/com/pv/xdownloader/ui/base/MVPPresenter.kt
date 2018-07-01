package com.pv.xdownloader.ui.base

interface MVPPresenter<V : MVPView> {

    fun injectView(mvpView: V)

}