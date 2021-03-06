// to write types like Reader[String, ?]
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

lazy val lesson1 = (project in file(".")).
  settings(
    name         := "lessons",
    version      := "1.0",
    scalaVersion := "2.12.2",
    resolvers +=
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",

    //for eff monad, http://atnos-org.github.io/eff/org.atnos.site.Installation.html
    scalacOptions += "-Ypartial-unification",

    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.3",
      "com.typesafe.akka" %% "akka-agent" % "2.5.3",
      "com.typesafe.akka" %% "akka-camel" % "2.5.3",
      "com.typesafe.akka" %% "akka-cluster" % "2.5.3",
      "com.typesafe.akka" %% "akka-cluster-metrics" % "2.5.3",
      "com.typesafe.akka" %% "akka-cluster-sharding" % "2.5.3",
      "com.typesafe.akka" %% "akka-cluster-tools" % "2.5.3",
      "com.typesafe.akka" %% "akka-distributed-data" % "2.5.3",
      "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.5.3",
      "com.typesafe.akka" %% "akka-osgi" % "2.5.3",
      "com.typesafe.akka" %% "akka-persistence" % "2.5.3",
      "com.typesafe.akka" %% "akka-persistence-query" % "2.5.3",
      "com.typesafe.akka" %% "akka-persistence-tck" % "2.5.3",
      "com.typesafe.akka" %% "akka-remote" % "2.5.3",
      "com.typesafe.akka" %% "akka-slf4j" % "2.5.3",
      "com.typesafe.akka" %% "akka-stream" % "2.5.3",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.3",
      "com.typesafe.akka" %% "akka-testkit" % "2.5.3",
      "com.typesafe.akka" %% "akka-typed" % "2.5.3",
      "com.typesafe.akka" %% "akka-http" % "10.0.6",
      "com.typesafe.akka" %% "akka-contrib" % "2.5.3",

      "org.iq80.leveldb"             % "leveldb"          % "0.7",
      "org.fusesource.leveldbjni"    % "leveldbjni-all"   % "1.8",
      "org.scalactic" %% "scalactic" % "3.0.1",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test",
      "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
      "commons-io"    % "commons-io" % "2.5"   % "test",
      //"org.specs2" %% "specs2-core" % "3.6" % "test",
      //"org.specs2" %% "specs2-scalacheck" % "3.6" % "test",

      "io.pjan" %% "akka-d3" % "0.4.3",
      "io.pjan" %% "akka-d3-query-inmemory" % "0.4.3",
      "io.pjan" %% "akka-d3-readside-cassandra" % "0.4.3",
      "org.slf4j" % "slf4j-simple" % "1.7.7",

      "org.zalando" %% "grafter" % "1.7.0",
      "org.atnos" %% "eff" % "4.5.0",

      "com.github.mpilquist" %% "simulacrum" % "0.10.0",
      "org.scalamacros" %% "resetallattrs" % "1.0.0",

      "org.typelevel" %% "cats-core" % "1.0.0-MF",
      "org.typelevel" %% "cats-free" % "1.0.0-MF",
      "org.typelevel" %% "cats-laws" % "1.0.0-MF",
      "org.typelevel" %% "cats-mtl-core" % "0.0.2"
    )
  )
