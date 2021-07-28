package com.github.safarmer.fluttersnippetsplugin.services

import com.github.safarmer.fluttersnippetsplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
