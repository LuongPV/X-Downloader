package com.pv.xdownloader.data.network

import retrofit2.Retrofit
import javax.inject.Inject

class DefaultApiClient @Inject constructor(val retrofit: Retrofit) : ApiClient {


}