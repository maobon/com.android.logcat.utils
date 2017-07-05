package com.xin.bob.logutils;

import android.util.Log;

/**
 * Created by bob on 2017/7/5.
 * Logcat util
 */

public class LogUtils {

    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;

    // Current level
    private static int level = VERBOSE;

    /**
     * VERBOSE
     *
     * @param tag String
     * @param msg String
     */
    public static void v(String tag, String msg) {
        if (level <= VERBOSE) {
            Log.v(tag, msg);
        }
    }

    /**
     * DEBUG
     *
     * @param tag String
     * @param msg String
     */
    public static void d(String tag, String msg) {
        if (level <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    /**
     * INFO
     *
     * @param tag String
     * @param msg String
     */
    public static void i(String tag, String msg) {
        if (level <= INFO) {
            Log.i(tag, msg);
        }
    }

    /**
     * WARN
     *
     * @param tag String
     * @param msg String
     */
    public static void w(String tag, String msg) {
        if (level <= WARN) {
            Log.w(tag, msg);
        }
    }

    /**
     * ERROR
     *
     * @param tag String
     * @param msg String
     */
    public static void e(String tag, String msg) {
        if (level <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
