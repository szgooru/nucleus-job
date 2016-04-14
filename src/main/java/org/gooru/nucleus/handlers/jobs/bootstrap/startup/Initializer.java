package org.gooru.nucleus.handlers.jobs.bootstrap.startup;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public interface Initializer {

    void initializeComponent(Vertx vertx, JsonObject config);

}
