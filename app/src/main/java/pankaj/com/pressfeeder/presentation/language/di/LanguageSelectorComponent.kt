package pankaj.com.pressfeeder.presentation.language.di

import dagger.Subcomponent
import pankaj.com.pressfeeder.di.ActivityScope
import pankaj.com.pressfeeder.presentation.language.view.LanguageActivity

@ActivityScope
@Subcomponent(modules = arrayOf(LanguageSelectorModule::class))
interface LanguageSelectorComponent {
    fun inject(activity: LanguageActivity)
}