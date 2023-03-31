package com.bignerdranch.android.mydagger.example1

class Component {

    fun getComp(): Computer {
        val monitor = Monitor()
        val mouse = Mouse()
        val keyboard = Keyboard()
        val computerTower = ComputerTower(Storage(), Memory(), Processor())

        return Computer(monitor, mouse, keyboard, computerTower)
    }

    fun injectComp(activity: Activity){

//        activity.keyboard = Keyboard()
    }
}