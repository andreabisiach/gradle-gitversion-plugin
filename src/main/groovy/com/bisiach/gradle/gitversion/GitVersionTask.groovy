package com.bisiach.gradle.gitversion;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

class GitVersionTask extends DefaultTask {
	private String gitVersionOutput
	
	protected void setGitVersionOutput(String gitVersionOutput) {
		this.gitVersionOutput = gitVersionOutput
	}
	
    @TaskAction
    void sayGitVersion() {
        System.out.printf(gitVersionOutput) 
    }
}