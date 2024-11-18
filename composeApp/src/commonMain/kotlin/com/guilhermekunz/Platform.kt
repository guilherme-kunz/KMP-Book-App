package com.guilhermekunz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform