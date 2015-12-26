package org.gooru.nucleus.handlers.jobs.constants;

public class MessagebusEndpoints {
  /*
   * Any change here in end points should be done in the gateway side as well, as both sender and receiver should be in sync
   */
  public static final String MBEP_JOB = "org.gooru.nucleus.message.bus.job";
  public static final String MBEP_EVENT = "org.gooru.nucleus.message.bus.publisher.event";
  

}
