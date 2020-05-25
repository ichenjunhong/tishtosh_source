package com.p683ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28313b;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b */
public abstract class C27849b extends C1352v implements C28313b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73166a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27849b.class), "param", "getParam()Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;"))};

    /* renamed from: b */
    public C27797ad f73167b = new C27797ad(false);

    /* renamed from: c */
    private final C52668f f73168c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b$a */
    static final class C27850a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C27849b f73169a;

        /* renamed from: b */
        final /* synthetic */ Map f73170b;

        C27850a(C27849b bVar, Map map) {
            this.f73169a = bVar;
            this.f73170b = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.discover.adapter.b r0 = r9.f73169a
                com.ss.android.ugc.aweme.discover.adapter.ad r0 = r0.mo56269a()
                if (r0 == 0) goto L_0x0015
                com.ss.android.ugc.aweme.search.model.e r0 = r0.f73039b
                if (r0 == 0) goto L_0x0015
                com.ss.android.ugc.aweme.discover.adapter.b r1 = r9.f73169a
                int r1 = r1.getLayoutPosition()
                r0.setRankInList(r1)
            L_0x0015:
                com.ss.android.ugc.aweme.discover.adapter.b r0 = r9.f73169a
                java.util.Map r8 = r0.mo56210e()
                java.util.Map r0 = r9.f73170b
                if (r0 == 0) goto L_0x002b
                if (r8 == 0) goto L_0x002b
                java.util.Map r0 = r9.f73170b
                if (r0 != 0) goto L_0x0028
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0028:
                r8.putAll(r0)
            L_0x002b:
                com.ss.android.ugc.aweme.discover.adapter.b r0 = r9.f73169a
                com.ss.android.ugc.aweme.discover.adapter.ad r7 = r0.mo56269a()
                java.lang.String r0 = "param"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.discover.mob.ab r0 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67359d()
                r1 = 3
                java.lang.String r2 = r0.mo56813a(r1)
                com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                java.lang.String r4 = r0.mo60161a(r2)
                java.lang.String r5 = r7.mo56236c()
                com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
                if (r0 == 0) goto L_0x0055
                java.lang.String r0 = r0.getCurrentSearchKeyword()
                if (r0 != 0) goto L_0x005f
            L_0x0055:
                com.ss.android.ugc.aweme.search.model.e r0 = r7.f73039b
                if (r0 == 0) goto L_0x005e
                java.lang.String r0 = r0.getKeyword()
                goto L_0x005f
            L_0x005e:
                r0 = 0
            L_0x005f:
                if (r0 != 0) goto L_0x0063
                java.lang.String r0 = ""
            L_0x0063:
                r3 = r0
                java.lang.String r0 = r7.f73041d
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "general_search"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x0076
                java.lang.String r0 = "general_search"
            L_0x0074:
                r6 = r0
                goto L_0x0079
            L_0x0076:
                java.lang.String r0 = "search_result"
                goto L_0x0074
            L_0x0079:
                com.ss.android.ugc.aweme.discover.mixfeed.c.d$b r0 = new com.ss.android.ugc.aweme.discover.mixfeed.c.d$b
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                p001a.C0013i.m18a(r0, r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27849b.C27850a.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b$b */
    static final class C27851b extends C52712l implements C52670a<C27797ad> {

        /* renamed from: a */
        final /* synthetic */ View f73171a;

        C27851b(View view) {
            this.f73171a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C28387a.m67363a(this.f73171a);
        }
    }

    /* renamed from: a */
    public final C27797ad mo56269a() {
        return (C27797ad) this.f73168c.getValue();
    }

    /* renamed from: d */
    public View mo56209d() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        return view;
    }

    /* renamed from: e */
    public Map<String, String> mo56210e() {
        return new LinkedHashMap<>();
    }

    /* renamed from: f */
    public Map<String, String> mo56211f() {
        return new LinkedHashMap<>();
    }

    /* renamed from: b */
    public final Context mo56271b() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        return context;
    }

    /* renamed from: c */
    public final FragmentActivity mo56273c() {
        Activity d = C23729p.m58270d(mo56209d());
        if (d != null) {
            return (FragmentActivity) d;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public C27849b(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73168c = C52732g.m112285a(new C27851b(view));
    }

    /* renamed from: a */
    public final C27849b mo56270a(C27797ad adVar) {
        if (adVar != null) {
            C52711k.m112240b(adVar, "<set-?>");
            this.f73167b = adVar;
        }
        return this;
    }

    /* renamed from: a */
    public void mo56208a(Map<String, String> map) {
        C0013i.m16a((Callable<TResult>) new C27850a<TResult>(this, map));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r11 == null) goto L_0x0044;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56272b(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.discover.adapter.ad r0 = r10.mo56269a()
            if (r0 == 0) goto L_0x0011
            com.ss.android.ugc.aweme.search.model.e r0 = r0.f73039b
            if (r0 == 0) goto L_0x0011
            int r1 = r10.getLayoutPosition()
            r0.setRankInList(r1)
        L_0x0011:
            java.util.Map r9 = r10.mo56210e()
            if (r11 == 0) goto L_0x001c
            if (r9 == 0) goto L_0x001c
            r9.putAll(r11)
        L_0x001c:
            com.ss.android.ugc.aweme.discover.adapter.ad r8 = r10.mo56269a()
            java.lang.String r11 = "param"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r11)
            com.ss.android.ugc.aweme.discover.mob.ab r11 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67359d()
            r0 = 3
            java.lang.String r3 = r11.mo56813a(r0)
            com.ss.android.ugc.aweme.feed.aa r11 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r5 = r11.mo60161a(r3)
            java.lang.String r6 = r8.mo56236c()
            com.ss.android.ugc.aweme.search.model.e r11 = r8.f73039b
            if (r11 == 0) goto L_0x0044
            java.lang.String r11 = r11.getCurrentSearchKeyword()
            if (r11 != 0) goto L_0x004e
        L_0x0044:
            com.ss.android.ugc.aweme.search.model.e r11 = r8.f73039b
            if (r11 == 0) goto L_0x004d
            java.lang.String r11 = r11.getKeyword()
            goto L_0x004e
        L_0x004d:
            r11 = 0
        L_0x004e:
            if (r11 != 0) goto L_0x0052
            java.lang.String r11 = ""
        L_0x0052:
            r4 = r11
            java.lang.String r11 = r8.f73041d
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r0 = "general_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r11 = android.text.TextUtils.equals(r11, r0)
            if (r11 == 0) goto L_0x0065
            java.lang.String r11 = "general_search"
        L_0x0063:
            r7 = r11
            goto L_0x0068
        L_0x0065:
            java.lang.String r11 = "search_result"
            goto L_0x0063
        L_0x0068:
            com.ss.android.ugc.aweme.discover.mixfeed.c.d$a r11 = new com.ss.android.ugc.aweme.discover.mixfeed.c.d$a
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11
            java.util.concurrent.ExecutorService r0 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            p001a.C0013i.m18a(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27849b.mo56272b(java.util.Map):void");
    }
}
