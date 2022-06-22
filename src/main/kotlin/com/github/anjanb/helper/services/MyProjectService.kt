package com.github.anjanb.helper.services

import com.intellij.openapi.project.Project
import com.github.anjanb.helper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
