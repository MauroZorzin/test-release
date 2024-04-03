package it.crystalnest.test_release;

import it.crystalnest.test_release.platform.Services;
import it.crystalnest.test_release.platform.services.PlatformHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Common shared constants across all loaders.
 */
public final class Constants {
	private Constants() {}

	/**
	 * Mod id.
	 */
	public static final String MOD_ID = "test_release";

	/**
	 * Mod logger.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * Provides information about what platform the mod is running on.
	 */
	public static final PlatformHelper PLATFORM = Services.load(PlatformHelper.class);
}
