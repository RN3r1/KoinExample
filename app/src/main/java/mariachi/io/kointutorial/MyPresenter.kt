package mariachi.io.kointutorial

/**
 * Created by roeeyn in 29/03/18
 * rodrigo@mariachi.io
 * https://github.com/RN3r1
 */
class MyPresenter(val repository: Repository):Presenter {

    override fun sayHello() = repository.giveHello()

}