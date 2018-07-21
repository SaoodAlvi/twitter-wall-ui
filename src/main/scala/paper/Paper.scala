package paper

import org.scalajs.dom.raw.{CanvasRenderingContext2D, HTMLCanvasElement, HTMLImageElement, ImageData, SVGElement}
import paper.Importedjs.NativeMouseEvent

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|


@js.native
@JSGlobalScope
object Importedjs extends js.Object {
  type NativeMouseEvent = MouseEvent
}

@js.native
@JSGlobal("paper.settings")
object settings extends js.Object {
  var applyMatrix: Boolean = js.native
  var handleSize: Double = js.native
  var hitTolerance: Double = js.native
}

@js.native
@JSGlobal("paper.Matrix")
class Matrix extends js.Object {

  var a: Double = js.native
  var c: Double = js.native
  var b: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native

  def values: js.Array[Double] = js.native

  def translation: Point = js.native

  def scaling: Point = js.native

  def rotation: Double = js.native

  def set(): Matrix = js.native

  def set(a: Double, c: Double, b: Double, d: Double, tx: Double, ty: Double): Matrix = js.native

  def set(values: js.Array[Double]): Matrix = js.native

  def set(matrix: Matrix): Matrix = js.native

  override def clone(): Matrix = js.native

  def equals(matrix: Matrix): Boolean = js.native

  override def toString(): String = js.native

  def reset(): Unit = js.native

  @JSName("apply")
  def apply(recursively: Boolean): Boolean = js.native

  def translate(point: Point): Matrix = js.native

  def translate(dx: Double, dy: Double): Matrix = js.native

  def scale(scale: Double, center: Point): Matrix = js.native

  def scale(hor: Double, ver: Double, center: Point): Matrix = js.native

  def rotate(angle: Double, center: Point): Matrix = js.native

  def rotate(angle: Double, x: Double, y: Double): Matrix = js.native

  def shear(shear: Point, center: Point): Matrix = js.native

  def shear(hor: Double, ver: Double, center: Point): Matrix = js.native

  def skew(skew: Point, center: Point): Matrix = js.native

  def skew(hor: Double, ver: Double, center: Point): Matrix = js.native

  def concatenate(mx: Matrix): Matrix = js.native

  def preConcatenate(mx: Matrix): Matrix = js.native

  def chain(mx: Matrix): Matrix = js.native

  def append(mx: Matrix): Matrix = js.native

  def prepend(mx: Matrix): Matrix = js.native

  def appended(mx: Matrix): Matrix = js.native

  def prepended(mx: Matrix): Matrix = js.native

  def isIdentity(): Boolean = js.native

  def isInvertible(): Boolean = js.native

  def isSingular(): Boolean = js.native

  def transform(point: Point): Point = js.native

  def transform(src: js.Array[Double], dst: js.Array[Double], count: Double): js.Array[Double] = js.native

  def inverseTransform(point: Point): Point = js.native

  def decompose(): js.Dynamic = js.native

  def invert(): Matrix = js.native

  def inverted(): Matrix = js.native

  def applyToContext(ctx: CanvasRenderingContext2D): Unit = js.native
}

@js.native
@JSGlobal("paper.Point")
class Point extends js.Object {
  def this(x: Double, y: Double) = this()

  def this(values: js.Array[Double]) = this()

  def this(`object`: js.Any) = this()

  def this(size: Size) = this()

  def this(point: Point) = this()

  var x: Double = js.native
  var y: Double = js.native
  var length: Double = js.native
  var angle: Double = js.native
  var angleInRadians: Double = js.native

  def quadrant: Double = js.native

  var selected: Boolean = js.native

  def set(x: Double, y: Double): Point = js.native

  def set(values: js.Array[Double]): Point = js.native

  def set(`object`: js.Any): Point = js.native

  def set(size: Size): Point = js.native

  def set(point: Point): Point = js.native

  def equals(point: Point): Boolean = js.native

  override def clone(): Point = js.native

  override def toString(): String = js.native

  def getAngle(Point: Point): Double = js.native

  def getAngleInRadians(point: Point): Double = js.native

  def getDirectedAngle(point: Point): Double = js.native

  def getDistance(point: Point, squared: Boolean): Double = js.native

  def normalize(length: Double): Point = js.native

  def rotate(angle: Double, center: Point): Point = js.native

  def transform(matrix: Matrix): Point = js.native

  def isInside(rect: Rectangle): Boolean = js.native

  def isClose(point: Point, tolerance: Double): Boolean = js.native

  def isColinear(point: Point): Boolean = js.native

  def isOrthogonal(point: Point): Boolean = js.native

  def isZero(): Boolean = js.native

  def isNaN(): Boolean = js.native

  def isInQuadrant(quadrant: Double): Boolean = js.native

  def dot(point: Point): Double = js.native

  def cross(point: Point): Double = js.native

  def project(point: Point): Point = js.native

  def round(): Point = js.native

  def ceil(): Point = js.native

  def floor(): Point = js.native

  def abs(): Point = js.native

  def add(point: Point): Point = js.native

  def add(point: js.Array[Double]): Point = js.native

  def add(point: Double): Point = js.native

  def subtract(point: Point): Point = js.native

  def subtract(point: js.Array[Double]): Point = js.native

  def subtract(point: Double): Point = js.native

  def multiply(point: Point): Point = js.native

  def multiply(point: js.Array[Double]): Point = js.native

  def multiply(point: Double): Point = js.native

  def divide(point: Point): Point = js.native

  def divide(point: js.Array[Double]): Point = js.native

  def divide(point: Double): Point = js.native

  def modulo(point: Point): Point = js.native

