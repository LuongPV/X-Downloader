package com.pv.xdownloader.data.storage

import com.pv.xdownloader.data.model.DownloadInfo
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream


class DefaultStorageHelper : StorageHelper {

    override fun saveFile(downloadInfo: DownloadInfo, byteArray: ByteArray) {
        var os: OutputStream? = null
        try {
            os = FileOutputStream(File(downloadInfo.savedLocation))
            os.write(byteArray, 0, byteArray.size)
        } finally {
            os!!.close()
        }
    }


}