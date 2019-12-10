package com.example.spviewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel:ViewModel(){
    private val _count = MutableLiveData<Int>(0)
    val count: LiveData<Int>
    get() = _count//getter of _count

    fun increment(){
        _count.value=_count.value?.plus(1)

    }
    fun decreament(){
        _count.value=_count.value?.minus(1)
    }

    init{
        Log.d("MainActivity","View Model initialised")
        _count.value=0

    }

    override fun onCleared() {
        Log.d("MainActivity","View Model initialised")
        super.onCleared()
    }
}