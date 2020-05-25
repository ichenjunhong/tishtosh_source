package com.p683ss.android.ugc.aweme.discover.p1646h.p1648b;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.jedi.p725a.p733f.C11597d;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApiNew.C28049a;
import com.p683ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.p683ss.android.ugc.aweme.discover.api.HotSearchApi.C28050a;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.CategoryList;
import com.p683ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p683ss.android.ugc.aweme.discover.speed.C28432a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.h.b.b */
public final class C28171b extends C11597d<C28179c, DiscoverListData> {

    /* renamed from: g */
    public static final C28172a f73965g = new C28172a(null);

    /* renamed from: a */
    public final DiscoverApiNew f73966a = C28049a.m66819a();

    /* renamed from: b */
    public volatile int f73967b;

    /* renamed from: f */
    public volatile boolean f73968f = true;

    /* renamed from: h */
    private final HotSearchApi f73969h = C28050a.m66820a();

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$a */
    public static final class C28172a {
        private C28172a() {
        }

        public /* synthetic */ C28172a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$b */
    static final class C28173b<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C28171b f73970a;

        C28173b(C28171b bVar) {
            this.f73970a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            CategoryList categoryList = (CategoryList) obj;
            C52711k.m112240b(categoryList, "it");
            this.f73970a.f73967b = categoryList.cursor;
            this.f73970a.f73968f = categoryList.isHasMore();
            return C2201v.m6613b((Iterable<? extends T>) categoryList.items);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$c */
    static final class C28174c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28174c f73971a = new C28174c();

        C28174c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Category category = (Category) obj;
            C52711k.m112240b(category, "it");
            List items = category.getItems();
            if (!C9376b.m18558a((Collection<T>) items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    items.set(i, C23324d.m57378a().updateAweme((Aweme) items.get(i)));
                }
            }
            if (category.isPicAd()) {
                return new CategoryOrAd(category.getAdData());
            }
            return new CategoryOrAd(category);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$d */
    static final class C28175d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28175d f73972a = new C28175d();

        C28175d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CategoryOrAd categoryOrAd = (CategoryOrAd) obj;
            C52711k.m112240b(categoryOrAd, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(5);
            discoverItemData.setCategoryOrAd(categoryOrAd);
            return discoverItemData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$e */
    static final class C28176e<T, R> implements C1711f<Throwable, C2206z<? extends CategoryList>> {

        /* renamed from: a */
        final /* synthetic */ C28171b f73973a;

        /* renamed from: b */
        final /* synthetic */ int f73974b;

        /* renamed from: c */
        final /* synthetic */ int f73975c;

        /* renamed from: d */
        final /* synthetic */ int f73976d;

        /* renamed from: e */
        final /* synthetic */ String f73977e;

        C28176e(C28171b bVar, int i, int i2, int i3, String str) {
            this.f73973a = bVar;
            this.f73974b = i;
            this.f73975c = i2;
            this.f73976d = i3;
            this.f73977e = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "t");
            if (C28432a.f74711a) {
                return C2201v.m6606a(th);
            }
            C28432a.f74711a = true;
            return this.f73973a.f73966a.getCategoryV2List(this.f73974b, this.f73975c, Integer.valueOf(0), Integer.valueOf(this.f73976d), this.f73977e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$f */
    static final class C28177f<T> implements C1715j<DiscoverItemData> {

        /* renamed from: a */
        public static final C28177f f73978a = new C28177f();

        C28177f() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            DiscoverItemData discoverItemData = (DiscoverItemData) obj;
            C52711k.m112240b(discoverItemData, "it");
            if (discoverItemData.getType() != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.b$g */
    static final class C28178g<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C28171b f73979a;

        /* renamed from: b */
        final /* synthetic */ boolean f73980b;

        C28178g(C28171b bVar, boolean z) {
            this.f73979a = bVar;
            this.f73980b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            if (!this.f73980b || !list.isEmpty()) {
                DiscoverListData discoverListData = new DiscoverListData(list, this.f73979a.f73967b, this.f73979a.f73968f, false, 8, null);
                return discoverListData;
            }
            throw new Exception("api all went wrong");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        boolean z;
        C2201v vVar;
        C28179c cVar = (C28179c) obj;
        C52711k.m112240b(cVar, "param");
        List<C2201v> arrayList = new ArrayList<>();
        List arrayList2 = new ArrayList();
        if (cVar.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f73967b = 0;
            this.f73968f = true;
            C2201v d = C28049a.m66819a().getBannerList(Integer.valueOf(1), Integer.valueOf(C23794bh.m58381G().mo47256q()), null, C23794bh.m58381G().mo47257r()).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) C28169a.f73963a).mo6541d((C1711f<? super T, ? extends R>) C28170b.f73964a);
            C52711k.m112236a((Object) d, "DiscoverApiNew.INSTANCE.…turn@map banner\n        }");
            arrayList.add(d);
            arrayList.add(m67062b(0, 10));
        } else {
            arrayList.add(m67062b(cVar.getCursor(), 10));
        }
        for (C2201v vVar2 : arrayList) {
            if (z) {
                DiscoverItemData discoverItemData = new DiscoverItemData(0);
                C1745b.m6050a(discoverItemData, "item is null");
                vVar = vVar2.mo6547f(C1723a.m6039b(discoverItemData)).mo6529b(C2168a.m6521b());
                C52711k.m112236a((Object) vVar, "item.onErrorReturnItem(D…scribeOn(Schedulers.io())");
            } else {
                vVar = vVar2.mo6529b(C2168a.m6521b());
                C52711k.m112236a((Object) vVar, "item.subscribeOn(Schedulers.io())");
            }
            arrayList2.add(vVar);
        }
        C2201v b = C2201v.m6604a((Iterable<? extends C2206z<? extends T>>) arrayList2).mo6522a((C1715j<? super T>) C28177f.f73978a).mo6552k().mo6157b((C1711f<? super T, ? extends R>) new C28178g<Object,Object>(this, z)).mo6161c().mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Observable.concatEager(r…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: b */
    private final C2201v<DiscoverItemData> m67062b(int i, int i2) {
        C2201v<DiscoverItemData> d = m67061a(i, 10).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C28173b<Object,Object>(this)).mo6541d((C1711f<? super T, ? extends R>) C28174c.f73971a).mo6541d((C1711f<? super T, ? extends R>) C28175d.f73972a);
        C52711k.m112236a((Object) d, "getCommonCategoryList(cu…ap item\n                }");
        return d;
    }

    /* renamed from: a */
    private final C2201v<CategoryList> m67061a(int i, int i2) {
        boolean z;
        int q = C23794bh.m58381G().mo47256q();
        String r = C23794bh.m58381G().mo47257r();
        DiscoverApiNew discoverApiNew = this.f73966a;
        if (!C28432a.m67476a() || C28432a.f74711a) {
            z = false;
        } else {
            z = true;
        }
        C2201v<CategoryList> categoryV2List = discoverApiNew.getCategoryV2List(i, i2, Integer.valueOf(C52711k.m112239a((Object) Boolean.valueOf(z), (Object) Boolean.valueOf(true)) ? 1 : 0), Integer.valueOf(q), r);
        if (!C28432a.m67476a() || i != 0) {
            return categoryV2List;
        }
        C28176e eVar = new C28176e(this, i, i2, q, r);
        C2201v<CategoryList> e = categoryV2List.mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) eVar);
        C52711k.m112236a((Object) e, "this.onErrorResumeNext {…      }\n                }");
        return e;
    }
}
