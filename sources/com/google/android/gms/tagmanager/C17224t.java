package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

/* renamed from: com.google.android.gms.tagmanager.t */
final class C17224t {
    /* renamed from: a */
    static int m42188a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException unused) {
            String str = "Invalid version number: ";
            String valueOf = String.valueOf(VERSION.SDK);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return 0;
        }
    }
}
