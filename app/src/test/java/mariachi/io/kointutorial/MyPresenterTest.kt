package mariachi.io.kointutorial

import junit.framework.Assert.assertEquals
import org.junit.*
import org.koin.standalone.StandAloneContext.closeKoin
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject
import org.koin.test.KoinTest

/**
 * Created by roeeyn in 29/03/18
 * rodrigo@mariachi.io
 * https://github.com/RN3r1
 */
class MyPresenterTest: KoinTest {

    val presenter : Presenter by inject()
    val repository : Repository by inject()

    @Before
    fun before(){
        startKoin(listOf(AlModules.mainModule()))
    }

    @After
    fun after(){
        closeKoin()
    }

    @Test
    fun testSayHello() {
        val string = "Ahuevo con Koin"
        assertEquals(string, presenter.sayHello())
    }

}