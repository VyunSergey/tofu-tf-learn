import Dependencies._

name := "tofu-tf-learn"
version := "0.1"
scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  catsCore,
  catsEffect,
  catsTaglessCore,
  catsTaglessMacros,
  circeCore,
  circeGeneric,
  circeParser,
  derevoCats,
  derevoCatsTagless,
  tofuCore,
  tofuConcurrent,
  tofuDerivation,
  tofuOpticsCore,
  tofuOpticsMacro,
  trace4catsCore,
  trace4catsInject,
  trace4catsJaeger,
  logback,
  compilerPlugin(kindProjector),
  compilerPlugin(betterMonadicFor)
)
