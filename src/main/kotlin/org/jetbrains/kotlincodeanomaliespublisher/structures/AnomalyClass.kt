package org.jetbrains.kotlincodeanomaliespublisher.structures

data class AnomalyClass(
    val title: String = "",
    val examples: MutableMap<String, AnomalyExample> = mutableMapOf()
)