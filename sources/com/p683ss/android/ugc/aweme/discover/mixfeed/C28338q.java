package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.deviceregister.p1158c.C19031b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.discover.mob.C28395am;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28117a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.aweme.search.p2124d.C41413b;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.q */
public final class C28338q implements C28117a {

    /* renamed from: B */
    public static final C28340b f74390B = new C28340b(null);

    /* renamed from: A */
    public boolean f74391A;

    /* renamed from: a */
    public C41440e f74392a;

    /* renamed from: b */
    public String f74393b;

    /* renamed from: c */
    public int f74394c;

    /* renamed from: d */
    public int f74395d;

    /* renamed from: e */
    public int f74396e;

    /* renamed from: f */
    public double f74397f;

    /* renamed from: g */
    public double f74398g;

    /* renamed from: h */
    public String f74399h;

    /* renamed from: i */
    public int f74400i;

    /* renamed from: j */
    public C41412a f74401j;

    /* renamed from: k */
    public String f74402k;

    /* renamed from: l */
    public int f74403l;

    /* renamed from: m */
    public String f74404m = C28343s.m67286a();

    /* renamed from: n */
    public int f74405n = C28343s.f74423c;

    /* renamed from: o */
    public int f74406o = C28343s.f74424d;

    /* renamed from: p */
    public int f74407p = C28343s.f74425e;

    /* renamed from: q */
    public int f74408q;

    /* renamed from: r */
    public int f74409r;

    /* renamed from: s */
    public int f74410s;

    /* renamed from: t */
    public int f74411t = C28343s.m67287b();

    /* renamed from: u */
    public int f74412u = C28343s.f74426f;

    /* renamed from: v */
    public int f74413v = C28343s.f74427g;

    /* renamed from: w */
    public String f74414w;

    /* renamed from: x */
    public String f74415x;

    /* renamed from: y */
    public String f74416y;

    /* renamed from: z */
    public boolean f74417z;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.q$a */
    public static final class C28339a {

        /* renamed from: a */
        private final C28338q f74418a = new C28338q(null);

        /* renamed from: b */
        public final C28338q mo56755b() {
            if (this.f74418a.f74401j == null) {
                mo56748a((C41412a) null);
            }
            if (this.f74418a.f74405n != 0) {
                this.f74418a.f74406o = 1;
            }
            return this.f74418a;
        }

        /* renamed from: a */
        public final void mo56751a() {
            this.f74418a.f74417z = true;
            m67268d(C30228f.m70974a()).m67269e(C30228f.m70977b()).m67270f("aweme_city_general").mo56757c("aweme_city_general");
        }

        /* renamed from: d */
        private C28339a m67268d(String str) {
            if (str == null) {
                return this;
            }
            this.f74418a.f74414w = str;
            return this;
        }

        /* renamed from: e */
        private C28339a m67269e(String str) {
            if (str == null) {
                return this;
            }
            this.f74418a.f74415x = str;
            return this;
        }

        /* renamed from: a */
        public final C28339a mo56746a(double d) {
            this.f74418a.f74397f = d;
            return this;
        }

        /* renamed from: b */
        public final C28339a mo56752b(double d) {
            this.f74418a.f74398g = d;
            return this;
        }

        /* renamed from: c */
        public final C28339a mo56756c(int i) {
            this.f74418a.f74396e = i;
            return this;
        }

        /* renamed from: f */
        private C28339a m67270f(String str) {
            C52711k.m112240b(str, "channel");
            this.f74418a.f74416y = str;
            return this;
        }

        /* renamed from: a */
        public final C28339a mo56747a(int i) {
            this.f74418a.f74394c = i;
            return this;
        }

        /* renamed from: b */
        public final C28339a mo56753b(int i) {
            this.f74418a.f74395d = i;
            return this;
        }

        /* renamed from: c */
        public final C28339a mo56757c(String str) {
            C52711k.m112240b(str, "searchSource");
            this.f74418a.f74402k = str;
            return this;
        }

        /* renamed from: d */
        public final C28339a mo56758d(int i) {
            this.f74418a.f74400i = i;
            return this;
        }

        /* renamed from: e */
        public final C28339a mo56759e(int i) {
            this.f74418a.f74403l = i;
            return this;
        }

