package com.training.project.app;

import com.training.project.rest.HelloRestService;
import com.training.project.rest.TrainingController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public HelloApplication() {
        // Register our hello service
        singletons.add(new HelloRestService());
        singletons.add(new TrainingController());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
