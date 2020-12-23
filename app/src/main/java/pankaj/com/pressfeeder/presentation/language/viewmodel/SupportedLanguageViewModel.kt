package pankaj.com.pressfeeder.presentation.language.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import pankaj.com.pressfeeder.Resource
import pankaj.com.pressfeeder.domain.languageselector.interactor.LanguageSelectorUseCase
import java.lang.Exception

class SupportedLanguageViewModel(private val useCase: LanguageSelectorUseCase) : ViewModel() {
    fun getLanguages() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = useCase.getLanguages()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}