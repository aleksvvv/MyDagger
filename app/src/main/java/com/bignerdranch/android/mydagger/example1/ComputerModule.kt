package com.bignerdranch.android.mydagger.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provStorage(): Storage {
        return Storage()
    }
    @Provides
    fun provProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provCompTower(
        storage: Storage,
        memory: Memory,
        processor: Processor

    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }
@Provides
    fun provComputer(
        monitor: Monitor,
        mouse: Mouse,
        keyboard: Keyboard,
        computerTower: ComputerTower
    ): Computer {
        return Computer(monitor, mouse, keyboard, computerTower)
    }

}