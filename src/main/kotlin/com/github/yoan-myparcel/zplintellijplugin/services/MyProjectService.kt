package com.github.yoan-myparcel.zplintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.yoan-myparcel.zplintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