        /* renamed from: a */
        public final C28339a mo56749a(C41440e eVar) {
            this.f74418a.f74392a = eVar;
            return this;
        }

        /* renamed from: b */
        public final C28339a mo56754b(String str) {
            C52711k.m112240b(str, "searchId");
            this.f74418a.f74399h = str;
            return this;
        }

        /* renamed from: a */
        public final C28339a mo56748a(C41412a aVar) {
            C41412a b = C41413b.m91227b(aVar);
            this.f74418a.f74401j = b;
            this.f74418a.f74408q = C41413b.m91226a(b);
            this.f74418a.f74409r = b.getSortType();
            this.f74418a.f74410s = b.getPublishTime();
            return this;
        }

        /* renamed from: a */
        public final C28339a mo56750a(String str) {
            C52711k.m112240b(str, "keyword");
            this.f74418a.f74393b = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.q$b */
    public static final class C28340b {
        private C28340b() {
        }

        public /* synthetic */ C28340b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.q$c */
    static final class C28341c<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ C28338q f74419a;

        /* renamed from: b */
        final /* synthetic */ C0013i f74420b;

        C28341c(C28338q qVar, C0013i iVar) {
            this.f74419a = qVar;
            this.f74420b = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.discover.mixfeed.q r0 = r5.f74419a
                com.ss.android.ugc.aweme.search.model.e r0 = r0.f74392a
                com.ss.android.ugc.aweme.discover.f.c r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.m66923a(r0)
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56516b()
                int r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75134b
                com.p683ss.android.ugc.aweme.discover.mob.C28395am.m67395b(r1)
                a.i r1 = r5.f74420b
                boolean r1 = r1.mo33d()
                r2 = 0
                if (r1 == 0) goto L_0x002d
                a.i r1 = r5.f74420b
                java.lang.Exception r1 = r1.mo35f()
                r3 = 1
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56517b(r3)
                java.lang.String r1 = r1.getMessage()
                r0.mo56518b(r1)
                goto L_0x006c
            L_0x002d:
                a.i r1 = r5.f74420b
                boolean r1 = r1.mo31c()
                if (r1 == 0) goto L_0x003e
                r1 = 2
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56517b(r1)
                r0.mo56520c()
                goto L_0x006c
            L_0x003e:
                a.i r1 = r5.f74420b
                java.lang.Object r1 = r1.mo34e()
                com.ss.android.ugc.aweme.discover.mixfeed.m r1 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m) r1
                r3 = 0
                if (r1 == 0) goto L_0x0052
                java.util.List<com.ss.android.ugc.aweme.discover.mixfeed.l> r4 = r1.f74376d
                if (r4 == 0) goto L_0x0052
                int r4 = r4.size()
                goto L_0x0053
            L_0x0052:
                r4 = 0
            L_0x0053:
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56519c(r4)
                if (r1 == 0) goto L_0x005e
                java.lang.String r4 = r1.getRequestId()
                goto L_0x005f
            L_0x005e:
                r4 = r2
            L_0x005f:
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56515a(r4)
                com.ss.android.ugc.aweme.app.api.h r1 = (com.p683ss.android.ugc.aweme.app.api.C22990h) r1
                com.ss.android.ugc.aweme.discover.f.c r0 = r0.mo56514a(r1)
                r0.mo56517b(r3)
            L_0x006c:
                com.ss.android.ugc.aweme.discover.mixfeed.q r0 = r5.f74419a
                boolean r0 = r0.f74391A
                if (r0 == 0) goto L_0x0073
                return r2
            L_0x0073:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q.C28341c.then(a.i):java.lang.Object");
        }
    }

    private C28338q() {
        this.f74393b = "";
        this.f74399h = "";
        this.f74402k = "";
    }

    /* renamed from: a */
    public final void mo56524a() {
        this.f74391A = true;
        C28116e.m66923a(this.f74392a).mo56516b().mo56517b(2).mo56520c();
    }

    static {
        Context a = C11010c.m22280a();
        if (C52711k.m112239a((Object) "", (Object) C28343s.m67286a())) {
            C28343s.f74421a = C19031b.m46308b(a);
        }
        if (C28343s.m67287b() == 0) {
            C28343s.f74422b = C23728o.m58244b((double) C9432q.m18670a(a));
        }
    }

