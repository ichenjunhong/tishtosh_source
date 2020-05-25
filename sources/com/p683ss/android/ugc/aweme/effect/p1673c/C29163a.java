package com.p683ss.android.ugc.aweme.effect.p1673c;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a */
public final class C29163a {

    /* renamed from: a */
    public long f76421a = -1;

    /* renamed from: b */
    public long f76422b = -1;

    /* renamed from: c */
    public Map<String, Long> f76423c = new LinkedHashMap();

    /* renamed from: d */
    public Map<String, Long> f76424d = new LinkedHashMap();

    /* renamed from: e */
    public boolean f76425e;

    /* renamed from: f */
    private int f76426f;

    /* renamed from: a */
    public final long mo59036a() {
        if (this.f76421a < 0) {
            return 0;
        }
        return this.f76421a;
    }

    /* renamed from: a */
    public final void mo59037a(int i) {
        if (this.f76426f != i) {
            this.f76426f = i;
            this.f76421a = 0;
            this.f76422b = 0;
            this.f76423c.clear();
            this.f76424d.clear();
            mo59038a(false);
        }
    }

    /* renamed from: a */
    public final void mo59038a(boolean z) {
        this.f76425e = z;
        if (!z) {
            this.f76423c.clear();
            this.f76424d.clear();
        }
    }
}
