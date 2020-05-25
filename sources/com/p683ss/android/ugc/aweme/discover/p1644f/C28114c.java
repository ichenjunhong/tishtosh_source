package com.p683ss.android.ugc.aweme.discover.p1644f;

import com.p683ss.android.ugc.aweme.app.api.C22990h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.f.c */
public final class C28114c {

    /* renamed from: a */
    public long f73820a;

    /* renamed from: b */
    public long f73821b;

    /* renamed from: c */
    public long f73822c;

    /* renamed from: d */
    public C22990h f73823d;

    /* renamed from: e */
    public int f73824e;

    /* renamed from: f */
    public int f73825f;

    /* renamed from: g */
    public int f73826g;

    /* renamed from: h */
    public int f73827h;

    /* renamed from: i */
    public int f73828i;

    /* renamed from: j */
    public int f73829j;

    /* renamed from: k */
    public String f73830k;

    /* renamed from: l */
    public int f73831l = -1;

    /* renamed from: m */
    public String f73832m;

    /* renamed from: n */
    public int f73833n;

    /* renamed from: o */
    public int f73834o = -1;

    /* renamed from: p */
    public int f73835p = -1;

    /* renamed from: q */
    public int f73836q;

    /* renamed from: r */
    public final C41440e f73837r;

    /* renamed from: a */
    public final C28114c mo56512a() {
        C28114c cVar = this;
        if (!C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a()) && cVar.f73821b == 0) {
            cVar.f73821b = System.currentTimeMillis();
        }
        return cVar;
    }

    /* renamed from: b */
    public final C28114c mo56516b() {
        long j;
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        if (cVar.f73821b != 0) {
            j = cVar.f73821b;
        } else {
            j = cVar.f73820a;
        }
        cVar.f73822c = System.currentTimeMillis();
        cVar.f73829j = (int) (cVar.f73822c - j);
        return cVar;
    }

    /* renamed from: c */
    public final void mo56520c() {
        if (!C52711k.m112239a((Object) this, (Object) C28115d.m66921a())) {
            C28116e.f73841c.mo56523b(this.f73837r);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResultShowEvent(tabType=");
        sb.append(this.f73824e);
        sb.append(", trigger=");
        sb.append(this.f73825f);
        sb.append(", displayType=");
        sb.append(this.f73826g);
        sb.append(", itemCount=");
        sb.append(this.f73827h);
        sb.append(", cost=");
        sb.append(this.f73828i);
        sb.append(", netCost=");
        sb.append(this.f73829j);
        sb.append(", netLogId=");
        sb.append(this.f73830k);
        sb.append(", status=");
        sb.append(this.f73831l);
        sb.append(", errorMsg=");
        sb.append(this.f73832m);
        sb.append(')');
        return sb.toString();
    }

    public C28114c(C41440e eVar) {
        C52711k.m112240b(eVar, "searchParam");
        this.f73837r = eVar;
    }

    /* renamed from: e */
    private C28114c m66910e(int i) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73824e = i;
        return cVar;
    }

    /* renamed from: b */
    public final C28114c mo56517b(int i) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73831l = i;
        if (i == 0) {
            cVar.f73832m = null;
            cVar.f73833n = 0;
        } else {
            cVar.f73833n = 1;
        }
        return cVar;
    }

    /* renamed from: c */
    public final C28114c mo56519c(int i) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73827h = i;
        return cVar;
    }

    /* renamed from: d */
    public final C28114c mo56521d(int i) {
        C28114c cVar = this;
        if (cVar.f73834o == -1) {
            cVar.f73834o = i;
        } else if (cVar.f73835p == -1) {
            cVar.f73835p = i;
        }
        return cVar;
    }

    /* renamed from: a */
    public final C28114c mo56514a(C22990h hVar) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73823d = hVar;
        return cVar;
    }

    /* renamed from: a */
    public final C28114c mo56513a(int i) {
        if (C52711k.m112239a((Object) this, (Object) C28115d.m66921a())) {
            return this;
        }
        if (i == C28608ca.f75136d) {
            m66910e(2);
        } else if (i == C28608ca.f75135c) {
            m66910e(1);
        } else if (i == C28608ca.f75137e) {
            m66910e(3);
        } else if (i == C28608ca.f75138f) {
            m66910e(4);
        } else if (i == C28608ca.f75139g) {
            m66910e(5);
        } else if (i == C28608ca.f75134b) {
            m66910e(0);
        } else if (i == C28608ca.f75140h) {
            m66910e(6);
        } else if (i == C28608ca.f75141i) {
            m66910e(7);
        }
        this.f73837r.setIndex(i);
        return this;
    }

    /* renamed from: b */
    public final C28114c mo56518b(String str) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73832m = str;
        return cVar;
    }

    /* renamed from: a */
    public final C28114c mo56515a(String str) {
        C28114c cVar = this;
        if (C52711k.m112239a((Object) cVar, (Object) C28115d.m66921a())) {
            return cVar;
        }
        cVar.f73830k = str;
        return cVar;
    }
}
