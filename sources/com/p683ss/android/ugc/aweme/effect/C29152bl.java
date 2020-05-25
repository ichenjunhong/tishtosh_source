package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43765s;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.effect.bl */
final class C29152bl implements C43765s {

    /* renamed from: a */
    C20347c f76401a;

    /* renamed from: b */
    boolean f76402b;

    /* renamed from: c */
    private C0013i<Boolean> f76403c;

    /* renamed from: c */
    public final String[] mo59021c() {
        return this.f76401a.mo43066h();
    }

    /* renamed from: d */
    public final String[] mo59022d() {
        return this.f76401a.mo43070j();
    }

    /* renamed from: e */
    public final String[] mo59023e() {
        return this.f76401a.mo43068i();
    }

    /* renamed from: b */
    public final boolean mo59020b() {
        if (mo59021c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C0013i<Boolean> mo59019a() {
        if (this.f76403c == null) {
            if (this.f76401a.mo43066h() != null) {
                this.f76402b = true;
                return C0013i.m14a(Boolean.TRUE);
            }
            this.f76403c = C0013i.m16a((Callable<TResult>) new C29153bm<TResult>(this));
        }
        return this.f76403c;
    }

    C29152bl(C20347c cVar) {
        this.f76401a = cVar;
    }
}
