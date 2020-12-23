package pankaj.com.pressfeeder.presentation.language.di

import dagger.Module
import dagger.Provides
import pankaj.com.pressfeeder.data.languageselector.LanguageSelectorService
import pankaj.com.pressfeeder.di.ActivityScope
import pankaj.com.pressfeeder.domain.languageselector.interactor.LanguageSelectorUseCase
import pankaj.com.pressfeeder.domain.languageselector.repository.LanguageSelectorRepository
import pankaj.com.pressfeeder.presentation.language.view.LanguageActivity
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class LanguageSelectorModule(private var activity: LanguageActivity) {

    @Provides
    @Singleton
    fun provideLanguageSelectorService(@Named retrofit: Retrofit): LanguageSelectorService {
        return retrofit.create(LanguageSelectorService::class.java)
    }

    @Provides
    @ActivityScope
    fun provideLanguageSelectorUseCase(lsRepo: LanguageSelectorRepository): LanguageSelectorUseCase {
        return LanguageSelectorUseCase(lsRepo)
    }


}