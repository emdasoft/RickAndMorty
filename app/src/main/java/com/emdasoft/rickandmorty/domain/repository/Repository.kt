package com.emdasoft.rickandmorty.domain.repository

import androidx.lifecycle.LiveData
import com.emdasoft.rickandmorty.domain.entity.CharacterInfo

interface Repository {

    fun getCharacterList(): LiveData<List<CharacterInfo>>

    suspend fun getDetailInformation(itemId: Int): CharacterInfo

}