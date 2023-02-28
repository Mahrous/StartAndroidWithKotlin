package com.mahrous.testkotlin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahrous.testkotlin.data.FinalArmor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val repo: MainActivityRepo) : ViewModel() {

    val armorList: MutableLiveData<ArrayList<FinalArmor>> = MutableLiveData()
    val filteredList: MutableLiveData<ArrayList<FinalArmor>> = MutableLiveData()

    fun getArmorList() = viewModelScope.launch { armorList.value = repo.getArmors() }
    fun getFilteredArmor(name: String) = viewModelScope.launch { filteredList.value = repo.getFilteredArmors(name) }


}