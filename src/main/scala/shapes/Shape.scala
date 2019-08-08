package shapes

import org.scalajs.dom.CanvasRenderingContext2D
import scene.Scene
import timeline.{Animation, Timeline}

trait Shape {

  def draw(ctx: CanvasRenderingContext2D): Unit

  def update(scene: Scene, time: Double): Unit

  def animate(animation: Animation): Unit
}
