package com.github.achuanle.plugindemogradle.services

import com.intellij.openapi.project.Project
import com.github.achuanle.plugindemogradle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
