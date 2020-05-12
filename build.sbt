/*
 * Copyright 2019 Databricks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "delta-pipelines-example-scala"

organization := "com.databricks.pipelines.examples"

crossScalaVersions := Seq("2.12.8", "2.11.12")

scalaVersion := crossScalaVersions.value.head

sparkVersion := "3.0.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "io.delta" %% "delta-core" % "0.7.0-SNAPSHOT" % "provided",
  "org.apache.spark" %% "spark-hive" % sparkVersion.value % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion.value % "provided",
  "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided",
  "org.apache.spark" %% "spark-catalyst" % sparkVersion.value % "provided",

  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

resolvers += "Temporary Staging of Spark 3.0" at "https://docs.delta.io/spark3artifacts/snapshot-5687b31be3f/maven/"
resolvers += "Pipelines Preview Repo" at "https://docs.delta.io/spark3preview/"
