package com.pv.xdownloader.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pv.xdownloader.R
import kotlinx.android.synthetic.main.view_bottom_menu_item.view.*

class BottomMenuAdapter(private val bottomMenuItems: Array<BottomMenuItem>, private val onItemSelect: (BottomMenuItem) -> Unit) : RecyclerView.Adapter<BottomMenuAdapter.ViewHolder>() {
    private var checkedPosition: Int = 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menuItem = bottomMenuItems[position]
        holder.tvName.text = menuItem.name
        holder.tvNumber.text = menuItem.number.toString()
        holder.tvNumber.setBackgroundResource(menuItem.resBg)
        holder.vSelected.visibility = if (checkedPosition == position) View.VISIBLE else View.INVISIBLE
        holder.rootView.setOnClickListener {
            checkedPosition = holder.adapterPosition
            notifyDataSetChanged()
            onItemSelect.invoke(menuItem)
        }
    }

    override fun getItemCount(): Int {
        return bottomMenuItems.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.view_bottom_menu_item, parent, false)
        return ViewHolder(v);
    }

    class ViewHolder(val rootView: View) : RecyclerView.ViewHolder(rootView) {
        val tvName = rootView.tv_name
        val tvNumber = rootView.tv_number
        val vSelected = rootView.v_selected
    }


}