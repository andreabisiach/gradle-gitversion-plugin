package com.bisiach.gradle.gitversion;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.GradleScriptException;
import groovy.json.JsonSlurper;

class GitVersionPlugin implements Plugin<Project> {
	@Override	
    def void apply(Project project) {	
		def currentDir = project.projectDir.toString()
		def gitVersionOutput = ""
		try {
			gitVersionOutput = "gitversion".execute(null, new File(currentDir)).text
		} catch (Exception e) {
			throw new GradleScriptException("Could not find a valid GitVersion executable in the path",e)
		}
		
		def json = new JsonSlurper().parseText(gitVersionOutput)
		def task = project.tasks.create('GitVersion', GitVersionTask) {
			group 'GitVersion'
			description 'Runs GitVersion and returns json output'
			setGitVersionOutput(gitVersionOutput)
		}
		def extension = project.extensions.create("GitVersion", GitVersionPluginExtension,json)		
    }
}