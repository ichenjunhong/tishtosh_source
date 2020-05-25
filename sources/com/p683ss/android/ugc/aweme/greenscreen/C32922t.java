package com.p683ss.android.ugc.aweme.greenscreen;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.t */
public final class C32922t {

    /* renamed from: c */
    public static final List<GreenScreenImage> f85578c = new ArrayList();

    /* renamed from: d */
    public static final C32923a f85579d = new C32923a(null);

    /* renamed from: a */
    public FragmentActivity f85580a;

    /* renamed from: b */
    public C29252f f85581b;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.t$a */
    public static final class C32923a {
        private C32923a() {
        }

        /* renamed from: a */
        public static List<GreenScreenImage> m75826a() {
            return C32922t.f85578c;
        }

        public /* synthetic */ C32923a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.t$b */
    public static final class C32924b implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C32885b f85582a;

        C32924b(C32885b bVar) {
            this.f85582a = bVar;
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            this.f85582a.mo69798a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            if (r4 == null) goto L_0x007b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo8638a(java.lang.Object r13) {
            /*
                r12 = this;
                com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r13 = (com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r13
                r0 = 0
                r1 = 0
                if (r13 == 0) goto L_0x0013
                java.util.List r2 = r13.getUrl_prefix()
                if (r2 == 0) goto L_0x0013
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0014
            L_0x0013:
                r2 = r0
            L_0x0014:
                r3 = r2
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x0022
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r3 = 0
                goto L_0x0023
            L_0x0022:
                r3 = 1
            L_0x0023:
                if (r3 == 0) goto L_0x002b
                com.ss.android.ugc.aweme.greenscreen.b r13 = r12.f85582a
                r13.mo69798a()
                return
            L_0x002b:
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r13.getCategoryEffects()
                if (r13 == 0) goto L_0x0090
                java.util.List r13 = r13.getEffects()
                if (r13 == 0) goto L_0x0090
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.ArrayList r0 = new java.util.ArrayList
                r3 = 10
                int r3 = p2628d.p2629a.C52575l.m112104a(r13, r3)
                r0.<init>(r3)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r13 = r13.iterator()
            L_0x004a:
                boolean r3 = r13.hasNext()
                if (r3 == 0) goto L_0x008e
                java.lang.Object r3 = r13.next()
                com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r3
                com.ss.android.ugc.aweme.greenscreen.GreenScreenImage r11 = new com.ss.android.ugc.aweme.greenscreen.GreenScreenImage
                java.lang.String r4 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r5 = r3.getEffectId()
                com.ss.android.ugc.effectmanager.common.model.UrlModel r4 = r3.getIconUrl()
                java.lang.String r6 = "it.iconUrl"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                java.util.List r4 = r4.getUrlList()
                if (r4 == 0) goto L_0x007b
                java.lang.Object r4 = p2628d.p2629a.C52575l.m112118a(r4, r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto L_0x0079
                goto L_0x007b
            L_0x0079:
                r6 = r4
                goto L_0x007e
            L_0x007b:
                java.lang.String r4 = ""
                goto L_0x0079
            L_0x007e:
                java.lang.String r7 = com.p683ss.android.ugc.aweme.greenscreen.C32889e.m75774a(r3, r2)
                r8 = 0
                r9 = 8
                r10 = 0
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.add(r11)
                goto L_0x004a
            L_0x008e:
                java.util.List r0 = (java.util.List) r0
            L_0x0090:
                if (r0 != 0) goto L_0x0098
                com.ss.android.ugc.aweme.greenscreen.b r13 = r12.f85582a
                r13.mo69798a()
                return
            L_0x0098:
                java.util.List r13 = com.p683ss.android.ugc.aweme.greenscreen.C32922t.C32923a.m75826a()
                r13.clear()
                java.util.List r13 = com.p683ss.android.ugc.aweme.greenscreen.C32922t.C32923a.m75826a()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                r13.addAll(r1)
                com.ss.android.ugc.aweme.greenscreen.b r13 = r12.f85582a
                r13.mo69799a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32922t.C32924b.mo8638a(java.lang.Object):void");
        }
    }

    public C32922t(FragmentActivity fragmentActivity, C29252f fVar) {
        C52711k.m112240b(fragmentActivity, "mActivity");
        C52711k.m112240b(fVar, "mEffectPlatform");
        this.f85580a = fragmentActivity;
        this.f85581b = fVar;
        this.f85581b.mo59122a((C0184k) this.f85580a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m75825a(C32922t tVar, int i, C32885b bVar, int i2, Object obj) {
        C52711k.m112240b(bVar, "galleryFetchListener");
        if (!C32925u.m75829a(tVar.f85580a)) {
            bVar.mo69798a();
        } else if (!f85578c.isEmpty()) {
            bVar.mo69799a(f85578c);
        } else {
            tVar.f85581b.mo59134a("green-screen-library", "all", false, 0, 0, 0, "", new C32924b(bVar));
        }
    }
}
