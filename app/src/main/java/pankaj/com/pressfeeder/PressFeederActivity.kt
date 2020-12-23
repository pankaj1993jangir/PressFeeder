package pankaj.com.pressfeeder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pankaj.com.pressfeeder.presentation.PressFeederPresenter
import pankaj.com.pressfeeder.presentation.PressFeederView


abstract class PressFeederActivity : AppCompatActivity() {

    protected abstract fun createContentView(): PressFeederView

    protected abstract fun getPresenter(): PressFeederPresenter

    protected abstract fun setupActivityComponent()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupActivityComponent();
        setContentView(createContentView().asView());
        /*if (BuildConfig.DEMO_MODE) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }*/
        getPresenter().onCreate();
    }

}