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
        .header("Tags", String.join(",", message.getTags()))
        .header("Markdown", String.valueOf(message.hasMarkdown()))
        .header("Priority", message.getPriority().name().toLowerCase(Locale.ROOT))
        .body(message.getText());

    if (message.getTitle() != null) {
      request = request.header("Title", message.getTitle());
    }

    if (message.getClickUri() != null) {
      request = request.header("Click", message.getClickUri());
    }

    if (message.getAttachUri() != null) {
      request = request.header("Attach", message.getAttachUri());
    }

    request.asEmpty();
  }
}
