package com.nanda.javarest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JavaRestApplication extends Application<JavaRestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new JavaRestApplication().run(args);
    }

    @Override
    public String getName() {
        return "JavaRest";
    }

    @Override
    public void initialize(final Bootstrap<JavaRestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final JavaRestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    	environment.jersey().register(new LoginApi());
    }

}
