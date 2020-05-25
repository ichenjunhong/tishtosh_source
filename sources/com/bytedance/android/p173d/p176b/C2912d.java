package com.bytedance.android.p173d.p176b;

import android.util.LruCache;
import com.bytedance.android.p173d.p176b.C2915f.C2916a;
import com.bytedance.android.p173d.p176b.p177a.C2906b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.d.b.d */
public final class C2912d implements C2914e, C2916a {

    /* renamed from: a */
    public static boolean f8590a = true;

    /* renamed from: b */
    final boolean f8591b;

    /* renamed from: c */
    private final C2915f f8592c;

    /* renamed from: d */
    private final LruCache<String, Object> f8593d;

    /* renamed from: a */
    public final void mo7554a() {
        this.f8593d.evictAll();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7558b() {
        this.f8592c.mo7564a();
    }

    C2912d() {
        this.f8593d = new LruCache<>(Integer.MAX_VALUE);
        this.f8592c = new C2915f() {
            /* renamed from: a */
            public final int mo7561a(String str, String str2) {
                return 1;
            }

            /* renamed from: a */
            public final int mo7562a(String str, List<String> list) {
                return 1;
            }

            /* renamed from: a */
            public final C2906b mo7563a(String str) {
                return null;
            }

            /* renamed from: a */
            public final void mo7564a() {
            }

            /* renamed from: b */
            public final void mo7565b() {
            }

            /* renamed from: b */
            public final void mo7566b(String str) {
            }
        };
    }

    /* renamed from: d */
    public final void mo7560d(String str) {
        this.f8593d.remove(str);
    }

    /* renamed from: c */
    public final void mo7559c(String str) {
        this.f8592c.mo7566b(str);
        this.f8593d.remove(str);
    }

    /* renamed from: a */
    public final String mo7553a(String str) {
        if (this.f8591b) {
            this.f8592c.mo7565b();
        }
        Object obj = this.f8593d.get(str);
        if (obj != null) {
            return (String) obj;
        }
        C2906b a = m8299a(str, 8);
        if (a == null) {
            return null;
        }
        return a.f8574h;
    }

    /* renamed from: b */
    public final List<String> mo7557b(String str) {
        if (this.f8591b) {
            this.f8592c.mo7565b();
        }
        Object obj = this.f8593d.get(str);
        if (obj != null) {
            return (List) obj;
        }
        C2906b a = m8299a(str, 10);
        if (a == null) {
            return null;
        }
        return a.f8576j;
    }

    /* renamed from: a */
    public final void mo7555a(String str, String str2) {
        this.f8592c.mo7561a(str, str2);
        this.f8593d.put(str, str2);
    }

    /* renamed from: a */
    public final void mo7556a(String str, Collection<String> collection) {
        this.f8592c.mo7562a(str, (List<String>) new ArrayList<String>(collection));
        this.f8593d.put(str, collection);
    }

    /* renamed from: a */
    private C2906b m8299a(String str, int i) {
        C2906b a = this.f8592c.mo7563a(str);
        if (a == null) {
            return null;
        }
        if (a.f8568b == i) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Wrong type with key: ");
        sb.append(str);
        sb.append(", expected: ");
        sb.append(C2906b.m8266a(Integer.valueOf(i)));
        sb.append(", found: ");
        sb.append(C2906b.m8266a(Integer.valueOf(a.f8568b)));
        throw new IllegalStateException(sb.toString());
    }

    C2912d(String str, int i, boolean z) throws IOException {
        this.f8591b = z;
        this.f8593d = new LruCache<>(i);
        this.f8592c = new C2918h(str, z, this);
    }
}
