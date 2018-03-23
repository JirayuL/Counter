package com.jirayul.counter

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

/**
 * Created by Gear on 23/3/2018 AD.
 */
class CounterPresenterTest {

    lateinit var view: CounterView
    lateinit var presenter: CounterPresenter

    @Before
    fun init(){
        view = mock(CounterView::class.java)
        presenter = CounterPresenter(view)
    }

    @Test
    fun testResetCounter(){
        presenter.start()
        verify(view).setCounter(0)
    }

    @Test
    fun testAddCounter(){
        presenter.start()
        presenter.onPlusButtonClicked()

        val inOrder = inOrder(view)
        inOrder.verify(view).setCounter(0)
        inOrder.verify(view).setCounter(1)
    }
}