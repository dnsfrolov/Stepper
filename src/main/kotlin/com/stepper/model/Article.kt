package com.stepper.model

data class Article(
    val id: Long,
    val title: String,
    val description: String?,
    val imageUrl: Media.Image,
    val owner: User,
    val stepList: List<Step>,
    val supply: List<Supply>,
    val tags: List<Tag>,
)

data class Step(
    val id: Long,
    val assetUrlList: List<Media>,
    val title: String,
    val description: String,
    val orderNumber: Int,
    val stepSupplyList: List<Supply>
)

data class Supply(
    val id: Long,
    val name: String,
    val amount: Amount,
    val image: Media.Image,
)

data class Amount(
    val unit: Unit,
    val quantity: Double
)

sealed class Media(url: String) {
    data class Audio(val url: String) : Media(url)
    data class Image(val url: String) : Media(url)
    data class Video(val url: String) : Media(url)
}

enum class Unit {
    GRAM
}

data class Tag(
    val id: Long,
    val name: String
)

abstract class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val avatar: String?,
    val description: String?
)

/*
* add related articles
*
*/