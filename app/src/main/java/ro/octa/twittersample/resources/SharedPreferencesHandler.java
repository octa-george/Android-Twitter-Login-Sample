package ro.octa.twittersample.resources;

import android.content.Context;
import android.content.SharedPreferences;

import ro.octa.twittersample.constants.Preferences;

/**
 * This class is responsible for all the params saved on Shared Preferences
 *
 * @author Octa
 */
public class SharedPreferencesHandler {

    /**
     * @param context - Android context
     * @return - The app shared preferences
     */
    private static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences(Preferences.PrefNames.PREFS_NAME_TAG, Context.MODE_PRIVATE);
    }

    /**
     * Check user already logged in your application using twitter Login flag is
     * fetched from Shared Preferences
     *
     * @param context - Android context
     * @return - twitter login status
     */
    public static boolean isTwitterLoggedInAlready(Context context) {
        final SharedPreferences prefs = getSharedPrefs(context);
        return prefs.getBoolean(Preferences.PrefKeys.PREF_KEY_TWITTER_LOGIN, false);
    }

    /**
     * Set loggedIn on shared preferences
     *
     * @param loggedIn status boolean
     */
    public static void setTwitterLoggedIn(Context context, boolean loggedIn) {
        SharedPreferences prefs = getSharedPrefs(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(Preferences.PrefKeys.PREF_KEY_TWITTER_LOGIN, loggedIn);
        editor.apply();
    }

    /**
     * @return accessToken from the shared preferences
     */
    public static String getTwitterAccessToken(Context context) {
        SharedPreferences prefs = getSharedPrefs(context);
        return prefs.getString(Preferences.PrefKeys.PREF_KEY_ACCESS_TOKEN, "");
    }

    /**
     * Set accessToken on shared preferences
     *
     * @param accessToken string
     */
    public static void setTwitterAccessToken(Context context, String accessToken) {
        SharedPreferences prefs = getSharedPrefs(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(Preferences.PrefKeys.PREF_KEY_ACCESS_TOKEN, accessToken);
        editor.apply();
    }

    /**
     * @return accessSecret from the shared preferences
     */
    public static String getTwitterAccessSecret(Context context) {
        SharedPreferences prefs = getSharedPrefs(context);
        return prefs.getString(Preferences.PrefKeys.PREF_KEY_ACCESS_SECRET, "");
    }

    /**
     * Set accessSecret on shared preferences
     *
     * @param accessSecret string
     */
    public static void setTwitterAccessSecret(Context context, String accessSecret) {
        SharedPreferences prefs = getSharedPrefs(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(Preferences.PrefKeys.PREF_KEY_ACCESS_SECRET, accessSecret);
        editor.apply();
    }

    /**
     * @return accessSecret from the shared preferences
     */
    public static String getTwitterUsername(Context context) {
        SharedPreferences prefs = getSharedPrefs(context);
        return prefs.getString(Preferences.PrefKeys.PREF_KEY_USER_NAME, "");
    }

    /**
     * Set username on shared preferences
     *
     * @param username string
     */
    public static void setTwitterUsername(Context context, String username) {
        SharedPreferences prefs = getSharedPrefs(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(Preferences.PrefKeys.PREF_KEY_USER_NAME, username);
        editor.apply();
    }

    public static void clearCredentials(Context context) {
        SharedPreferences prefs = getSharedPrefs(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(Preferences.PrefKeys.PREF_KEY_ACCESS_TOKEN);
        editor.remove(Preferences.PrefKeys.PREF_KEY_ACCESS_SECRET);
        editor.remove(Preferences.PrefKeys.PREF_KEY_USER_NAME);
        editor.putBoolean(Preferences.PrefKeys.PREF_KEY_TWITTER_LOGIN, false);
        editor.commit();
    }

}
