package com.pv.xdownloader.ui.home

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.pv.xdownloader.R
import kotlinx.android.synthetic.main.dialog_add_new_download.*

class AddNewDownloadDialog(context: Context) : Dialog(context) {

    init {
        setContentView(R.layout.dialog_add_new_download)
        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));

        iv_close_dialog.setOnClickListener {
            dismiss()
        }
    }

}