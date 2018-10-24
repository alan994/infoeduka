package hr.alanjagar.infoeduka.utils;

import android.util.Log;

public class Logger {
    public static final String TAG = "Infoeduka";

    public static void debug(Class sender, String msg) {
        String tag = String.format("%s - %s", TAG, sender.toString());
        Log.d(tag, msg);
    }

    public static void info(Class sender, String msg) {
        String tag = String.format("%s - %s", TAG, sender.toString());
        Log.i(tag, msg);
    }

    public static void warn(Class sender, String msg) {
        String tag = String.format("%s - %s", TAG, sender.toString());
        Log.w(tag, msg);
    }

    public static void error(Class sender, String msg) {
        String tag = String.format("%s - %s", TAG, sender.toString());
        Log.e(tag, msg);
    }

}
