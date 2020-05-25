package com.p683ss.android.agilelogger.p1136f;

import android.os.Build.VERSION;

/* renamed from: com.ss.android.agilelogger.f.f */
public class C18824f {

    /* renamed from: a */
    static final C18824f f52004a = m45915b();

    /* renamed from: com.ss.android.agilelogger.f.f$a */
    static class C18825a extends C18824f {
        C18825a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo38410a() {
            if (VERSION.SDK_INT < 19) {
                return "\n";
            }
            return System.lineSeparator();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo38410a() {
        return System.lineSeparator();
    }

    /* renamed from: b */
    private static C18824f m45915b() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C18825a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new C18824f();
    }
}
