package com.pv.xdownloader.data.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    fun downloadFile(@Url fileUrl: String): Observable<ResponseBody>

}