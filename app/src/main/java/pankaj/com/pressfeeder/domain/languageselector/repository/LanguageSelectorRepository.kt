package pankaj.com.pressfeeder.domain.languageselector.repository

import pankaj.com.pressfeeder.domain.languageselector.entity.Language

interface LanguageSelectorRepository {
    suspend fun getLanguages(): List<Language>
}