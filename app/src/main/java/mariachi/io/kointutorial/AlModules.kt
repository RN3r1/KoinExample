package mariachi.io.kointutorial

/**
 * Created by roeeyn in 29/03/18
 * rodrigo@mariachi.io
 * https://github.com/RN3r1
 */
class AlModules {

    companion object {

        fun mainModule() = org.koin.dsl.module.applicationContext {
            bean { MyPresenter(get()) as Presenter } // get() will resolve Repository instance
            bean { MyRepository() as Repository }
        }

    }

}