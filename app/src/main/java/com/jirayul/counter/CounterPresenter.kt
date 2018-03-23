package com.jirayul.counter

/**
 * Created by Gear on 23/3/2018 AD.
 */
class CounterPresenter(val view: CounterView) {
    var counter : Int = 0

    fun onPlusButtonClicked() {
        counter++
        updateCounterInView()
    }

    fun onMinusButtonClicked() {
        counter--
        updateCounterInView()
    }
    fun onResetButtonClicked() {
        reset()
    }

    private fun updateCounterInView() {
        view.setCounter(counter)
    }

    fun start() {
        reset()
    }

    private fun reset() {
        counter = 0
        updateCounterInView()
    }
}