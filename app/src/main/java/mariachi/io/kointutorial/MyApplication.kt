package mariachi.io.kointutorial

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module

/**
 * Created by roeeyn in 29/03/18
 * rodrigo@mariachi.io
 * https://github.com/RN3r1
 */
class MyApplication: Application() {

    val myModule : Module = AlModules.mainModule()

    override fun onCreate() {
        super.onCreate()
        // Start Koin

        startKoin(this, listOf(myModule))
    }

}