package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15674d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class axm {

    /* renamed from: a */
    static final axm f41520a = new axm(true);

    /* renamed from: b */
    private static final Class<?> f41521b = m34648c();

    /* renamed from: c */
    private static volatile axm f41522c;

    /* renamed from: d */
    private final Map<C15670a, C15674d<?, ?>> f41523d;

    /* renamed from: com.google.android.gms.internal.ads.axm$a */
    static final class C15670a {

        /* renamed from: a */
        private final Object f41524a;

        /* renamed from: b */
        private final int f41525b;

        C15670a(Object obj, int i) {
            this.f41524a = obj;
            this.f41525b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f41524a) * 65535) + this.f41525b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C15670a)) {
                return false;
            }
            C15670a aVar = (C15670a) obj;
            if (this.f41524a == aVar.f41524a && this.f41525b == aVar.f41525b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m34648c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static axm m34646a() {
        return axl.m34642a();
    }

    /* renamed from: b */
    public static axm m34647b() {
        axm axm = f41522c;
        if (axm == null) {
            synchronized (axm.class) {
                axm = f41522c;
                if (axm == null) {
                    axm = axl.m34644b();
                    f41522c = axm;
                }
            }
        }
        return axm;
    }

    /* renamed from: a */
    public final <ContainingType extends azj> C15674d<ContainingType, ?> mo29784a(ContainingType containingtype, int i) {
        return (C15674d) this.f41523d.get(new C15670a(containingtype, i));
    }

    axm() {
        this.f41523d = new HashMap();
    }

    private axm(boolean z) {
        this.f41523d = Collections.emptyMap();
    }
}
