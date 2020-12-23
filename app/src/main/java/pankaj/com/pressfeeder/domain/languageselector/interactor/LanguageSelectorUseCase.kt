package pankaj.com.pressfeeder.domain.languageselector.interactor

import androidx.lifecycle.MutableLiveData
import pankaj.com.pressfeeder.domain.languageselector.entity.Language
import pankaj.com.pressfeeder.domain.languageselector.repository.LanguageSelectorRepository

class LanguageSelectorUseCase(private val lsRepo: LanguageSelectorRepository) {
    suspend fun getLanguages(): List<Language> {
        return lsRepo.getLanguages()
    }
}