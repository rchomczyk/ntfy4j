package moe.rafal.ntfy;

import static moe.rafal.ntfy.message.publisher.MessagePublisherFactory.produceMessagePublisher;

import moe.rafal.ntfy.message.Message;
import moe.rafal.ntfy.message.publisher.MessagePublisher;

class NtfyClientImpl implements NtfyClient {

  private final MessagePublisher messagePublisher;

  NtfyClientImpl() {
    this.messagePublisher = produceMessagePublisher();
  }

  @Override
  public void publish(final String topicUri, final Message message) {
    messagePublisher.publish(topicUri, message);
  }
}
