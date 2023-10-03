package moe.rafal.ntfy.message.publisher;

public final class MessagePublisherFactory {

  private MessagePublisherFactory() {

  }

  public static MessagePublisher produceMessagePublisher() {
    return new HttpMessagePublisher();
  }
}
