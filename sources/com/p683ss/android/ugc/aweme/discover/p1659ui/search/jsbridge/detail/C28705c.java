package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.discover.model.SearchMix;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28127h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28702a.C28703a;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29767c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.c */
public final class C28705c extends C28127h<Aweme, SearchMix> {

    /* renamed from: b */
    public boolean f75337b;

    /* renamed from: c */
    public final ArrayList<Aweme> f75338c;

    /* renamed from: d */
    public final C28702a f75339d;

    /* renamed from: e */
    private int f75340e;

    /* renamed from: l */
    private C28702a f75341l;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.c$a */
    public static final class C28706a implements C28703a {

        /* renamed from: a */
        final /* synthetic */ C28705c f75342a;

        /* renamed from: a */
        public final void mo58349a() {
            this.f75342a.mIsLoading = false;
            if (this.f75342a.mNotifyListeners != null) {
                for (C26874f c_ : this.f75342a.mNotifyListeners) {
                    c_.mo44840c_(new Exception());
                }
            }
        }

        C28706a(C28705c cVar) {
            this.f75342a = cVar;
        }

        /* renamed from: a */
        public final void mo58350a(List<? extends Aweme> list, boolean z) {
            C52711k.m112240b(list, "data");
            this.f75342a.f75337b = z;
            List<Aweme> c = C52575l.m112132c((Iterable<? extends T>) list);
            this.f75342a.mo58355c(list);
            for (Aweme aweme : c) {
                if (!this.f75342a.f75338c.contains(aweme)) {
                    this.f75342a.f75338c.add(0, aweme);
                }
            }
            if (this.f75342a.mNotifyListeners != null) {
                for (C26874f b : this.f75342a.mNotifyListeners) {
                    b.mo44838b();
                }
            }
            this.f75342a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.c$b */
    public static final class C28707b implements C28703a {

        /* renamed from: a */
        final /* synthetic */ C28705c f75343a;

        /* renamed from: a */
        public final void mo58349a() {
            this.f75343a.mIsLoading = false;
            if (this.f75343a.mNotifyListeners != null) {
                for (C26874f c_ : this.f75343a.mNotifyListeners) {
                    c_.mo44840c_(new Exception());
                }
            }
        }

        C28707b(C28705c cVar) {
            this.f75343a = cVar;
        }

        /* renamed from: a */
        public final void mo58350a(List<? extends Aweme> list, boolean z) {
            C52711k.m112240b(list, "data");
            this.f75343a.f75337b = z;
            this.f75343a.mo58355c(list);
            for (Aweme aweme : list) {
                if (!this.f75343a.f75338c.contains(aweme)) {
                    this.f75343a.f75338c.add(aweme);
                }
            }
            if (this.f75343a.mNotifyListeners != null) {
                for (C26874f b : this.f75343a.mNotifyListeners) {
                    b.mo44838b();
                }
            }
            this.f75343a.mIsLoading = false;
        }
    }

    public final int aK_() {
        return 3;
    }

    public final boolean isHasMore() {
        return this.f75337b;
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
    }

    /* renamed from: c */
    public final void mo56536c() {
        this.f75338c.clear();
    }

    public final List<Aweme> getItems() {
        return this.f75338c;
    }

    public C28705c(C28702a aVar) {
        C52711k.m112240b(aVar, "dataFetcher");
        this.f75339d = aVar;
        this.mIsLoading = false;
        this.f75340e = 0;
        this.f75341l = this.f75339d;
        this.f75338c = new ArrayList<>();
    }

    public final void loadLatestList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        this.f75341l.f75334b = new C28706a(this);
        C28667c.m67924a("loadLatest");
        C29767c.m69866a("loadLatest");
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        this.f75341l.f75333a = new C28707b(this);
        C28667c.m67924a("loadMore");
        C29767c.m69866a("loadMore");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r6 == null) goto L_0x0045;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58355c(java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x00b3
            java.lang.Object r3 = r9.get(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r8.f75338c
            if (r4 != 0) goto L_0x0014
            r4 = 0
            goto L_0x001a
        L_0x0014:
            java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r8.f75338c
            int r4 = r4.size()
        L_0x001a:
            boolean r5 = r3 instanceof com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b
            if (r5 == 0) goto L_0x00af
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r5     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00af }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x00af }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x004a
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r5     // Catch:{ Exception -> 0x00af }
            java.lang.Object r6 = r8.getData()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.discover.model.SearchMix r6 = (com.p683ss.android.ugc.aweme.discover.model.SearchMix) r6     // Catch:{ Exception -> 0x00af }
            java.lang.String r7 = "data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r6 = r6.logPb     // Catch:{ Exception -> 0x00af }
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = r6.getImprId()     // Catch:{ Exception -> 0x00af }
            if (r6 != 0) goto L_0x0047
        L_0x0045:
            java.lang.String r6 = ""
        L_0x0047:
            r5.setRequestIdFromRN(r6)     // Catch:{ Exception -> 0x00af }
        L_0x004a:
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r5     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00af }
            r3.setRequestId(r5)     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r5     // Catch:{ Exception -> 0x00af }
            r5.updateAweme(r3)     // Catch:{ Exception -> 0x00af }
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r5     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00af }
            r8.f73863j = r5     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r5     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r6.<init>()     // Catch:{ Exception -> 0x00af }
            r7 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r7 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r7     // Catch:{ Exception -> 0x00af }
            java.lang.String r7 = r7.getAid()     // Catch:{ Exception -> 0x00af }
            r6.append(r7)     // Catch:{ Exception -> 0x00af }
            r7 = 9
            r6.append(r7)     // Catch:{ Exception -> 0x00af }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00af }
            r7 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r7 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r7     // Catch:{ Exception -> 0x00af }
            java.lang.String r7 = r7.getRequestIdFromRN()     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + r2
            r5.setRequestIdAndIndex(r6, r7, r4)     // Catch:{ Exception -> 0x00af }
            int r4 = r8.aK_()     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r8.f73863j     // Catch:{ Exception -> 0x00af }
            if (r5 != 0) goto L_0x009a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x00af }
        L_0x009a:
            com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67349a(r4, r5)     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()     // Catch:{ Exception -> 0x00af }
            r5 = r3
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r5     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = r5.getRequestIdFromRN()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.b r3 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28704b) r3     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.f75336b     // Catch:{ Exception -> 0x00af }
            r4.mo60162a(r5, r3)     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28705c.mo58355c(java.util.List):void");
    }
}
