package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.facebook.C14533n;
import com.facebook.C14560o;
import java.util.Collection;

/* renamed from: com.facebook.internal.ab */
public final class C14283ab {

    /* renamed from: a */
    private static final String f37202a = "com.facebook.internal.ab";

    /* renamed from: a */
    public static void m29303a() {
        if (!C14533n.m29764a()) {
            throw new C14560o("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: b */
    public static String m29309b() {
        String k = C14533n.m29777k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* renamed from: c */
    public static String m29312c() {
        String m = C14533n.m29779m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: a */
    public static void m29304a(Context context) {
        m29310b(context, true);
    }

    /* renamed from: a */
    public static void m29305a(Context context, boolean z) {
        m29306a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: b */
    private static <T> void m29311b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder sb = new StringBuilder("Container '");
            sb.append(str);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m29306a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m29310b(Context context, boolean z) {
        ActivityInfo activityInfo;
        m29306a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (NameNotFoundException unused) {
            }
            if (activityInfo == null && z) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
        }
        activityInfo = null;
        if (activityInfo == null) {
        }
    }

    /* renamed from: c */
    private static <T> void m29313c(Collection<T> collection, String str) {
        m29306a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder sb = new StringBuilder("Container '");
                sb.append(str);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m29307a(String str, String str2) {
        if (C14277aa.m29276a(str)) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> void m29308a(Collection<T> collection, String str) {
        m29313c(collection, str);
        m29311b(collection, str);
    }
}
