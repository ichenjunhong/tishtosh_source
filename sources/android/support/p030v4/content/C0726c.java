package android.support.p030v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.c */
public class C0726c {

    /* renamed from: a */
    private static final Object f2520a = new Object();

    /* renamed from: b */
    private static TypedValue f2521b;

    /* renamed from: c */
    public static boolean m2099c(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* renamed from: a */
    public static File m2092a(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return m2093a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: b */
    public static File m2097b(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return m2093a(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m2093a(java.io.File r2) {
        /*
            java.lang.Class<android.support.v4.content.c> r0 = android.support.p030v4.content.C0726c.class
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r2
        L_0x0017:
            r2 = 0
            monitor-exit(r0)
            return r2
        L_0x001a:
            monitor-exit(r0)
            return r2
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.C0726c.m2093a(java.io.File):java.io.File");
    }

    /* renamed from: a */
    public static int m2090a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static ColorStateList m2096b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static int m2098c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static Drawable m2091a(Context context, int i) {
        int i2;
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f2520a) {
            if (f2521b == null) {
                f2521b = new TypedValue();
            }
            context.getResources().getValue(i, f2521b, true);
            i2 = f2521b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: a */
    public static void m2094a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m2095a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }
}
