package wall
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom.html
import paper.Paper

@JSExportTopLevel("com.modood.twitter")
object Main {
  @JSExport
  def main(canvas: html.Canvas): Unit = {
    Paper.setup(canvas)

    val path = new paper.Path()
    path.strokeColor = "black"

    val start = new paper.Point(100, 100)
    path.moveTo(start)
    path.lineTo(start.add(new paper.Point(200, -50)))
    Paper.view.draw()
  }
}
