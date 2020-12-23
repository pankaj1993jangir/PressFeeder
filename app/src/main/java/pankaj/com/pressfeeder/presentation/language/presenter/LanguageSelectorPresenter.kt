package pankaj.com.pressfeeder.presentation.language.presenter

import pankaj.com.pressfeeder.domain.languageselector.interactor.LanguageSelectorUseCase
import pankaj.com.pressfeeder.presentation.PressFeederPresenter
import pankaj.com.pressfeeder.presentation.language.view.LanguageSelectorView

class LanguageSelectorPresenter(private val view: LanguageSelectorView,
                                private val useCase: LanguageSelectorUseCase) : PressFeederPresenter {
    override fun onCreate() {
    }

    override fun onDestroy() {
    }

}