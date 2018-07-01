package com.pv.xdownloader.data.model

data class DownloadInfo(
        var url: String,

        var savedLocation: String,

        var category: String,

        var autoOpen: Boolean,

        var status: DownloadStatus
)