  def modulo(point: js.Array[Double]): Point = js.native

  def modulo(point: Double): Point = js.native
}

@js.native
@JSGlobal("paper.Point")
object Point extends js.Object {
  def min(point1: Point, point2: Point): Point = js.native

  def max(point1: Point, point2: Point): Point = js.native

  def random(): Point = js.native
}

@js.native
@JSGlobal("paper.Rectangle")
class Rectangle extends js.Object {

  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var point: Point = js.native
  var size: Size = js.native
  var left: Double = js.native
  var top: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
  var center: Point = js.native
  var topLeft: Point = js.native
  var topRight: Point = js.native
  var bottomLeft: Point = js.native
  var bottomRight: Point = js.native
  var leftCenter: Point = js.native
  var topCenter: Point = js.native
  var rightCenter: Point = js.native
  var bottomCenter: Point = js.native

  def area: Double = js.native

  var selected: Boolean = js.native

  def set(point: Point, size: Size): Rectangle = js.native

  def set(`object`: js.Any): Rectangle = js.native

  def set(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native

  def set(from: Point, to: Point): Rectangle = js.native

  def set(rt: Rectangle): Rectangle = js.native

  override def clone(): Rectangle = js.native

  def equals(rect: Rectangle): Boolean = js.native

  override def toString(): String = js.native

  def isEmpty(): Boolean = js.native

  def contains(point: Point): Boolean = js.native

  def contains(rect: Rectangle): Boolean = js.native

  def intersects(rect: Rectangle, epsilon: Double): Boolean = js.native

  def intersect(rect: Rectangle): Rectangle = js.native

  def unite(rect: Rectangle): Rectangle = js.native

  def include(point: Point): Rectangle = js.native

  def expand(amount: Double | Size | Point): Rectangle = js.native

  def expand(hor: Double, ver: Double): Rectangle = js.native

  def scale(amount: Double): Rectangle = js.native

  def scale(hor: Double, ver: Double): Rectangle = js.native
}

@js.native
@JSGlobal("paper.Size")
class Size extends js.Object {

  var width: Double = js.native
  var height: Double = js.native

  def equals(size: Size): Boolean = js.native

  override def clone(): Size = js.native

  override def toString(): String = js.native

  def isZero(): Boolean = js.native

  def isNaN(): Boolean = js.native

  def round(): Size = js.native

  def ceil(): Size = js.native

  def floor(): Size = js.native

  def abs(): Size = js.native

  def add(size: Size): Size = js.native

  def add(size: js.Array[Double]): Size = js.native

  def add(size: Double): Size = js.native

  def subtract(size: Size): Size = js.native

  def subtract(size: js.Array[Double]): Size = js.native

  def subtract(size: Double): Size = js.native

  def multiply(size: Size): Size = js.native

  def multiply(size: js.Array[Double]): Size = js.native

  def multiply(size: Double): Size = js.native

  def divide(size: Size): Size = js.native

  def divide(size: js.Array[Double]): Size = js.native

  def divide(size: Double): Size = js.native

  def modulo(size: Size): Size = js.native

  def modulo(size: js.Array[Double]): Size = js.native

  def modulo(size: Double): Size = js.native
}

@js.native
@JSGlobal("paper.Size")
object Size extends js.Object {
  def min(size1: Size, size2: Size): Size = js.native

  def max(size1: Size, size2: Size): Size = js.native

  def random(): Size = js.native
}

@js.native
trait IFrameEvent extends js.Object {
  var count: Double = js.native
  var time: Double = js.native
  var delta: Double = js.native
}

@js.native
@JSGlobal("paper.PaperScope")
class PaperScope extends js.Object {
  var version: String = js.native
  var settings: PaperScope.Settings = js.native
  var project: Project = js.native
  var projects: js.Array[Project] = js.native

  def view: View = js.native

  var tool: Tool = js.native
  var tools: js.Array[Tool] = js.native

  def execute(code: String, option: js.Any): Unit = js.native

  def install(scope: js.Any): Unit = js.native

  def setup(canvas: HTMLCanvasElement | String): Unit = js.native

  def activate(): Unit = js.native
}

object PaperScope {

  @js.native
  trait Settings extends js.Object {
    var applyMatrix: Boolean = js.native
    var handleSize: Double = js.native
    var hitTolerance: Double = js.native
  }
}

@js.native
trait IHitTestOptions extends js.Object {
  var tolerance: Double = js.native
  var `class`: String = js.native
  var `match`: js.Function1[HitResult, Boolean] = js.native
  var fill: Boolean = js.native
  var stroke: Boolean = js.native
  var segments: Boolean = js.native
  var curves: Boolean = js.native
  var handles: Boolean = js.native
  var ends: Boolean = js.native
  var position: Boolean = js.native
  var center: Boolean = js.native
  var bounds: Boolean = js.native
  var guides: Boolean = js.native
  var selected: Boolean = js.native
}

@js.native
@JSGlobal("paper.Item")
class Item extends js.Object {
  var tangent: Point = js.native
  var normal: Point = js.native
  var curvature: Double = js.native

  def id: Double = js.native

  var className: String = js.native
  var name: String = js.native
  var style: Style = js.native
  var visible: Boolean = js.native
  var blendMode: String = js.native
  var opacity: Double = js.native
  var selected: Boolean = js.native
  var fullySelected: Boolean = js.native
  var clipMask: Boolean = js.native
  var data: js.Any = js.native
  var position: Point = js.native
  var pivot: Point = js.native
  var bounds: Rectangle = js.native
  var strokeBounds: Rectangle = js.native
  var handleBounds: Rectangle = js.native
  var rotation: Double = js.native
  var scaling: Point = js.native
  var matrix: Matrix = js.native

