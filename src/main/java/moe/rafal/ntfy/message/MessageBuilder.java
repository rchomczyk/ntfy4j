package moe.rafal.ntfy.message;

import static moe.rafal.ntfy.message.MessagePriority.DEFAULT;

import java.util.List;

public final class MessageBuilder {

  private String text;
  private String title = null;
  private String clickUri = null;
  private String attachUri = null;
  private boolean hasMarkdown = false;
  private List<String> tags = List.of();
  private MessagePriority priority = DEFAULT;

  private MessageBuilder() {

  }

  public static MessageBuilder newBuilder() {
    return new MessageBuilder();
  }

  public MessageBuilder title(final String title) {
    this.title = title;
    return this;
  }

  public MessageBuilder text(final String text) {
    this.text = text;
    return this;
  }

  public MessageBuilder tags(final List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MessageBuilder clickUri(final String clickUri) {
    this.clickUri = clickUri;
    return this;
  }

  public MessageBuilder attachUri(final String attachUri) {
    this.attachUri = attachUri;
    return this;
  }

  public MessageBuilder hasMarkdown(final boolean hasMarkdown) {
    this.hasMarkdown = hasMarkdown;
    return this;
  }

  public MessageBuilder priority(final MessagePriority priority) {
    this.priority = priority;
    return this;
  }

  public Message build() {
    return new Message(title, text, tags, clickUri, attachUri, hasMarkdown, priority);
  }
}
