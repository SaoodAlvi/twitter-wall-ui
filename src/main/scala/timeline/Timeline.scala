package timeline

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class Timeline (val animations: mutable.ListBuffer[Animation] = ListBuffer.empty, var status: TimelineStatus = STOPPED) {

  private var startTime:Double = 0D
  def add(animation: Animation): Unit = animations += animation

  def play(time: Double): Unit = {
    if (status == STOPPED){
      startTime = time
      status = RUNNING
      animations.head.play
    } else {

    }
  }
  def stop: Unit = animations.foreach(_.stop)
  def pause: Unit = animations.foreach(_.pause)

}

trait TimelineStatus
case object RUNNING extends TimelineStatus
case object STOPPED extends TimelineStatus
case object PAUSED extends TimelineStatus