    /* renamed from: b */
    public final C0013i<C28334m> mo56742b() {
        if (this.f74394c == 0) {
            C28116e.m66923a(this.f74392a).mo56512a();
            C28395am.m67391a(C28608ca.f75134b);
            if (!this.f74417z) {
                SearchMixFeedCollectionTypeAdapterFactory.f104995a = true;
            }
        } else {
            SearchMixFeedCollectionTypeAdapterFactory.f104995a = false;
        }
        C0013i a = C28342r.m67285a(this);
        C0013i<C28334m> b = a.mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C28341c<TResult,C0013i<TContinuationResult>>(this, a));
        C52711k.m112236a((Object) b, "task.continueWithTask {\n…             it\n        }");
        return b;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f74393b.hashCode() * 31) + this.f74394c) * 31) + this.f74395d) * 31) + this.f74396e;
        long doubleToLongBits = Double.doubleToLongBits(this.f74397f);
        int i2 = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f74398g);
        int hashCode2 = ((((((((((i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + this.f74399h.hashCode()) * 31) + this.f74400i) * 31) + this.f74402k.hashCode()) * 31) + this.f74403l) * 31;
        if (this.f74404m != null) {
            String str = this.f74404m;
            if (str == null) {
                C52711k.m112234a();
            }
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((hashCode2 + i) * 31) + this.f74405n) * 31) + this.f74406o) * 31) + this.f74407p) * 31) + this.f74408q) * 31) + this.f74409r) * 31) + this.f74410s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchMixFeedRequest(keyword='");
        sb.append(this.f74393b);
        sb.append("', cursor=");
        sb.append(this.f74394c);
        sb.append(", count=");
        sb.append(this.f74395d);
        sb.append(", pullRefresh=");
        sb.append(this.f74396e);
        sb.append(", latitude=");
        sb.append(this.f74397f);
        sb.append(", longitude=");
        sb.append(this.f74398g);
        sb.append(", searchId='");
        sb.append(this.f74399h);
        sb.append("', correctType=");
        sb.append(this.f74400i);
        sb.append(", searchSource='");
        sb.append(this.f74402k);
        sb.append("', hotSearchSource=");
        sb.append(this.f74403l);
        sb.append(", macAddress=");
        sb.append(this.f74404m);
        sb.append(", multiMode=");
        sb.append(this.f74405n);
        sb.append(", disableSynthesis=");
        sb.append(this.f74406o);
        sb.append(", filterCards=");
        sb.append(this.f74407p);
        sb.append(", isFilterSearch=");
        sb.append(this.f74408q);
        sb.append(", sortType=");
        sb.append(this.f74409r);
        sb.append(", publishTime=");
        sb.append(this.f74410s);
        sb.append(", clientWidth=");
        sb.append(this.f74411t);
        sb.append(", dynamicType=");
        sb.append(this.f74412u);
        sb.append(", epidemicCardType=");
        sb.append(this.f74413v);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C28338q(C52707g gVar) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C52711k.m112239a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        C28338q qVar = (C28338q) obj;
        if (this.f74394c != qVar.f74394c || this.f74395d != qVar.f74395d || this.f74396e != qVar.f74396e || Double.compare(qVar.f74397f, this.f74397f) != 0 || Double.compare(qVar.f74398g, this.f74398g) != 0 || this.f74400i != qVar.f74400i || this.f74403l != qVar.f74403l || this.f74405n != qVar.f74405n || this.f74406o != qVar.f74406o || this.f74407p != qVar.f74407p || this.f74408q != qVar.f74408q || this.f74409r != qVar.f74409r || this.f74410s != qVar.f74410s || (!C52711k.m112239a((Object) this.f74393b, (Object) qVar.f74393b)) || (!C52711k.m112239a((Object) this.f74399h, (Object) qVar.f74399h)) || (!C52711k.m112239a((Object) this.f74402k, (Object) qVar.f74402k))) {
            return false;
        }
        if (this.f74404m != null) {
            return C52711k.m112239a((Object) this.f74404m, (Object) qVar.f74404m);
        }
        if (qVar.f74404m == null) {
            return true;
        }
        return false;
    }
}
