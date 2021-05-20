package com.androiddevs.mvvmnewsapp

data class NewsActivity(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)