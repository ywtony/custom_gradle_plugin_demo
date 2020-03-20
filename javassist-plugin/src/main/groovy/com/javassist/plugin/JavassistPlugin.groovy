package com.javassist.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class JavassistPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("我是杨洛峋小宝宝")
    }
}