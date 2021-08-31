package com.example.movie_app.data.vo


import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)