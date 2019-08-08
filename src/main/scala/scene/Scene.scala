package scene

import shapes.Shape
import timeline.Timeline

class Scene(val width: Double, val height: Double) {

  val timeline: Timeline = new Timeline
  val activeLayer: Layer = new Layer(this)
  val layers: List[Layer] = List(activeLayer)

  def add(shape: Shape): Unit = {
    activeLayer.add(shape)
  }

  def play: Unit = {
    val time: Double = 0
    timeline.play(time)
  }
}
