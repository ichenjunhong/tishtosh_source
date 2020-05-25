package com.p683ss.android.ugc.p1235a.p1236a;

import com.p683ss.android.ugc.p1235a.C20314g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.a.c */
public final class C20307c extends C20314g {

    /* renamed from: c */
    private List<C20314g> f55804c = new ArrayList();

    public C20307c() {
        this.f55804c.add(new C20305a());
        this.f55804c.add(new C20306b());
    }

    /* renamed from: a */
    public final C20314g mo42951a(Class cls) {
        if (this.f55810b.get(cls) != null) {
            return this;
        }
        for (C20314g gVar : this.f55804c) {
            if (gVar.mo42951a(cls) != null) {
                return gVar;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C20314g mo42952a(String str) {
        if (this.f55809a.contains(str)) {
            return this;
        }
        for (C20314g gVar : this.f55804c) {
            if (gVar.mo42952a(str) != null) {
                return gVar;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final <T> T mo42949a(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? null : null;
    }

    /* renamed from: a */
    public final <T> List<T> mo42950a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            if (this.f55810b.get(cls) != null) {
                return mo42956a((List) this.f55810b.get(cls), new Object[0]);
            }
            return null;
        } else if (this.f55810b.get(cls) != null) {
            return mo42956a((List) this.f55810b.get(cls), objArr);
        } else {
            return null;
        }
    }
}