  def globalMatrix: Matrix = js.native

  def viewMatrix: Matrix = js.native

  var applyMatrix: Boolean = js.native

  def project: Project = js.native

  def view: View = js.native

  def layer: Layer = js.native

  var parent: Item = js.native
  var children: js.Array[Item] = js.native

  def firstChild: Item = js.native

  def lastChild: Item = js.native

  def nextSibling: Item = js.native

  def previousSibling: Item = js.native

  def index: Double = js.native

  var strokeColor: Color | String = js.native
  var strokeWidth: Double = js.native
  var strokeCap: String = js.native
  var strokeJoin: String = js.native
  var dashOffset: Double = js.native
  var strokeScaling: Boolean = js.native
  var dashArray: js.Array[Double] = js.native
  var miterLimit: Double = js.native
  var windingRule: String = js.native
  var fillColor: Color | String = js.native
  var fillRule: String = js.native
  var shadowColor: Color | String = js.native
  var shadowBlur: Double = js.native
  var shadowOffset: Double = js.native
  var selectedColor: Color | String = js.native
  var onFrame: js.Function1[IFrameEvent, Unit] = js.native
  var onMouseDown: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseDrag: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseUp: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onClick: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onDoubleClick: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseMove: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseEnter: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseLeave: js.Function1[MouseEvent, Unit] | Boolean = js.native

  def set(props: js.Any): Item = js.native

  def clone(options: js.Any): Item = js.native

  def copyContent(source: Item): Unit = js.native

  def copyAttributes(source: Item, excludeMatrix: Boolean): Unit = js.native

  def rasterize(resolution: Double, insert: Boolean): Raster = js.native

  def contains(point: Point): Boolean = js.native

  def isInside(rect: Rectangle): Boolean = js.native

  def intersects(item: Item): Boolean = js.native

  def hitTest(point: Point, options: IHitTestOptions): HitResult = js.native

  def hitTestAll(point: Point, options: IHitTestOptions): js.Array[HitResult] = js.native

  def matches(`match`: js.Any): Boolean = js.native

  def matches(name: String, compare: js.Any): Boolean = js.native

  def getItems(`match`: js.Any): js.Array[Item] = js.native

  def getItem(`match`: js.Any): Item = js.native

  def exportJSON(options: js.Any): String = js.native

  def importJSON(json: String): Unit = js.native

  def exportSVG(options: js.Any): SVGElement = js.native

  def importSVG(svg: SVGElement | String, options: js.Any): Item = js.native

  def importSVG(svg: SVGElement | String, onLoad: js.Function2[Item, String, Unit]): Item = js.native

  def addChild(item: Item): Item = js.native

  def insertChild(index: Double, item: Item): Item = js.native

  def addChildren(items: js.Array[Item]): js.Array[Item] = js.native

  def insertChildren(index: Double, items: js.Array[Item]): js.Array[Item] = js.native

  def insertAbove(item: Item): Item = js.native

  def insertBelow(item: Item): Item = js.native

  def appendTop(item: Item): Item = js.native

  def appendBelow(item: Item): Item = js.native

  def moveAbove(item: Item): Boolean = js.native

  def moveBelow(item: Item): Boolean = js.native

  def sendToBack(): Unit = js.native

  def bringToFront(): Unit = js.native

  def addTo(owner: Project | Layer | Group | CompoundPath): Item = js.native

  def copyTo(owner: Project | Layer | Group | CompoundPath): Item = js.native

  def reduce(options: js.Any): Item = js.native

  def remove(): Boolean = js.native

  def replaceWith(item: Item): Boolean = js.native

  def removeChildren(): js.Array[Item] = js.native

  def removeChildren(start: Double, end: Double): js.Array[Item] = js.native

  def reverseChildren(): Unit = js.native

  def isEmpty(): Boolean = js.native

  def hasFill(): Boolean = js.native

  def hasStroke(): Boolean = js.native

  def hasShadow(): Boolean = js.native

  def hasChildren(): Boolean = js.native

  def isInserted(): Boolean = js.native

  def isAbove(item: Item): Boolean = js.native

  def isBelow(item: Item): Boolean = js.native

  def isParent(item: Item): Boolean = js.native

  def isChild(item: Item): Boolean = js.native

  def isDescendant(item: Item): Boolean = js.native

  def isAncestor(item: Item): Boolean = js.native

  def isGroupedWith(item: Item): Boolean = js.native

  def translate(delta: Point): Point = js.native

  def rotate(angle: Double, center: Point): Unit = js.native

  def getRotation(): Double = js.native

  def scale(scale: Double, center: Point): Unit = js.native

  def scale(hor: Double, ver: Double, center: Point): Unit = js.native

  def shear(shear: Double, center: Point): Unit = js.native

  def shear(hor: Double, ver: Double, center: Point): Unit = js.native

  def skew(skew: Point, center: Point): Unit = js.native

  def skew(hor: Double, ver: Double, center: Point): Unit = js.native

  def transform(matrix: Matrix): Unit = js.native

  def globalToLocal(point: Point): Point = js.native

  def localToGlobal(point: Point): Point = js.native

  def parentToLocal(point: Point): Point = js.native

  def localToParent(point: Point): Point = js.native

  def fitBounds(rectangle: Rectangle, fill: Boolean): Unit = js.native

  def on(`object`: js.Any): Item = js.native

  def off(`type`: String, callback: js.Function1[IFrameEvent, Unit] | Boolean): Item = js.native

  def off(`object`: js.Any): Item = js.native

