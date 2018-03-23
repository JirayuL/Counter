package com.jirayul.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var presenter: CounterPresenter

    override fun setCounter(value: Int) {
        count.text = "${value}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = CounterPresenter(this)
        presenter.start()
    }

    fun onPlusButtonClicked(view: View){
        presenter.onPlusButtonClicked()
    }

    fun onMinusButtonClicked(view: View){
        presenter.onMinusButtonClicked()
    }

    fun onResetButtonClicked(view: View){
        presenter.onResetButtonClicked()
    }
}
