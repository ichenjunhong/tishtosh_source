package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class C15449i {

    /* renamed from: a */
    private static final Object f39858a = new Object();

    /* renamed from: b */
    private static C15449i f39859b;

    /* renamed from: com.google.android.gms.common.internal.i$a */
    protected static final class C15450a {

        /* renamed from: a */
        public final String f39860a;

        /* renamed from: b */
        public final ComponentName f39861b = null;

        /* renamed from: c */
        public final int f39862c;

        /* renamed from: d */
        private final String f39863d;

        public C15450a(String str, String str2, int i) {
            this.f39863d = C15464q.m32125a(str);
            this.f39860a = C15464q.m32125a(str2);
            this.f39862c = i;
        }

        public final String toString() {
            return this.f39863d == null ? this.f39861b.flattenToString() : this.f39863d;
        }

        /* renamed from: a */
        public final Intent mo28440a(Context context) {
            if (this.f39863d != null) {
                return new Intent(this.f39863d).setPackage(this.f39860a);
            }
            return new Intent().setComponent(this.f39861b);
        }

        public final int hashCode() {
            return C15462p.m32118a(this.f39863d, this.f39860a, this.f39861b, Integer.valueOf(this.f39862c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15450a)) {
                return false;
            }
            C15450a aVar = (C15450a) obj;
            return C15462p.m32120a(this.f39863d, aVar.f39863d) && C15462p.m32120a(this.f39860a, aVar.f39860a) && C15462p.m32120a(this.f39861b, aVar.f39861b) && this.f39862c == aVar.f39862c;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo28378a(C15450a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo28379b(C15450a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public static C15449i m32101a(Context context) {
        synchronized (f39858a) {
            if (f39859b == null) {
                f39859b = new C15415af(context.getApplicationContext());
            }
        }
        return f39859b;
    }

    /* renamed from: a */
    public final void mo28439a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo28379b(new C15450a(str, str2, i), serviceConnection, str3);
    }
}
