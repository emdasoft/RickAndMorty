package com.emdasoft.rickandmorty.domain.usecases

import com.emdasoft.rickandmorty.domain.repository.Repository

class GetDetailInformationUseCase(private val repository: Repository) {

    suspend operator fun invoke(itemId: Int) = repository.getDetailInformation(itemId)

}