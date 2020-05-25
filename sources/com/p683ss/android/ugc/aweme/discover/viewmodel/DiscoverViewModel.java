package com.p683ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p683ss.android.ugc.aweme.discover.p1646h.C28164a;
import com.p683ss.android.ugc.aweme.discover.p1646h.p1648b.C28179c;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel */
public final class DiscoverViewModel extends C0209x {

    /* renamed from: g */
    public static final C28939a f75756g = new C28939a(null);

    /* renamed from: a */
    public final C0198r<Boolean> f75757a = new C0198r<>();

    /* renamed from: b */
    public final C0198r<Boolean> f75758b = new C0198r<>();

    /* renamed from: c */
    public final C0198r<Boolean> f75759c = new C0198r<>();

    /* renamed from: d */
    public final C0198r<List<DiscoverItemData>> f75760d = new C0198r<>();

    /* renamed from: e */
    public final C0198r<C23268b<String, Object>> f75761e = new C0198r<>();

    /* renamed from: f */
    public int f75762f;

    /* renamed from: h */
    private C28164a f75763h = new C28164a();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$a */
    public static final class C28939a {
        private C28939a() {
        }

        public /* synthetic */ C28939a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$b */
    public static final class C28940b implements C1674ab<DiscoverListData> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f75764a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C28940b(DiscoverViewModel discoverViewModel) {
            this.f75764a = discoverViewModel;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f75764a.f75759c.setValue(Boolean.valueOf(false));
        }

        public final /* synthetic */ void onNext(Object obj) {
            DiscoverListData discoverListData = (DiscoverListData) obj;
            C52711k.m112240b(discoverListData, "t");
            C52711k.m112240b(discoverListData, "t");
            List arrayList = new ArrayList();
            List list = (List) this.f75764a.f75760d.getValue();
            if (list != null) {
                C52711k.m112236a((Object) list, "it");
                arrayList.addAll(list);
            }
            arrayList.addAll(discoverListData.getItemList());
            this.f75764a.f75760d.setValue(arrayList);
            this.f75764a.f75759c.setValue(Boolean.valueOf(true));
            this.f75764a.f75757a.setValue(Boolean.valueOf(discoverListData.getHasMore()));
            this.f75764a.f75762f = discoverListData.getCursor();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$c */
    static final class C28941c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28941c f75765a = new C28941c();

        C28941c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverListData discoverListData = (DiscoverListData) obj;
            C52711k.m112240b(discoverListData, "it");
            if (!discoverListData.isCache()) {
                ArrayList arrayList = new ArrayList();
                for (DiscoverItemData discoverItemData : discoverListData.getItemList()) {
                    if (discoverItemData.getType() == 5) {
                        CategoryOrAd categoryOrAd = discoverItemData.getCategoryOrAd();
                        if (categoryOrAd != null && categoryOrAd.isCategory()) {
                            arrayList.add(discoverItemData);
                        }
                    }
                }
            }
            return discoverListData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel$d */
    public static final class C28942d implements C1674ab<DiscoverListData> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f75766a;

        /* renamed from: b */
        final /* synthetic */ long f75767b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f75766a.f75758b.setValue(Boolean.valueOf(false));
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.discover.model.DiscoverListData r6 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverListData) r6
                java.lang.String r0 = "t"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f75766a
                android.arch.lifecycle.r<java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverItemData>> r0 = r0.f75760d
                java.util.List r1 = r6.getItemList()
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f75766a
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f75758b
                r1 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r2)
                java.util.List r0 = r6.getItemList()
                java.util.Iterator r0 = r0.iterator()
            L_0x0029:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r2 = r0.next()
                com.ss.android.ugc.aweme.discover.model.DiscoverItemData r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData) r2
                int r3 = r2.getType()
                if (r3 != r1) goto L_0x0029
                com.ss.android.ugc.aweme.arch.b r0 = new com.ss.android.ugc.aweme.arch.b
                r0.<init>()
                com.ss.android.ugc.aweme.discover.model.HotSearchListResponse r1 = r2.getHotSearchResponse()
                java.lang.String r2 = "key_hot_search_list"
                r3 = 0
                if (r1 == 0) goto L_0x0054
                com.ss.android.ugc.aweme.discover.model.HotSearchEntity r4 = r1.getData()
                if (r4 == 0) goto L_0x0054
                java.util.List r4 = r4.getList()
                goto L_0x0055
            L_0x0054:
                r4 = r3
            L_0x0055:
                r0.mo48212a(r2, r4)
                java.lang.String r2 = "key_operated_search_list"
                if (r1 == 0) goto L_0x0061
                java.lang.String r4 = r1.getDefaultSearchKeyword()
                goto L_0x0062
            L_0x0061:
                r4 = r3
            L_0x0062:
                r0.mo48212a(r2, r4)
                java.lang.String r2 = "key_operated_real_search_word"
                if (r1 == 0) goto L_0x006e
                java.lang.String r4 = r1.getRealDefaultSearchKeyword()
                goto L_0x006f
            L_0x006e:
                r4 = r3
            L_0x006f:
                r0.mo48212a(r2, r4)
                java.lang.String r2 = "ad_search_list"
                if (r1 == 0) goto L_0x007a
                java.util.List r3 = r1.getAdSearchList()
            L_0x007a:
                r0.mo48212a(r2, r3)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r1 = r5.f75766a
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.arch.b<java.lang.String, java.lang.Object>> r1 = r1.f75761e
                r1.setValue(r0)
            L_0x0084:
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f75766a
                android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f75757a
                boolean r1 = r6.getHasMore()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r5.f75766a
                int r6 = r6.getCursor()
                r0.f75762f = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel.C28942d.onNext(java.lang.Object):void");
        }

        C28942d(DiscoverViewModel discoverViewModel, long j) {
            this.f75766a = discoverViewModel;
            this.f75767b = j;
        }
    }

    /* renamed from: a */
    private final void m68258a() {
        this.f75763h.mo56577a(new C28179c(this.f75762f), false).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C28940b<Object>(this));
    }

    /* renamed from: a */
    public final void mo58509a(boolean z) {
        mo58510a(z, false);
    }

    /* renamed from: b */
    private final void m68259b(boolean z) {
        this.f75762f = -1;
        this.f75763h.mo56577a(new C28179c(this.f75762f), z).mo6541d((C1711f<? super T, ? extends R>) C28941c.f75765a).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C28942d<Object>(this, System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo58510a(boolean z, boolean z2) {
        if (z) {
            m68259b(z2);
        } else {
            m68258a();
        }
    }
}