  def emit(`type`: String, event: js.Any): Boolean = js.native

  def responds(`type`: String): Boolean = js.native

  def on(`type`: String, callback: js.Function1[Event | MouseEvent, Unit] | Boolean): Item = js.native

  def removeOn(options: js.Any): Unit = js.native

  def removeOnMove(): Unit = js.native

  def removeOnDown(): Unit = js.native

  def removeOnDrag(): Unit = js.native

  def removeOnUp(): Unit = js.native
}

@js.native
@JSGlobal("paper.Group")
class Group extends Item {
  override def clone(options: js.Any): Group = js.native

  var clipped: Boolean = js.native
}

@js.native
@JSGlobal("paper.Layer")
class Layer extends Group {
  def this(children: js.Array[Item]) = this()

  def this(`object`: js.Any) = this()

  def activate(): Unit = js.native
}

@js.native
@JSGlobal("paper.Shape")
class Shape extends Item {
  var `type`: String = js.native
  var size: Size = js.native
  var radius: Double | Size = js.native

  override def clone(options: js.Any): Shape = js.native

  def toPath(insert: Boolean): Shape = js.native
}

@js.native
@JSGlobal("paper.Shape")
object Shape extends js.Object {
  def Circle(center: Point, radius: Double): Shape = js.native

  def Circle(`object`: js.Any): Shape = js.native

  def Rectangle(rectangle: Rectangle, radius: Double): Shape = js.native

  def Rectangle(point: Point, size: Size): Shape = js.native

  def Rectangle(from: Point, to: Point): Shape = js.native

  def Rectangle(`object`: js.Any): Shape = js.native

  def Ellipse(rectangle: Rectangle): Shape = js.native

  def Ellipse(`object`: js.Any): Shape = js.native
}

@js.native
@JSGlobal("paper.Raster")
class Raster extends Item {
  def this(source: HTMLImageElement | HTMLCanvasElement | String, position: Point) = this()

  def this(config: js.Any) = this()

  var size: Size = js.native
  var width: Double = js.native
  var height: Double = js.native

  def loaded: Boolean = js.native

  def resolution: Size = js.native

  var image: HTMLImageElement | HTMLCanvasElement = js.native
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var source: HTMLImageElement | HTMLCanvasElement | String = js.native
  var crossOrigin: String = js.native
  var onLoad: js.Any = js.native
  var onError: js.Any = js.native

  override def clone(options: js.Any): Raster = js.native

  def getSubCanvas(rect: Rectangle): HTMLCanvasElement = js.native

  def getSubRaster(rect: Rectangle): Raster = js.native

  def toDataURL(): String = js.native

  def drawImage(image: HTMLImageElement | HTMLCanvasElement, point: Point): Unit = js.native

  def getAverageColor(`object`: Path | Rectangle | Point): Color = js.native

  def getPixel(x: Double, y: Double): Color = js.native

  def getPixel(point: Point): Color = js.native

  def setPixel(x: Double, y: Double, color: Color): Unit = js.native

  def setPixel(point: Point, color: Color): Unit = js.native

  def createImageData(size: Size): ImageData = js.native

  def getImageData(rect: Rectangle): ImageData = js.native

  def setImageData(data: ImageData, point: Point): Unit = js.native
}

@js.native
@JSGlobal("paper.PlacedSymbol")
class PlacedSymbol extends Item {
  var symbol: Symbol = js.native

  override def clone(options: js.Any): PlacedSymbol = js.native
}

@js.native
@JSGlobal("paper.HitResult")
class HitResult extends js.Object {
  var `type`: String = js.native
  var name: String = js.native
  var item: Item = js.native
  var location: CurveLocation = js.native
  var color: Color = js.native
  var segment: Segment = js.native
  var point: Point = js.native
}

@js.native
@JSGlobal("paper.PathItem")
class PathItem extends Item {
  def interiorPoint: Point = js.native

  var clockwise: Boolean = js.native
  var pathData: String = js.native

  override def clone(options: js.Any): PathItem = js.native

  def unite(path: PathItem, options: js.Any): PathItem = js.native

  def intersect(path: PathItem, options: js.Any): PathItem = js.native

  def subtract(path: PathItem, options: js.Any): PathItem = js.native

  def exclude(path: PathItem, options: js.Any): PathItem = js.native

  def divide(path: PathItem, options: js.Any): PathItem = js.native

  def reorient(nonZero: Boolean, clockwise: Boolean): PathItem = js.native

  def getIntersections(path: PathItem, include: js.Function1[CurveLocation, Boolean]): js.Array[CurveLocation] = js.native

  def getCrossings(path: PathItem): js.Array[CurveLocation] = js.native

  def getNearestLocation(point: Point): CurveLocation = js.native

  def getNearestPoint(point: Point): Point = js.native

  def reverse(): Unit = js.native

  def flatten(flatness: Double): Unit = js.native

  def smooth(options: js.Any): Unit = js.native

  def simplify(tolerance: Double): Boolean = js.native

  def interpolate(from: PathItem, to: PathItem, factor: Double): Unit = js.native

  def compare(path: PathItem): Boolean = js.native

  def moveTo(point: Point): Unit = js.native

  def lineTo(point: Point): Unit = js.native

  def arcTo(through: Point, to: Point): Unit = js.native

  def arcTo(to: Point, clockwise: Boolean): Unit = js.native

  def curveTo(through: Point, to: Point, time: Double): Unit = js.native

  def cubicCurveTo(handle1: Point, handle2: Point, to: Point): Unit = js.native

  def quadraticCurveTo(handle: Point, to: Point): Unit = js.native

