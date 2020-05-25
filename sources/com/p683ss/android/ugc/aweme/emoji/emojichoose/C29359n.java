package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29381l;
import com.p683ss.android.ugc.aweme.emoji.p1689h.C29409c;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.n */
public final class C29359n {

    /* renamed from: a */
    public C29291g f76906a;

    /* renamed from: b */
    public List<C29291g> f76907b = new ArrayList();

    /* renamed from: c */
    public int f76908c;

    /* renamed from: d */
    private C29381l f76909d;

    /* renamed from: e */
    private C29409c f76910e;

    /* renamed from: f */
    private C29343d f76911f;

    /* renamed from: e */
    private void m69221e() {
    }

    /* renamed from: f */
    private void m69222f() {
    }

    /* renamed from: c */
    public final int mo59350c() {
        return this.f76907b.size();
    }

    /* renamed from: b */
    public final int mo59348b() {
        if (this.f76906a == null) {
            return 0;
        }
        return this.f76906a.mo59219e();
    }

    /* renamed from: d */
    private void m69220d() {
        if (this.f76911f.f76834a) {
            if (this.f76910e == null) {
                this.f76910e = new C29409c(C11010c.m22280a());
            }
            m69219a((C29291g) this.f76910e);
        }
    }

    /* renamed from: a */
    public final void mo59345a() {
        this.f76907b.clear();
        m69220d();
        m69221e();
        m69222f();
        if (this.f76911f.f76837d) {
            LinkedHashMap<C29358c, List<C29366a>> linkedHashMap = C29410a.m69356a().f77027a;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    C29419g gVar = new C29419g();
                    gVar.f77046d = (C29358c) entry.getKey();
                    gVar.f77045c = (List) entry.getValue();
                    m69219a((C29291g) gVar);
                }
            }
        }
        if (this.f76908c >= mo59350c()) {
            mo59346a(0);
        }
    }

    /* renamed from: a */
    public final void mo59347a(List<C29366a> list) {
        if (this.f76909d != null) {
            this.f76909d.f77045c = list;
        }
    }

    public C29359n(C29343d dVar) {
        this.f76911f = dVar;
        m69220d();
        m69221e();
        m69222f();
        mo59346a(0);
    }

    /* renamed from: a */
    private void m69219a(C29291g gVar) {
        if (this.f76907b == null) {
            this.f76907b = new ArrayList();
        }
        this.f76907b.add(gVar);
    }

    /* renamed from: b */
    public final C29291g mo59349b(int i) {
        return (C29291g) this.f76907b.get(i);
    }

    /* renamed from: a */
    public final void mo59346a(int i) {
        if (i >= 0 && i < mo59350c()) {
            this.f76908c = i;
            this.f76906a = (C29291g) this.f76907b.get(this.f76908c);
        }
    }
}
