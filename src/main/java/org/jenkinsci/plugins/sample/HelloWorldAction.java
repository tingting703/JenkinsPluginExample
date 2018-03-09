package org.jenkinsci.plugins.sample;

import hudson.model.Action;


public class HelloWorldAction implements Action {
	
	@Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return null;
    }
    
    private String name;

    public HelloWorldAction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
  
}

