package it.crystalnest.test_release.platform.model;

/**
 * Platform.
 */
public enum Platform {
  FABRIC("fabric"),
  FORGE("forge"),
  NEOFORGE("neoforge");

  /**
   * Platform name.
   */
  private final String name;

  /**
   * @param name This {@link #name}.
   */
  Platform(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
