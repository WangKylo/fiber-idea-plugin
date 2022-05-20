package com.github.wangkylo.fiberideaplugin.services

import com.intellij.openapi.project.Project
import com.github.wangkylo.fiberideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
