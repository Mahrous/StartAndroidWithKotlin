package com.mahrous.testkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.mahrous.testkotlin.R
import com.mahrous.testkotlin.adapters.ArmorAdapter
import com.mahrous.testkotlin.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainActivityViewModel>()

    private lateinit var adapter: ArmorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = ArmorAdapter()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.getArmorList()
        viewModel.armorList.observe(this) {
            adapter.submitList(it)
        }
        binding.adapter = adapter


        binding.filter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {

                filterList(binding.filter.text.toString())
            }

        })


    }

    fun filterList(name: String) {
        viewModel.getFilteredArmor(name)
        viewModel.filteredList.observe(this) {
            if (it.isNotEmpty()) {
                adapter = ArmorAdapter()
                adapter.submitList(it)
            }
        }
        binding.adapter=adapter
    }

}