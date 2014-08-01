package ro.octa.twittersample.constants;

/**
 * Contains all the constants used as SharedPreferences file names, keys or values.
 *
 * @author Octa
 */
public interface Preferences {
    /**
     * Shared Pref file name
     */
    interface PrefNames {
        /**
         * Application main preferences.
         */
        String PREFS_NAME_TAG = "twitterSamplePrefs";

    }

    /**
     * Constants used as preference keys.
     */
    interface PrefKeys {

        /**
         * Flag to determine if the twitter login status
         */
        String PREF_KEY_TWITTER_LOGIN = "twitterLogin";

        /**
         * Identifier for user accessToken
         */
        String PREF_KEY_ACCESS_TOKEN = "accessToken";

        /**
         * Identifier for user accessSecret
         */
        String PREF_KEY_ACCESS_SECRET = "accessSecret";

        /**
         * Identifier for twitter username
         */
        String PREF_KEY_USER_NAME = "twitterUser";

    }

    /**
     * Constants used as preference values.
     */
    interface PrefValues {

    }
}
