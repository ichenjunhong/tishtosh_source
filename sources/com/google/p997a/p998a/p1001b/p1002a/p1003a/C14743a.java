package com.google.p997a.p998a.p1001b.p1002a.p1003a;

import android.os.Build.VERSION;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1009d.p1010a.C14757a;
import com.google.p997a.p998a.p1009d.p1011b.C14761c;

/* renamed from: com.google.a.a.b.a.a.a */
public final class C14743a {
    /* renamed from: a */
    public static C14769i m30124a() {
        boolean z;
        if (VERSION.SDK_INT >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C14761c();
        }
        return new C14757a();
    }
}
