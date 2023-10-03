package moe.rafal.ntfy.message.publisher;

import moe.rafal.ntfy.message.Message;

public interface MessagePublisher {

  void publish(final String topicUri, final Message message);
}
