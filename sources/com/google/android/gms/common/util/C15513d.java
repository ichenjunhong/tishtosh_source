package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.p1037d.C15377d;

/* renamed from: com.google.android.gms.common.util.d */
public final class C15513d {
    /* renamed from: a */
    public static boolean m32270a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C15377d.m31951a(context).mo28318a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
