package com.example.testquiz.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Melhores Rank"
        value = "Melhores Rank"
    }
    val text: LiveData<String> = _text
}