package timeline

import java.time.Duration


case class Animation (val totalDuration: Duration, var currentDuration: Duration = Duration.ZERO, var status: AnimationStatus = Stopped){

  private val start: Double = 0

  def play:Unit = {
    status = Running
  }
  def stop:Unit = status = Stopped
  def pause: Unit = status = Paused
}

trait AnimationStatus
case object Running extends AnimationStatus
case object Stopped extends AnimationStatus
case object Paused extends AnimationStatus
