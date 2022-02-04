package com.github.anangryant.ideapluginstemplate.services

import com.intellij.openapi.project.Project
import com.github.anangryant.ideapluginstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
