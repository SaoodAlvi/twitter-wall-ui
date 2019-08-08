package wall

import java.time.Duration
import java.util.concurrent.TimeUnit

import monix.execution.Scheduler.Implicits.global
import monix.reactive.Observable
import org.scalajs.dom
import org.scalajs.dom.html.Canvas
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.{CanvasRenderingContext2D, html}
import scene.Scene
import shapes.Tweety
import timeline.Animation

import scala.concurrent.duration.FiniteDuration
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("com.modood.twitter")
object Main {

  val scene = new Scene(dom.window.innerWidth, dom.window.innerHeight)
  var ctx: CanvasRenderingContext2D = null
  var canvas: Canvas = null

  @JSExport
  def main(canvas: html.Canvas): Unit = {

    this.ctx = canvas.getContext("2d")
      .asInstanceOf[CanvasRenderingContext2D]
    this.canvas = canvas
    this.canvas.width = dom.window.innerWidth.toInt
    this.canvas.height = dom.window.innerHeight.toInt

    for (_ <- 1 to 2) {
      val tweety = new Tweety(50, 50)
      scene.add(tweety)
      val animation = Animation(Duration.ofSeconds(5))
      tweety.setAnimation(animation)
      scene.timeline.add(animation)
    }

    canvas.onkeypress = {
      (_: KeyboardEvent) =>
        scene.play
    }
  }
}
