package com.example.tsitatyyarika.ui.theme

import kotlin.random.Random

fun randomFun(): TY {
    return TY.getById(Random.nextInt(0, 62))
}