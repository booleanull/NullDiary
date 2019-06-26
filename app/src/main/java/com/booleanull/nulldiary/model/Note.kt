package com.booleanull.nulldiary.model

data class Note(
    val category: String,
    val date: String,
    val description: String,
    val photo: String? = null
)