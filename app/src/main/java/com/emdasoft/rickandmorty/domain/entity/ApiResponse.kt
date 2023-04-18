package com.emdasoft.rickandmorty.domain.entity

data class ApiResponse(
    val info: Info,
    val results: List<CharacterInfo>
)