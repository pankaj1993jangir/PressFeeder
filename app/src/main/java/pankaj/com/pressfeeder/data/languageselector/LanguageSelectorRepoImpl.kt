package pankaj.com.pressfeeder.data.languageselector

import pankaj.com.pressfeeder.domain.languageselector.entity.Language
import pankaj.com.pressfeeder.domain.languageselector.repository.LanguageSelectorRepository
import java.util.stream.Collectors
import java.util.stream.Stream

class LanguageSelectorRepoImpl(private val service: LanguageSelectorService) : LanguageSelectorRepository {
    override suspend fun getLanguages(): List<Language> {
        return service.getLanguages().stream().map { entry -> entry.mapDomain() }.collect(Collectors.toList())
    }
}