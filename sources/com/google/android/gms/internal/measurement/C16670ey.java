package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.support.p030v4.content.C0745i;

/* renamed from: com.google.android.gms.internal.measurement.ey */
public final class C16670ey implements C16667ev {

    /* renamed from: a */
    public static C16670ey f46903a;

    /* renamed from: b */
    final Context f46904b;

    /* renamed from: a */
    static C16670ey m39826a(Context context) {
        C16670ey eyVar;
        synchronized (C16670ey.class) {
            if (f46903a == null) {
                f46903a = C0745i.m2143a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C16670ey(context) : new C16670ey();
            }
            eyVar = f46903a;
        }
        return eyVar;
    }

    private C16670ey(Context context) {
        this.f46904b = context;
        this.f46904b.getContentResolver().registerContentObserver(C16660eo.f46878a, true, new C16673fa(this, null));
    }

    private C16670ey() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String mo31976a(String str) {
        if (this.f46904b == null) {
            return null;
        }
        try {
            return (String) C16668ew.m39824a(new C16671ez(this, str));
        } catch (SecurityException unused) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
    }
}
