package com.scribblex.dictionary

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}