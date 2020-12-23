package pankaj.com.pressfeeder.di

import dagger.Component
import pankaj.com.pressfeeder.PressFeederApplication
import pankaj.com.pressfeeder.presentation.language.di.LanguageSelectorComponent
import pankaj.com.pressfeeder.presentation.language.di.LanguageSelectorModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = arrayOf(
                ApplicationModule::class
        )
)
interface ApplicationComponent {
    fun inject(application: PressFeederApplication)
    fun plus(languageSelectorModule: LanguageSelectorModule): LanguageSelectorComponent
}