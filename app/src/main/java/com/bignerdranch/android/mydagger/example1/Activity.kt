package com.bignerdranch.android.mydagger.example1

import javax.inject.Inject


class Activity {

    //    val comp = Component().getComp()
    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor


    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
    init {
        DaggerNewComponent.create().inject(this)
    }


}