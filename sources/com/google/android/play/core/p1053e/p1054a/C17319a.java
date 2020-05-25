package com.google.android.play.core.p1053e.p1054a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.e.a.a */
public final class C17319a {

    /* renamed from: a */
    public static final Map<Integer, String> f48788a = new HashMap();

    /* renamed from: b */
    public static final Map<Integer, String> f48789b = new HashMap();

    static {
        f48788a.put(Integer.valueOf(-1), "Too many sessions are running for current app, existing sessions must be resolved first.");
        f48788a.put(Integer.valueOf(-2), "A requested module is not available (to this user/device, for the installed apk).");
        f48788a.put(Integer.valueOf(-3), "Request is otherwise invalid.");
        f48788a.put(Integer.valueOf(-4), "Requested session is not found.");
        f48788a.put(Integer.valueOf(-5), "Split Install API is not available.");
        f48788a.put(Integer.valueOf(-6), "Network error: unable to obtain split details.");
        f48788a.put(Integer.valueOf(-7), "Download not permitted under current device circumstances (e.g. in background).");
        f48788a.put(Integer.valueOf(-8), "Requested session contains modules from an existing active session and also new");
        f48788a.put(Integer.valueOf(-9), "Service handling split install has died.");
        f48788a.put(Integer.valueOf(-10), "Install failed due to insufficient storage.");
        f48788a.put(Integer.valueOf(-11), "Signature verification error when invoking SplitCompat.");
        f48788a.put(Integer.valueOf(-12), "Error in SplitCompat emulation.");
        f48788a.put(Integer.valueOf(-13), "Error in copying files for SplitCompat.");
        f48788a.put(Integer.valueOf(-100), "Unknown error processing split install.");
        f48789b.put(Integer.valueOf(-1), "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        f48789b.put(Integer.valueOf(-2), "MODULE_UNAVAILABLE");
        f48789b.put(Integer.valueOf(-3), "INVALID_REQUEST");
        f48789b.put(Integer.valueOf(-4), "DOWNLOAD_NOT_FOUND");
        f48789b.put(Integer.valueOf(-5), "API_NOT_AVAILABLE");
        f48789b.put(Integer.valueOf(-6), "NETWORK_ERROR");
        f48789b.put(Integer.valueOf(-7), "ACCESS_DENIED");
        f48789b.put(Integer.valueOf(-8), "INCOMPATIBLE_WITH_EXISTING_SESSION");
        f48789b.put(Integer.valueOf(-9), "SERVICE_DIED");
        f48789b.put(Integer.valueOf(-10), "INSUFFICIENT_STORAGE");
        f48789b.put(Integer.valueOf(-11), "SPLITCOMPAT_VERIFICATION_ERROR");
        f48789b.put(Integer.valueOf(-12), "SPLITCOMPAT_EMULATION_ERROR");
        f48789b.put(Integer.valueOf(-13), "SPLITCOMPAT_COPY_ERROR");
    }
}
