#!/bin/bash

build/sbt package && databricks pipelines deploy wiki.json