  def closePath(tolerance: Double): Unit = js.native

  def moveBy(to: Point): Unit = js.native

  def lineBy(point: Point): Unit = js.native

  def arcBy(through: Point, to: Point): Unit = js.native

  def arcBy(to: Point, clockwise: Boolean): Unit = js.native

  def curveBy(through: Point, to: Point, time: Double): Unit = js.native

  def cubicCurveBy(handle1: Point, handle2: Point, to: Point): Unit = js.native

  def quadraticCurveBy(handle: Point, to: Point): Unit = js.native
}

@js.native
@JSGlobal("paper.PathItem")
object PathItem extends js.Object {
  def create(pathData: String): Path | CompoundPath = js.native

  def create(segments: js.Array[Double] | js.Array[js.Any]): Path | CompoundPath = js.native

  def create(`object`: js.Any): Path | CompoundPath = js.native
}

@js.native
@JSGlobal("paper.Path")
class Path extends PathItem {
  def this(segments: js.Array[Segment] | js.Array[Point] | js.Array[js.Array[Double]]) = this()

  def this(`object`: js.Any) = this()

  def this(pathData: String) = this()

  override def clone(options: js.Any): Path = js.native

  var segments: js.Array[Segment] = js.native

  def firstSegment: Segment = js.native

  def lastSegment: Segment = js.native

  def curves: js.Array[Curve] = js.native

  def firstCurve: Curve = js.native

  def lastCurve: Curve = js.native

  var closed: Boolean = js.native

  def length: Double = js.native

  def area: Double = js.native

  def add(segment: Segment | Point | js.Array[Double]): Segment = js.native

  def insert(index: Double, segment: Segment | Point | js.Array[Double]): Segment = js.native

  def addSegments(segments: js.Array[Segment] | js.Array[Point] | js.Array[js.Array[Double]]): js.Array[Segment] = js.native

  def insertSegments(index: Double, segments: js.Array[Segment] | js.Array[Point] | js.Array[js.Array[Double]]): js.Array[Segment] = js.native

  def removeSegment(index: Double): Segment = js.native

  def removeSegments(): js.Array[Segment] = js.native

  def removeSegments(from: Double, to: Double): js.Array[Segment] = js.native

  def hasHandles(): Boolean = js.native

  def clearHandles(): Unit = js.native

  def divideAt(location: CurveLocation): Path = js.native

  def divideAt(offset: Double): Path = js.native

  def split(offset: Double): Path = js.native

  def split(location: CurveLocation): Path = js.native

  def split(index: Double, offset: Double): Path = js.native

  def join(path: Path, tolerance: Double): Path = js.native

  def reducePath(options: js.Any): Unit = js.native

  def toShape(insert: Boolean): Shape = js.native

  def getLocationOf(point: Point): CurveLocation = js.native

  def getOffsetOf(point: Point): Double = js.native

  def getLocationAt(offset: Double, isTime: Boolean): CurveLocation = js.native

  def getPointAt(offset: Double, isTime: Boolean): Point = js.native

  def getTangentAt(offset: Double, isTime: Boolean): Point = js.native

  def getNormalAt(offset: Double, isTime: Boolean): Point = js.native

  def getWeightedTangentAt(offset: Double, isTime: Boolean): Point = js.native

  def getWeightedNormalAt(offset: Double, isTime: Boolean): Point = js.native

  def getCurvatureAt(offset: Double, isTime: Boolean, point: Point): Double = js.native
}

@js.native
@JSGlobal("paper.CompoundPath")
class CompoundPath extends PathItem {
  def this(`object`: js.Any) = this()

  def this(pathData: String) = this()

  var closed: Boolean = js.native

  def firstSegment: Segment = js.native

  def lastSegment: Segment = js.native

  def curves: js.Array[Curve] = js.native

  def firstCurve: Curve = js.native

  def lastCurve: Curve = js.native

  def area: Double = js.native

  def length: Double = js.native

  override def clone(options: js.Any): CompoundPath = js.native
}

@js.native
@JSGlobal("paper.Segment")
class Segment extends js.Object {
  def this(point: Point, handleIn: Point, handleOut: Point) = this()

  def this(`object`: js.Any) = this()

  var point: Point = js.native
  var handleIn: Point = js.native
  var handleOut: Point = js.native
  var selected: Boolean = js.native

  def index: Double = js.native

  def path: Path = js.native

  def curve: Curve = js.native

  def location: CurveLocation = js.native

  def next: Segment = js.native

  def previous: Segment = js.native

  def hasHandles(): Boolean = js.native

  def isSmooth(): Boolean = js.native

  def clearHandles(): Unit = js.native

  def smooth(options: js.Any): Unit = js.native

  def isFirst(): Boolean = js.native

  def isLast(): Boolean = js.native

  def reversed(): Segment = js.native

  def reverse(): Segment = js.native

  def remove(): Boolean = js.native

  def equals(segment: Segment): Boolean = js.native

  override def clone(): Segment = js.native

  override def toString(): String = js.native

  def transform(matrix: Matrix): Unit = js.native

  def interpolate(from: Segment, to: Segment, factor: Double): Unit = js.native
}

@js.native
@JSGlobal("paper.Curve")
class Curve extends js.Object {
  def this(segment1: Segment, segment2: Segment) = this()

  def this(point1: Point, handle1: Point, handle2: Point, point2: Point) = this()

  var point1: Point = js.native
  var point2: Point = js.native
  var handle1: Point = js.native
  var handle2: Point = js.native

  def segment1: Segment = js.native

  def segment2: Segment = js.native

  def path: Path = js.native

  def index: Double = js.native

