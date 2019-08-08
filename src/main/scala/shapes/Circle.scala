package shapes
import monix.execution.Ack
import org.scalajs.dom.CanvasRenderingContext2D
import scene.Scene
import timeline.Animation

import scala.concurrent.Future

case class Circle (var x: Double, var y: Double, var radius: Double = 1) extends Shape{
  override def draw(ctx: CanvasRenderingContext2D): Unit = ???

  override def update(scene: Scene, time: Double): Unit = ???

  override def animate(animation: Animation): Unit = ???

  override def onNext(elem: Long): Future[Ack] = ???

  override def onError(ex: Throwable): Unit = ???

  override def onComplete(): Unit = ???
}
