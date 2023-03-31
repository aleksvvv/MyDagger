package com.bignerdranch.android.mydagger.example1

@dagger.Component
interface NewComponent {

   fun getKeyboard():Keyboard

    fun inject(activity: Activity)

}