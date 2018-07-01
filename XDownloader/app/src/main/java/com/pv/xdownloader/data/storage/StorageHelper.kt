package com.pv.xdownloader.data.storage

import com.pv.xdownloader.data.model.DownloadInfo

interface StorageHelper {

    fun saveFile(downloadInfo: DownloadInfo, byteArray: ByteArray)

}