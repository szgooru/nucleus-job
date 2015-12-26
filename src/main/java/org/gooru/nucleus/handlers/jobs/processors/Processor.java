package org.gooru.nucleus.handlers.jobs.processors;

import io.vertx.core.json.JsonObject;

public interface Processor {
  public JsonObject process();
}
