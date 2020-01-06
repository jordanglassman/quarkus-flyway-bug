package org.my.group;

import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
@ApplicationPath("/app")
public class MyApplication extends Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyApplication.class);

    @Inject
    @ConfigProperty(name = "some.boolean.prop", defaultValue = "false")
    boolean someProp;

    void onStart(@Observes StartupEvent ev) {
        LOGGER.error("on startup ...");
    }
}