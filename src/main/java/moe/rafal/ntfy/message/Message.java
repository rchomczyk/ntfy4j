package moe.rafal.ntfy.message;

import static moe.rafal.ntfy.message.MessagePriority.DEFAULT;

import java.util.List;
import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;
import org.jetbrains.annotations.Nullable;

@Immutable
public interface Message {

  String getTitle();

  String getText();

  @Default
  default boolean hasMarkdown() {
    return false;
  }

  @Default
  default @Nullable String getClickUri() {
    return null;
  }

  @Default
  default @Nullable String getAttachUri() {
    return null;
  }

  @Default
  default List<String> getTags() {
    return List.of();
  }

  @Default
  default MessagePriority getPriority() {
    return DEFAULT;
  }
}