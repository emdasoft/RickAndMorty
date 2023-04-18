package com.emdasoft.rickandmorty.domain.usecases

import com.emdasoft.rickandmorty.domain.repository.Repository

class GetCharacterListUseCase(private val repository: Repository) {

    operator fun invoke() = repository.getCharacterList()

}