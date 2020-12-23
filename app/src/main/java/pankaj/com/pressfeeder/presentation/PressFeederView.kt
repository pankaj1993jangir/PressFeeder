package pankaj.com.pressfeeder.presentation

import android.view.View

interface PressFeederView {
    fun asView(): View
    fun onDestroy();
}