package com.pv.xdownloader.data.network

import com.pv.xdownloader.data.model.DownloadInfo
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Retrofit
import javax.inject.Inject

class DefaultApiClient @Inject constructor(val retrofit: Retrofit) : ApiClient {

    override fun downloadFile(downloadInfo: DownloadInfo): Observable<ResponseBody> {
        return retrofit.create(ApiService::class.java).downloadFile(downloadInfo.url)
    }


}