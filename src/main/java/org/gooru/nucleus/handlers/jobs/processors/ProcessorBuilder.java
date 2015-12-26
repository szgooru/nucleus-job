package org.gooru.nucleus.handlers.jobs.processors;

import io.vertx.core.eventbus.Message;

public class ProcessorBuilder {
  
  private Message<Object> message;

  public ProcessorBuilder(Message<Object> message) {
    this.message = message;
  }
  
  public Processor build() {
    return new MessageProcessor(message);
  }
}
