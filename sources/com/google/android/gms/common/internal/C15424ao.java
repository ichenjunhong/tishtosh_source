package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p1037d.C15377d;

/* renamed from: com.google.android.gms.common.internal.ao */
public final class C15424ao {

    /* renamed from: a */
    public static String f39778a;

    /* renamed from: b */
    public static int f39779b;

    /* renamed from: c */
    private static Object f39780c = new Object();

    /* renamed from: d */
    private static boolean f39781d;

    /* renamed from: a */
    public static void m32017a(Context context) {
        synchronized (f39780c) {
            if (!f39781d) {
                f39781d = true;
                try {
                    Bundle bundle = C15377d.m31951a(context).mo28318a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f39778a = bundle.getString("com.google.app.id");
                        f39779b = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
