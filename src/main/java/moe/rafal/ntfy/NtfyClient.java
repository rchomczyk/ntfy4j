package moe.rafal.ntfy;

import moe.rafal.ntfy.message.Message;

public interface NtfyClient {

  void publish(final String topicUri, final Message message);
}
