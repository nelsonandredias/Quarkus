package org.acme.quickstart.application;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class ApplicationLifeCycle {
	
	private static final Logger LOGGER = Logger.getLogger(ApplicationLifeCycle.class);
	
	void onStartup(@Observes StartupEvent event) {
		LOGGER.info("  ___ ___         .__  .__          ");
        LOGGER.info(" /   |   \\   ____ |  | |  |   ____  ");
        LOGGER.info("/    ~    \\_/ __ \\|  | |  |  /  _ \\ ");
        LOGGER.info("\\    Y    /\\  ___/|  |_|  |_(  <_> )");
        LOGGER.info(" \\___|_  /  \\___  >____/____/\\____/ ");
        LOGGER.info("       \\/       \\/                  ");
        LOGGER.info("                         Powered by Quarkus");             
	}
	
	void onShutdown(@Observes ShutdownEvent event) {
        LOGGER.info("The application is stopping...");
    }

}