  def next: Curve = js.native

  def previous: Curve = js.native

  var selected: Boolean = js.native

  def values: js.Array[Double] = js.native

  def points: js.Array[Point] = js.native

  def length: Double = js.native

  def area: Double = js.native

  var bounds: Rectangle = js.native
  var strokeBounds: Rectangle = js.native
  var handleBounds: Rectangle = js.native

  override def clone(): Curve = js.native

  override def toString(): String = js.native

  def classify(): js.Any = js.native

  def remove(): Boolean = js.native

  def isFirst(): Boolean = js.native

  def isLast(): Boolean = js.native

  def getPart(from: Double, to: Double): Curve = js.native

  def divide(offset: Double, isTime: Boolean): Curve = js.native

  def divideAt(location: Double | CurveLocation): Curve = js.native

  def divideAtTime(time: Double, setHandles: Boolean): Curve = js.native

  def split(offset: Double, isParameter: Boolean): Path = js.native

  def splitAt(location: Double | CurveLocation): Path = js.native

  def splitAtTime(time: Double): Path = js.native

  def reversed(): Curve = js.native

  def clearHandles(): Unit = js.native

  def hasHandles(): Boolean = js.native

  def hasLength(epsilon: Double): Boolean = js.native

  def isStraight(): Boolean = js.native

  def isLinear(): Boolean = js.native

  def isCollinear(curve: Curve): Boolean = js.native

  def isHorizontal(): Boolean = js.native

  def isVertical(): Boolean = js.native

  def getParameterAt(offset: Double, start: Double): Double = js.native

  def getParameterOf(point: Point): Double = js.native

  def getLocationAt(offset: Double, isTime: Boolean): CurveLocation = js.native

  def getTimeAt(offset: Double, start: Double): Double = js.native

  def getOffsetAtTime(time: Double): Double = js.native

  def getLocationOf(point: Point): CurveLocation = js.native

  def getOffsetOf(point: Point): Double = js.native

  def getTimeOf(point: Point): Double = js.native

  def getNearestLocation(point: Point): CurveLocation = js.native

  def getNearestPoint(point: Point): Point = js.native

  def getPointAt(offset: Double, isTime: Boolean): Point = js.native

  def getTangentAt(offset: Double, isTime: Boolean): Point = js.native

  def getNormalAt(offset: Double, isTime: Boolean): Point = js.native

  def getWeightedTangentAt(offset: Double, isTime: Boolean): Point = js.native

  def getWeightedNormalAt(offset: Double, isTime: Boolean): Point = js.native

  def getCurvatureAt(offset: Double, isTime: Boolean): Point = js.native

  def getIntersections(curve: Curve): js.Array[CurveLocation] = js.native
}

@js.native
@JSGlobal("paper.CurveLocation")
class CurveLocation extends js.Object {
  def this(curve: Curve, time: Double, point: Point) = this()

  def segment: Segment = js.native

  def curve: Curve = js.native

  def path: Path = js.native

  def index: Double = js.native

  def parameter: Double = js.native

  def time: Double = js.native

  def point: Point = js.native

  def offset: Double = js.native

  def curveOffset: Double = js.native

  def intersection: CurveLocation = js.native

  def tangent: Point = js.native

  def normal: Point = js.native

  def curvature: Double = js.native

  def distance: Double = js.native

  def equals(location: CurveLocation): Boolean = js.native

  override def toString(): String = js.native

  def isTouching(): Boolean = js.native

  def isCrossing(): Boolean = js.native

  def hasOverlap(): Boolean = js.native
}

@js.native
@JSGlobal("paper.Project")
class Project extends js.Object {
  def this(element: HTMLCanvasElement | String) = this()

  def view: View = js.native

  var currentStyle: Style = js.native

  def index: Double = js.native

  def layers: js.Array[Layer] = js.native

  def activeLayer: Layer = js.native

  def symbols: js.Array[Symbol] = js.native

  def selectedItems: js.Array[Item] = js.native

  def activate(): Unit = js.native

  def clear(): Unit = js.native

  def isEmpty(): Boolean = js.native

  def remove(): Unit = js.native

  def selectAll(): Unit = js.native

  def deselectAll(): Unit = js.native

  def addLayer(layer: Layer): Layer = js.native

  def insertLayer(index: Double, layer: Layer): Layer = js.native

  def hitTest(point: Point, options: IHitTestOptions): HitResult = js.native

  def hitTestAll(point: Point, options: IHitTestOptions): js.Array[HitResult] = js.native

  def getItems(`match`: js.Any): js.Array[Item] = js.native

  def getItem(`match`: js.Any): Item = js.native

  def exportJSON(options: js.Any): String = js.native

  def importJSON(json: String): Unit = js.native

  def exportSVG(options: js.Any): SVGElement = js.native

  def importSVG(svg: SVGElement | String, options: js.Any): Item = js.native

  def importSVG(svg: SVGElement | String, onLoad: js.Function2[Item, String, Unit]): Item = js.native
}

@js.native
@JSGlobal("paper.Symbol")
class Symbol extends js.Object {
  def this(item: Item, dontCenter: Boolean) = this()

  def project: Project = js.native

  var definition: Item = js.native

  def place(position: Point): PlacedSymbol = js.native

  override def clone(): Symbol = js.native

  def equals(symbol: Symbol): Boolean = js.native
}

@js.native
@JSGlobal("paper.Style")
class Style extends js.Object {
  def view: View = js.native

