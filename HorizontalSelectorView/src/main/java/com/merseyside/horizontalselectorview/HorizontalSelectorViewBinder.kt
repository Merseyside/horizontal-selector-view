package com.merseyside.horizontalselectorview

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener

@BindingAdapter(value = ["bind:entryValueAttrChanged"]) // AttrChanged required postfix
fun setListener(
    view: HorizontalSelectorView,
    listener: InverseBindingListener?
) {
    if (listener != null) {
        view.setBindingListener { listener.onChange() }
    }
}

@BindingAdapter("bind:entryValue")
fun setHorizontalSelectorEntryValue(
    view: HorizontalSelectorView,
    value: String?
) {
    if (!view.isTheSame(value!!)) {
        view.currentEntryValue = value
    }
}

@InverseBindingAdapter(attribute = "bind:entryValue")
fun getHorizontalSelectorEntryValue(view: HorizontalSelectorView): String {
    return view.currentEntryValue
}

@BindingAdapter("bind:horizontalSelectorTitle")
fun setHorizontalSelectorTitle(
    view: HorizontalSelectorView,
    title: String?
) {
    view.setTitle(title)
}
