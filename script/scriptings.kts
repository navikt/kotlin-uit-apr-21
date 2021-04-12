#!/usr/bin/env kotlin

import java.io.File

val hostsFile = File("/etc/hosts").readText()
println(hostsFile)