  var strokeColor: Color | String = js.native
  var strokeWidth: Double = js.native
  var strokeCap: String = js.native
  var strokeJoin: String = js.native
  var strokeScaling: Boolean = js.native
  var dashOffset: Double = js.native
  var dashArray: js.Array[Double] = js.native
  var miterLimit: Double = js.native
  var fillColor: Color | String = js.native
  var fillRule: String = js.native
  var shadowColor: Color | String = js.native
  var shadowBlur: Double = js.native
  var shadowOffset: Point = js.native
  var selectedColor: Color | String = js.native
  var fontFamily: String = js.native
  var fontWeight: String | Double = js.native
  var fontSize: String | Double = js.native
  var leading: Double | String = js.native
  var justification: String = js.native
}

@js.native
trait IHSBColor extends js.Object {
  var hue: Double = js.native
  var saturation: Double = js.native
  var brightness: Double = js.native
  var alpha: Double = js.native
}

@js.native
trait IHSLColor extends js.Object {
  var hue: Double = js.native
  var saturation: Double = js.native
  var lightness: Double = js.native
  var alpha: Double = js.native
}

@js.native
trait IGradientColor extends js.Object {
  var gradient: Gradient = js.native
  var origin: Point = js.native
  var destination: Point = js.native
  var radial: Boolean = js.native
}

@js.native
@JSGlobal("paper.Color")
class Color extends js.Object {
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()

  def this(gray: Double, alpha: Double) = this()

  def this(`object`: IHSBColor | IHSLColor | IGradientColor) = this()

  def this(color: Gradient, origin: Point, destination: Point, highlight: Point) = this()

  def this(css: String) = this()

  var `type`: String = js.native

  def components: Double = js.native

  var alpha: Double = js.native
  var red: Double = js.native
  var green: Double = js.native
  var blue: Double = js.native
  var gray: Double = js.native
  var hue: Double = js.native
  var saturation: Double = js.native
  var brightness: Double = js.native
  var lightness: Double = js.native
  var gradient: Gradient = js.native
  var origin: Point = js.native
  var destination: Point = js.native
  var highlight: Point = js.native

  def set(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native

  def set(gray: Double, alpha: Double): Unit = js.native

  def set(`object`: IHSBColor | IHSLColor | IGradientColor): Unit = js.native

  def set(color: Gradient, origin: Point, destination: Point, highlight: Point): Unit = js.native

  def set(css: String): Unit = js.native

  def convert(`type`: String): Color = js.native

  def hasAlpha(): Boolean = js.native

  def equals(color: Color): Boolean = js.native

  override def clone(): Color = js.native

  override def toString(): String = js.native

  def toCSS(hex: Boolean): String = js.native

  def transform(matrix: Matrix): Unit = js.native

  def add(number: Double): Color = js.native

  def add(color: Color): Color = js.native

  def subtract(number: Double): Color = js.native

  def subtract(color: Color): Color = js.native

  def multiply(number: Double): Color = js.native

  def multiply(color: Color): Color = js.native

  def divide(number: Double): Color = js.native

  def divide(color: Color): Color = js.native
}

@js.native
@JSGlobal("paper.Gradient")
class Gradient extends js.Object {
  def this(stops: js.Array[GradientStop] | js.Array[String] | js.Array[js.Array[String | Double]], radial: Boolean) = this()

  def this(`object`: js.Any) = this()

  var stops: js.Array[GradientStop] = js.native
  var radial: Boolean = js.native

  override def clone(): Gradient = js.native

  def equals(gradient: Gradient): Boolean = js.native
}

@js.native
@JSGlobal("paper.GradientStop")
class GradientStop extends js.Object {
  def this(color: Color | String, rampPoint: Double) = this()

  def this(`object`: js.Any) = this()

  def this(array: js.Tuple2[String, Double]) = this()

  var rampPoint: Double = js.native
  var offset: Double = js.native
  var color: Color = js.native

  override def clone(): GradientStop = js.native
}

@js.native
@JSGlobal("paper.View")
class View extends js.Object {
  var autoUpdate: Boolean = js.native

  def element: HTMLCanvasElement = js.native

  def pixelRatio: Double = js.native

  def resolution: Double = js.native

  var viewSize: Size = js.native
  var bounds: Rectangle = js.native

  def size: Size = js.native

  var center: Point = js.native
  var zoom: Double = js.native
  var rotation: Double = js.native
  var scaling: Double = js.native
  var matrix: Matrix = js.native
  var onFrame: js.Function1[IFrameEvent, Unit] = js.native
  var onResize: js.Function1[Event, Unit] = js.native
  var onMouseDown: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseDrag: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseUp: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onClick: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onDoubleClick: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseMove: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseEnter: js.Function1[MouseEvent, Unit] | Boolean = js.native
  var onMouseLeave: js.Function1[MouseEvent, Unit] | Boolean = js.native

  def remove(): Unit = js.native

  def isVisible(): Boolean = js.native

  def isInserted(): Boolean = js.native

  def scrollBy(point: Point): Unit = js.native

  def play(): Unit = js.native

  def pause(): Unit = js.native

  def update(): Unit = js.native

  def requestUpdate(): Unit = js.native

  def translate(delta: Point): Unit = js.native

  def rotate(angle: Double, center: Point): Unit = js.native

  def scale(scale: Double, center: Point): Unit = js.native

  def scale(hor: Double, ver: Double, center: Point): Unit = js.native

  def shear(shear: Point, center: Point): Unit = js.native

  def shear(hor: Double, ver: Double, center: Point): Unit = js.native

  def skew(skew: Point, center: Point): Unit = js.native

  def skew(hor: Double, ver: Double, center: Point): Unit = js.native

  def projectToView(point: Point): Point = js.native

  def viewToProject(point: Point): Point = js.native

