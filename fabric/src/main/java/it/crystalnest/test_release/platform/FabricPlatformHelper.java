package it.crystalnest.test_release.platform;

import it.crystalnest.test_release.platform.model.Platform;
import it.crystalnest.test_release.platform.services.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

/**
 * Fabric platform helper.
 */
public class FabricPlatformHelper implements PlatformHelper {
  @Override
  public Platform getPlatformName() {
    return Platform.FABRIC;
  }

  @Override
  public boolean isModLoaded(String modId) {
    return FabricLoader.getInstance().isModLoaded(modId);
  }

  @Override
  public boolean isDevEnv() {
    return FabricLoader.getInstance().isDevelopmentEnvironment();
  }
}
