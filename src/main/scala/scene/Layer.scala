package scene

import shapes.Shape

class Layer (val scene: Scene) {
  var children: List[Shape] = List.empty

  def add(shape: Shape): Unit = {
    children = children ++ List(shape)
  }
}
