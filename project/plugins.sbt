resolvers ++= Seq(
  "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com",
  "repo.jenkins-ci.org" at "https://repo.jenkins-ci.org/public"
)

addSbtPlugin("ohnosequences" % "nice-sbt-settings" % "0.8.0-RC4-3-g946d774")
