package com.example.radioapp

import java.lang.ref.WeakReference

class MyClass {

    // 1. Create a WeakReference variable
    private lateinit var mAnotherClassReference: WeakReference<Play>

    // 2. Set the weak reference (nothing special about the method name)
    fun setWeakReference(context: Play) {
        mAnotherClassReference = WeakReference(context)
    }

    // 3. Use the weak reference
    fun doSomething() {
        val anotherClass = mAnotherClassReference.get() ?: return
        anotherClass
// do something with anotherClass
    }

}