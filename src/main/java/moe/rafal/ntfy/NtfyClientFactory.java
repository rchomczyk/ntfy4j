package moe.rafal.ntfy;

public final class NtfyClientFactory {

  private NtfyClientFactory() {

  }

  public static NtfyClient produceNtfyClient() {
    return new NtfyClientImpl();
  }
}
