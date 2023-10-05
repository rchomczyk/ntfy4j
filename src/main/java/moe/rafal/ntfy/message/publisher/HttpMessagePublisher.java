package moe.rafal.ntfy.message.publisher;

import static kong.unirest.core.Unirest.post;

import java.util.Locale;
import kong.unirest.core.RequestBodyEntity;
import moe.rafal.ntfy.message.Message;

class HttpMessagePublisher implements MessagePublisher {

  @Override
  public void publish(final String topicUri, final Message message) {
    RequestBodyEntity request = post(topicUri)
        .contentType("text/plain; charset=UTF-8")
        .header("Tags", String.join(",", message.tags()))
        .header("Markdown", String.valueOf(message.hasMarkdown()))
        .header("Priority", message.priority().name().toLowerCase(Locale.ROOT))
        .body(message.text());

    if (message.title() != null) {
      request = request.header("Title", message.title());
    }

    if (message.clickUri() != null) {
      request = request.header("Click", message.clickUri());
    }

    if (message.attachUri() != null) {
      request = request.header("Attach", message.attachUri());
    }

    request.asEmpty();
  }
}