  def getEventPoint(event: Event): Point = js.native

  def on(`type`: String, callback: js.Function1[IFrameEvent, Unit] | Boolean): Item = js.native

  def on(param: js.Any): Item = js.native

  def off(`type`: String, callback: js.Function1[IFrameEvent, Unit] | Boolean): Item = js.native

  def off(param: js.Any): Item = js.native

  def emit(`type`: String, event: js.Any): Boolean = js.native

  def responds(`type`: String): Boolean = js.native

  def draw(): Unit = js.native
}

@js.native
@JSGlobal("paper.Tool")
class Tool extends js.Object {
  var minDistance: Double = js.native
  var maxDistance: Double = js.native
  var fixedDistance: Double = js.native
  var onMouseDown: js.Function1[ToolEvent, Unit] | Boolean = js.native
  var onMouseDrag: js.Function1[ToolEvent, Unit] | Boolean = js.native
  var onMouseMove: js.Function1[ToolEvent, Unit] | Boolean = js.native
  var onMouseUp: js.Function1[ToolEvent, Unit] | Boolean = js.native
  var onKeyDown: js.Function1[KeyEvent, Unit] | Boolean = js.native
  var onKeyUp: js.Function1[KeyEvent, Unit] | Boolean = js.native

  def activate(): Unit = js.native

  def remove(): Unit = js.native

  def on(`type`: String, callback: js.Function1[ToolEvent | KeyEvent, Unit] | Boolean): Tool = js.native

  def on(param: js.Any): Tool = js.native

  def off(`type`: String, callback: js.Function1[ToolEvent | KeyEvent, Unit] | Boolean): Tool = js.native

  def off(param: js.Any): Tool = js.native

  def emit(`type`: String, event: js.Any): Boolean = js.native

  def responds(`type`: String): Boolean = js.native
}

@js.native
@JSGlobal("paper.Event")
class Event extends js.Object {
  def timeStamp: Double = js.native

  def modifiers: js.Any = js.native

  def preventDefault(): Unit = js.native

  def stopPropagation(): Unit = js.native

  def stop(): Unit = js.native
}

@js.native
@JSGlobal("paper.ToolEvent")
class ToolEvent extends Event {
  var `type`: String = js.native
  var point: Point = js.native
  var lastPoint: Point = js.native
  var downPoint: Point = js.native
  var middlePoint: Point = js.native
  var delta: Point = js.native
  var count: Double = js.native
  var item: Item = js.native

  override def toString(): String = js.native
}

@js.native
@JSGlobal("paper.Key")
class Key extends js.Object {
}

object Key {

  @js.native
  trait Modifiers extends js.Object {
    var shift: Boolean = js.native
    var control: Boolean = js.native
    var alt: Boolean = js.native
    var meta: Boolean = js.native
    var capsLock: Boolean = js.native
    var space: Boolean = js.native
    var option: Boolean = js.native
    var command: Boolean = js.native
  }
}

@js.native
@JSGlobal("paper.KeyEvent")
class KeyEvent extends Event {
  var `type`: String = js.native
  var character: String = js.native
  var key: String = js.native

  override def toString(): String = js.native
}

@js.native
@JSGlobal("paper.TextItem")
class TextItem extends Item {
  var content: String = js.native
  var fontFamily: String = js.native
  var fontWeight: String | Double = js.native
  var fontSize: String | Double = js.native
  var leading: String | Double = js.native
  var justification: String = js.native

  override def clone(options: js.Any): TextItem = js.native
}

@js.native
@JSGlobal("paper.PointText")
class PointText extends TextItem {
  def this(point: Point) = this()

  def this(`object`: js.Any) = this()

  var point: Point = js.native
}

@js.native
@JSGlobal("paper.MouseEvent")
class MouseEvent extends Event {
  def this(`type`: String, event: NativeMouseEvent, point: Point, target: Item, delta: Point) = this()

  var event: NativeMouseEvent = js.native
  var point: Point = js.native
  var lastPoint: Point = js.native
  var delta: Point = js.native
  var target: Item = js.native
  var currentTarget: Item = js.native
  var `type`: String = js.native
}

@js.native
@JSGlobal("paper")
object Paper extends js.Object {
  var version: String = js.native
  var project: Project = js.native
  var projects: js.Array[Project] = js.native
  var view: View = js.native
  var tool: Tool = js.native
  var tools: js.Array[Tool] = js.native

  def install(scope: js.Any): Unit = js.native

  def setup(canvas: HTMLCanvasElement | String): Unit = js.native

  def activate(): Unit = js.native
}

@js.native
@JSGlobal("paper.Path.Line")
class Line extends Path {
  def this(from: Point, to: Point) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): Line = js.native
}

@js.native
@JSGlobal("paper.Path.Circle")
class Circle extends Path {
  def this(center: Point, radius: Double) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): Circle = js.native
}

@js.native
@JSGlobal("paper.Path.Ellipse")
class Ellipse extends Path {
  def this(rectangle: paper.Rectangle) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): Ellipse = js.native
}

@js.native
@JSGlobal("paper.Path.Arc")
class Arc extends Path {
  def this(from: Point, through: Point, to: Point) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): Arc = js.native
}

@js.native
@JSGlobal("paper.Path.RegularPolygon")
class RegularPolygon extends Path {
  def this(center: Point, sides: Double, radius: Double) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): RegularPolygon = js.native
}

@js.native
@JSGlobal("paper.Path.Star")
class Star extends Path {
  def this(center: Point, points: Double, radius1: Double, radius2: Double) = this()

  def this(`object`: js.Any) = this()

  override def clone(options: js.Any): Star = js.native
}
