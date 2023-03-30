package com.bignerdranch.android.mydagger.example1

class Activity {

//    val comp = Component().getComp()
    lateinit var comp: Computer
    init {
        Component().injectComp(this)
    }



    }