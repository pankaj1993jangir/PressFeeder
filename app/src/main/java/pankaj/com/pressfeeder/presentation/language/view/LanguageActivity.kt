package pankaj.com.pressfeeder.presentation.language.view

import android.os.Bundle
import pankaj.com.pressfeeder.PressFeederActivity
import pankaj.com.pressfeeder.PressFeederApplication
import pankaj.com.pressfeeder.R
import pankaj.com.pressfeeder.presentation.PressFeederPresenter
import pankaj.com.pressfeeder.presentation.language.di.LanguageSelectorModule
import pankaj.com.pressfeeder.presentation.language.presenter.LanguageSelectorPresenter

class LanguageActivity : PressFeederActivity() {

    lateinit var view: LanguageSelectorView
    lateinit var presenter: LanguageSelectorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
    }

    override fun createContentView(): LanguageSelectorView {
        return view
    }

    override fun getPresenter(): PressFeederPresenter {
        return presenter
    }

    override fun setupActivityComponent() {
        (application as PressFeederApplication)
                .getAppComponent()
                .plus(LanguageSelectorModule(this))
                .inject(this)
    }
}
