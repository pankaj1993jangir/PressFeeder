package pankaj.com.pressfeeder.presentation.language.view

import android.view.LayoutInflater
import android.view.View
import pankaj.com.pressfeeder.databinding.LayoutLanguageSelectorBinding
import pankaj.com.pressfeeder.presentation.PressFeederView

interface LanguageSelectorView : PressFeederView {
}


class LanguageSelectorViewImpl(private val activity: LanguageActivity) : LanguageSelectorView {

    private var binding = LayoutLanguageSelectorBinding.inflate(LayoutInflater.from(activity))

    override fun asView(): View {
        return binding.root
    }

    override fun onDestroy() {
        binding.unbind()
    }

}