package com.example.testquiz.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Curiosidades Aleatórias em um (Quiz)!"
    }
    val text: LiveData<String> = _text
}