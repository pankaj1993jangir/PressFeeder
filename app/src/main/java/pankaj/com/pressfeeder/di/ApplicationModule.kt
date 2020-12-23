package pankaj.com.pressfeeder.di

import android.app.Application
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton


private const val TAG = "TAG"
private const val READ_TIMEOUT = 90
private const val WRITE_TIMEOUT = 60

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application? {
        return application
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
                .writeTimeout(WRITE_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT.toLong(), TimeUnit.SECONDS)
        return builder.build()
    }

    @Provides
    @Singleton
    @Named(TAG)
    fun provideRetrofit(
            builder: Retrofit.Builder,
            @Named(TAG) client: OkHttpClient,
            apiUrl: HttpUrl,
            converterFactory: Converter.Factory,
            callAdapterFactory: CallAdapter.Factory
    ): Retrofit {
        return builder.baseUrl(apiUrl)
                .client(client)
                .addCallAdapterFactory(callAdapterFactory)
                .addConverterFactory(converterFactory)
                .build()
    }
}