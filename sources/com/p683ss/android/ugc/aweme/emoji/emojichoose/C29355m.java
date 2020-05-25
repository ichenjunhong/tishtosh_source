package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
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

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.m */
public final class C29355m {

    /* renamed from: a */
    public C29291g f76886a;

    /* renamed from: b */
    public List<C29291g> f76887b = new ArrayList();

    /* renamed from: c */
    public int f76888c;

    /* renamed from: d */
    private C29381l f76889d;

    /* renamed from: e */
    private C29409c f76890e;

    /* renamed from: f */
    private C29343d f76891f;

    /* renamed from: h */
    private void m69204h() {
    }

    /* renamed from: i */
    private void m69205i() {
    }

    /* renamed from: f */
    public final int mo59311f() {
        return this.f76887b.size();
    }

    /* renamed from: c */
    public final int mo59305c() {
        if (this.f76886a == null) {
            return 0;
        }
        return this.f76886a.mo59220f();
    }

    /* renamed from: d */
    public final int mo59307d() {
        if (this.f76886a == null) {
            return 0;
        }
        return this.f76886a.mo59219e();
    }

    /* renamed from: g */
    private void m69203g() {
        if (this.f76891f.f76834a) {
            if (this.f76890e == null) {
                this.f76890e = new C29409c(C11010c.m22280a());
            }
            m69202a((C29291g) this.f76890e);
        }
    }

    /* renamed from: e */
    public final int mo59309e() {
        int i = 0;
        for (C29291g f : this.f76887b) {
            i += f.mo59220f();
        }
        return i;
    }

    /* renamed from: b */
    public final int mo59303b() {
        int i = 0;
        for (C29291g gVar : this.f76887b) {
            if (gVar == this.f76886a) {
                return this.f76886a.mo59219e() + i;
            }
            i += gVar.mo59220f();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo59300a() {
        this.f76887b.clear();
        m69203g();
        m69204h();
        m69205i();
        if (this.f76891f.f76837d) {
            LinkedHashMap<C29358c, List<C29366a>> linkedHashMap = C29410a.m69356a().f77027a;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    C29419g gVar = new C29419g();
                    gVar.f77046d = (C29358c) entry.getKey();
                    gVar.f77045c = (List) entry.getValue();
                    m69202a((C29291g) gVar);
                }
            }
        }
        if (this.f76888c >= mo59311f()) {
            mo59301a(0);
        }
    }

    /* renamed from: a */
    public final void mo59302a(List<C29366a> list) {
        if (this.f76889d != null) {
            this.f76889d.f77045c = list;
        }
    }

    /* renamed from: f */
    public final C29291g mo59312f(int i) {
        return (C29291g) this.f76887b.get(i);
    }

    public C29355m(C29343d dVar) {
        this.f76891f = dVar;
        m69203g();
        m69204h();
        m69205i();
        mo59301a(0);
    }

    /* renamed from: a */
    private void m69202a(C29291g gVar) {
        if (this.f76887b == null) {
            this.f76887b = new ArrayList();
        }
        this.f76887b.add(gVar);
    }

    /* renamed from: c */
    public final C29291g mo59306c(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (C29291g gVar : this.f76887b) {
            i2 += gVar.mo59220f();
            if (i < i2) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo59301a(int i) {
        if (i >= 0 && i < mo59311f()) {
            this.f76888c = i;
            this.f76886a = (C29291g) this.f76887b.get(this.f76888c);
        }
    }

    /* renamed from: d */
    public final List<C29285a> mo59308d(int i) {
        if (i < 0) {
            return new ArrayList();
        }
        int i2 = 0;
        for (C29291g gVar : this.f76887b) {
            if (i < gVar.mo59220f() + i2) {
                return gVar.mo59216b(i - i2);
            }
            i2 += gVar.mo59220f();
        }
        return new ArrayList();
    }

    /* renamed from: e */
    public final int mo59310e(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = 0;
        for (C29291g gVar : this.f76887b) {
            if (i < gVar.mo59220f() + i2) {
                return i - i2;
            }
            i2 += gVar.mo59220f();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo59304b(int i) {
        if (i >= 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f76887b.size(); i3++) {
                C29291g gVar = (C29291g) this.f76887b.get(i3);
                if (i < gVar.mo59220f() + i2) {
                    this.f76888c = i3;
                    this.f76886a = gVar;
                    this.f76886a.mo59214a(i - i2);
                    return;
                }
                i2 += gVar.mo59220f();
            }
        }
    }
}
