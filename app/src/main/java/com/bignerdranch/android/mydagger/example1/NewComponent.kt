package com.bignerdranch.android.mydagger.example1

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {

   fun getComputer():Computer
   fun getStorage():Storage

    fun inject(activity: Activity)

}