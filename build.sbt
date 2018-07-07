enablePlugins(org.nlogo.build.NetLogoExtension)

netLogoExtName      := "physics"

netLogoClassManager := "PhysicsExtension"

scalaVersion           := "2.11.7"

scalaSource in Compile := baseDirectory.value / "src"

scalacOptions          ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "us-ascii")

netLogoVersion := "6.0.2"

fork in run := true

