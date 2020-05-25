package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16740d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gq */
public class C16721gq {

    /* renamed from: a */
    static final C16721gq f46994a = new C16721gq(true);

    /* renamed from: c */
    private static final Class<?> f46995c = m40218c();

    /* renamed from: d */
    private static volatile C16721gq f46996d;

    /* renamed from: b */
    final Map<C16722a, C16740d<?, ?>> f46997b;

    /* renamed from: com.google.android.gms.internal.measurement.gq$a */
    static final class C16722a {

        /* renamed from: a */
        private final Object f46998a;

        /* renamed from: b */
        private final int f46999b;

        C16722a(Object obj, int i) {
            this.f46998a = obj;
            this.f46999b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f46998a) * 65535) + this.f46999b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16722a)) {
                return false;
            }
            C16722a aVar = (C16722a) obj;
            if (this.f46998a == aVar.f46998a && this.f46999b == aVar.f46999b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m40218c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C16721gq m40216a() {
        return C16720gp.m40212a();
    }

    /* renamed from: b */
    public static C16721gq m40217b() {
        C16721gq gqVar = f46996d;
        if (gqVar == null) {
            synchronized (C16721gq.class) {
                gqVar = f46996d;
                if (gqVar == null) {
                    gqVar = C16720gp.m40214b();
                    f46996d = gqVar;
                }
            }
        }
        return gqVar;
    }

    C16721gq() {
        this.f46997b = new HashMap();
    }

    private C16721gq(boolean z) {
        this.f46997b = Collections.emptyMap();
    }
}
