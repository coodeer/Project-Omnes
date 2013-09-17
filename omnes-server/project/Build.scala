import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "omnes-server"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "uk.co.panaxiom" %% "play-jongo" % "0.5.0-jongo0.4"
    
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}