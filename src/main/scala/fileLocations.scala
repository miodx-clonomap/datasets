package ohnosequences.datasets

import dataSets._
import ohnosequences.cosas.types._
import better.files._

case object fileLocations {

  case class FileDataLocation(val location: File) extends DataLocation[File]

  implicit def fileDataOps[D <: AnyData](data: D): FileDataOps[D] = FileDataOps(data)
  case class FileDataOps[D <: AnyData](val data: D) extends AnyVal {

    def inFile(file: File): D := FileDataLocation = data := FileDataLocation(file)
  }
}
