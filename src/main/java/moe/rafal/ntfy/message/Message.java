package moe.rafal.ntfy.message;

import static java.util.Collections.unmodifiableList;

import java.util.List;

public record Message(
    String title, String text, List<String> tags, String clickUri, String attachUri, boolean hasMarkdown, MessagePriority priority) {

  @Override
  public List<String> tags() {
    return unmodifiableList(tags);
  }
}