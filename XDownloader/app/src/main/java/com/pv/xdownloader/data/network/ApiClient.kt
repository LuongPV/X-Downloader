package com.pv.xdownloader.data.network

import com.pv.xdownloader.data.model.DownloadInfo
import io.reactivex.Observable
import okhttp3.ResponseBody

interface ApiClient {

    fun downloadFile(downloadInfo: DownloadInfo): Observable<ResponseBody>

}