package moe.rafal.ntfy.message;

public record MessagePriority(int id, String name) {
  public static final MessagePriority MIN = new MessagePriority(1, "min");
  public static final MessagePriority LOW = new MessagePriority(2, "low");
  public static final MessagePriority DEFAULT = new MessagePriority(3, "default");
  public static final MessagePriority HIGH = new MessagePriority(4, "high");
  public static final MessagePriority URGENT = new MessagePriority(5, "urgent");
}
