package pankaj.com.pressfeeder.data.languageselector

import pankaj.com.pressfeeder.data.languageselector.entity.LanguageJson
import retrofit2.http.GET

interface LanguageSelectorService {
    @GET("language")
    suspend fun getLanguages(): List<LanguageJson>
}