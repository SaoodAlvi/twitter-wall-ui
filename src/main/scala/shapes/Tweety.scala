package shapes

import monix.execution.Ack
import monix.execution.Ack.Continue
import org.scalajs.dom
import org.scalajs.dom.CanvasRenderingContext2D
import scene.Scene
import timeline.Animation

import scala.concurrent.Future

case class Tweety(var x: Double, var y: Double, var vX: Double = Math.random() * 3, var vY: Double = Math.random() * 3) extends Shape {

  private var animation: Option[Animation] = None

  override def draw(ctx: CanvasRenderingContext2D): Unit = {
    ctx.beginPath()
    ctx.fillStyle = "#ff00f8"
    ctx.fillRect(x, y, 50, 50)
    ctx.closePath()
  }

  override def update(scene: Scene, time: Double): Unit = {
    if (x < 0 || x > scene.width) {
      vX *= -1
    }
    if (y < 0 || y > scene.height) {
      vY *= -1
    }
    x += vX
    y += vY
  }

  override def onNext(elem: Long): Future[Ack] = {
    dom.console.log(elem)
    Continue
  }

  override def onError(ex: Throwable): Unit = {
    println("upsa")
  }

  override def onComplete(): Unit = {
    println("done")
  }

  override def animate(animation: Animation): Unit = {
    this.animation = Some(animation)
  }
}
