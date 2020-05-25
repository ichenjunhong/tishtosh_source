package com.p683ss.android.ugc.aweme.discover.alading;

import android.view.View;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28314c;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.f */
public abstract class C28034f implements C28314c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73647a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28034f.class), "param", "getParam()Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;"))};

    /* renamed from: b */
    public final C28037g f73648b;

    /* renamed from: c */
    private final C52668f f73649c = C52732g.m112285a(new C28036b(this));

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.f$a */
    static final class C28035a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C28034f f73650a;

        /* renamed from: b */
        final /* synthetic */ Map f73651b;

        C28035a(C28034f fVar, Map map) {
            this.f73650a = fVar;
            this.f73651b = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
            if (r0 == null) goto L_0x0045;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r10 = this;
                com.ss.android.ugc.aweme.discover.alading.f r0 = r10.f73650a
                java.util.Map r0 = r0.mo56412c()
                java.util.Map r1 = r10.f73651b
                if (r1 == 0) goto L_0x0016
                if (r0 == 0) goto L_0x0016
                java.util.Map r1 = r10.f73651b
                if (r1 != 0) goto L_0x0013
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0013:
                r0.putAll(r1)
            L_0x0016:
                com.ss.android.ugc.aweme.discover.mixfeed.c.d r0 = com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28315d.f74257a
                com.ss.android.ugc.aweme.discover.alading.f r0 = r10.f73650a
                com.ss.android.ugc.aweme.discover.adapter.ad r7 = r0.mo56410b()
                java.util.Map r9 = r10.f73651b
                r8 = -1
                java.lang.String r0 = "param"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.discover.mob.ab r0 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67359d()
                r1 = 3
                java.lang.String r2 = r0.mo56813a(r1)
                com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                java.lang.String r4 = r0.mo60161a(r2)
                java.lang.String r5 = r7.mo56236c()
                com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r0.getCurrentSearchKeyword()
                if (r0 != 0) goto L_0x004f
            L_0x0045:
                com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
                if (r0 == 0) goto L_0x004e
                java.lang.String r0 = r0.getKeyword()
                goto L_0x004f
            L_0x004e:
                r0 = 0
            L_0x004f:
                if (r0 != 0) goto L_0x0053
                java.lang.String r0 = ""
            L_0x0053:
                r3 = r0
                java.lang.String r0 = r7.f73041d
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "general_search"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x0066
                java.lang.String r0 = "general_search"
            L_0x0064:
                r6 = r0
                goto L_0x0069
            L_0x0066:
                java.lang.String r0 = "search_result"
                goto L_0x0064
            L_0x0069:
                com.ss.android.ugc.aweme.discover.mixfeed.c.d$d r0 = new com.ss.android.ugc.aweme.discover.mixfeed.c.d$d
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                p001a.C0013i.m18a(r0, r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.alading.C28034f.C28035a.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.f$b */
    static final class C28036b extends C52712l implements C52670a<C27797ad> {

        /* renamed from: a */
        final /* synthetic */ C28034f f73652a;

        C28036b(C28034f fVar) {
            this.f73652a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f73652a.f73648b.itemView;
            C52711k.m112236a((Object) view, "viewHolder.itemView");
            return C28387a.m67363a(view);
        }
    }

    /* renamed from: b */
    public final C27797ad mo56410b() {
        return (C27797ad) this.f73649c.getValue();
    }

    /* renamed from: c */
    public Map<String, String> mo56412c() {
        return new LinkedHashMap<>();
    }

    /* renamed from: d */
    public Map<String, String> mo56413d() {
        return new LinkedHashMap<>();
    }

    /* renamed from: a */
    public void mo56409a(Map<String, String> map) {
        C0013i.m16a((Callable<TResult>) new C28035a<TResult>(this, map));
    }

    public C28034f(C28037g gVar) {
        C52711k.m112240b(gVar, "viewHolder");
        this.f73648b = gVar;
        this.f73648b.f73654b.setEnable(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56411b(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            java.util.Map r0 = r10.mo56413d()
            if (r11 == 0) goto L_0x000b
            if (r0 == 0) goto L_0x000b
            r0.putAll(r11)
        L_0x000b:
            com.ss.android.ugc.aweme.discover.mixfeed.c.d r0 = com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28315d.f74257a
            com.ss.android.ugc.aweme.discover.adapter.ad r7 = r10.mo56410b()
            r8 = -1
            java.lang.String r0 = "param"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.discover.mob.ab r0 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67359d()
            r1 = 3
            java.lang.String r2 = r0.mo56813a(r1)
            com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r4 = r0.mo60161a(r2)
            java.lang.String r5 = r7.mo56236c()
            com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getCurrentSearchKeyword()
            if (r0 != 0) goto L_0x0040
        L_0x0036:
            com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.getKeyword()
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = ""
        L_0x0044:
            r3 = r0
            java.lang.String r0 = r7.f73041d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "general_search"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "general_search"
        L_0x0055:
            r6 = r0
            goto L_0x005a
        L_0x0057:
            java.lang.String r0 = "search_result"
            goto L_0x0055
        L_0x005a:
            com.ss.android.ugc.aweme.discover.mixfeed.c.d$c r0 = new com.ss.android.ugc.aweme.discover.mixfeed.c.d$c
            r1 = r0
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.util.concurrent.ExecutorService r11 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            java.util.concurrent.Executor r11 = (java.util.concurrent.Executor) r11
            p001a.C0013i.m18a(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.alading.C28034f.mo56411b(java.util.Map):void");
    }
}
