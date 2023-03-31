package com.bignerdranch.android.mydagger.example1

import javax.inject.Inject


class Activity {

    private lateinit var mouse: Mouse
    private lateinit var storage: Storage
    val computer: Computer = DaggerNewComponent.create().getComputer()
//    val storage = DaggerNewComponent.create().getStorage()


    init {
        DaggerNewComponent.create().inject(this)
    }


}