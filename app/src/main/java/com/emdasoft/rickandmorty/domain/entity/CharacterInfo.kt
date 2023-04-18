package com.emdasoft.rickandmorty.domain.entity

data class CharacterInfo(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val image: String,
    val location: Location,
    val origin: Origin,
    val created: String
)