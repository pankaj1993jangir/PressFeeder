package pankaj.com.pressfeeder.data.languageselector.entity

import com.google.gson.annotations.SerializedName
import pankaj.com.pressfeeder.domain.languageselector.entity.Language

data class LanguageJson(@SerializedName("image")
                        val logoUrl: String,
                        val name: String) {

    fun mapDomain(): Language {
        return Language(logoUrl, name)
    }
}