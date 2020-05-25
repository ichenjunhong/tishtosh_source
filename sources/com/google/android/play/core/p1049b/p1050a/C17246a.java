package com.google.android.play.core.p1049b.p1050a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.b.a.a */
public final class C17246a {

    /* renamed from: a */
    public static final Map<Integer, String> f48715a = new HashMap();

    /* renamed from: b */
    public static final Map<Integer, String> f48716b = new HashMap();

    static {
        f48715a.put(Integer.valueOf(1), "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        f48715a.put(Integer.valueOf(-2), "An unknown error occurred.");
        f48715a.put(Integer.valueOf(-3), "The API is not available on this device.");
        f48715a.put(Integer.valueOf(-4), "The request that was sent by the app is malformed.");
        f48715a.put(Integer.valueOf(-5), "The install is unavailable to this user or device.");
        f48715a.put(Integer.valueOf(-6), "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f48715a.put(Integer.valueOf(-7), "The install/update has not been (fully) downloaded yet.");
        f48715a.put(Integer.valueOf(-8), "The install is already in progress and there is no UI flow to resume.");
        f48715a.put(Integer.valueOf(-100), "An internal error happened in the Play Store.");
        f48716b.put(Integer.valueOf(1), "NO_ERROR_PARTIALLY_ALLOWED");
        f48716b.put(Integer.valueOf(-2), "ERROR_UNKNOWN");
        f48716b.put(Integer.valueOf(-3), "ERROR_API_NOT_AVAILABLE");
        f48716b.put(Integer.valueOf(-4), "ERROR_INVALID_REQUEST");
        f48716b.put(Integer.valueOf(-5), "ERROR_INSTALL_UNAVAILABLE");
        f48716b.put(Integer.valueOf(-6), "ERROR_INSTALL_NOT_ALLOWED");
        f48716b.put(Integer.valueOf(-7), "ERROR_DOWNLOAD_NOT_PRESENT");
        f48716b.put(Integer.valueOf(-8), "ERROR_INSTALL_IN_PROGRESS");
        f48716b.put(Integer.valueOf(-100), "ERROR_INTERNAL_ERROR");
    }
}
