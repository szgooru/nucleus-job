package org.gooru.nucleus.handlers.jobs.processors;

import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import org.gooru.nucleus.handlers.jobs.constants.MessageConstants;
import org.gooru.nucleus.handlers.jobs.processors.exceptions.InvalidRequestException;
import org.gooru.nucleus.handlers.jobs.processors.exceptions.InvalidUserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MessageProcessor implements Processor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class);
    private Message<Object> message;
    String userId;
    JsonObject prefs;
    JsonObject request;

    public MessageProcessor(Message<Object> message) {
        this.message = message;
    }

    @Override
    public JsonObject process() {
        JsonObject result;
        try {
            if (message == null || !(message.body() instanceof JsonObject)) {
                LOGGER.error("Invalid message received, either null or body of message is not JsonObject ");
                throw new InvalidRequestException();
            }

            final String msgOp = message.headers().get(MessageConstants.MSG_HEADER_OP);
            userId = ((JsonObject) message.body()).getString(MessageConstants.MSG_USER_ID);
            if (userId == null) {
                LOGGER.error("Invalid user id passed. Not authorized.");
                throw new InvalidUserException();
            }
            prefs = ((JsonObject) message.body()).getJsonObject(MessageConstants.MSG_KEY_PREFS);
            request = ((JsonObject) message.body()).getJsonObject(MessageConstants.MSG_HTTP_BODY);
            switch (msgOp) {
            case MessageConstants.MSG_OP_COURSE_COPY:
                result = processCourseCopy();
                break;
            default:
                LOGGER.error("Invalid operation type passed in, not able to handle");
                throw new InvalidRequestException();
            }
            return result;
        } catch (InvalidRequestException e) {
            // TODO: handle exception
        } catch (InvalidUserException e) {
            // TODO: handle exception
        }

        return null;
    }

    private JsonObject processCourseCopy() {
        // TODO Auto-generated method stub

        return null;
    }

}
