package com.guilhermekunz.book.domain

data class Book(
    val id: String,
    val title: String,
    val imageUrl: String,
    val authors: List<String>,
    val description: String?,
    val languages: List<String>,
    val firstPublishYear: String?,
    val averageRatting: Double?,
    val rattingCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)