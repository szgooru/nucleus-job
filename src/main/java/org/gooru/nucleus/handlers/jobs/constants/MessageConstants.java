package org.gooru.nucleus.handlers.jobs.constants;

public class MessageConstants {
  
  public static final String MSG_HEADER_OP = "mb.operation";
  public static final String MSG_HEADER_TOKEN = "session.token";
  public static final String MSG_OP_AUTH_WITH_PREFS = "auth.with.prefs";
  public static final String MSG_OP_STATUS = "mb.operation.status";
  public static final String MSG_KEY_PREFS = "prefs";
  public static final String MSG_OP_STATUS_SUCCESS = "success";
  public static final String MSG_OP_STATUS_ERROR = "error";
  public static final String MSG_OP_STATUS_VALIDATION_ERROR = "error.validation.";
  public static final String MSG_USER_ANONYMOUS = "anonymous";
  public static final String MSG_USER_ID = "userId";
  public static final String MSG_HTTP_STATUS = "http.status";
  public static final String MSG_HTTP_BODY = "http.body";
  public static final String MSG_HTTP_RESPONSE = "http.response";
  public static final String MSG_HTTP_ERROR = "http.error";
  public static final String MSG_HTTP_VALIDATION_ERROR = "http.validation.error";
  public static final String MSG_HTTP_HEADERS = "http.headers";
  
  // Operation names: Also need to be updated in corresponding handlers
  public static final String MSG_OP_COURSE_COPY = "course.copy";

  // Containers for different responses
  public static final String RESP_CONTAINER_MBUS = "mb.container";
  public static final String RESP_CONTAINER_EVENT = "mb.event";
  

}
