package pankaj.com.pressfeeder

import android.app.Application
import pankaj.com.pressfeeder.di.ApplicationComponent
import pankaj.com.pressfeeder.di.ApplicationModule
import pankaj.com.pressfeeder.di.DaggerApplicationComponent


class PressFeederApplication : Application() {

    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerApplicationComponent.builder()
                .build()
        appComponent.inject(this)
    }

    fun getAppComponent(): ApplicationComponent {
        return appComponent
    }
}