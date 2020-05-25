package com.p683ss.android.ugc.aweme.p1807im.sdk.common;

import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c */
public final class C33994c {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$a */
    static final class C33995a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C33995a f87909a = new C33995a();

        C33995a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$b */
    static final class C33996b extends C52712l implements C52682m<List<T>, Boolean, C52860x> {

        /* renamed from: a */
        public static final C33996b f87910a = new C33996b();

        C33996b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Boolean) obj2).booleanValue();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$c */
    static final class C33997c extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        public static final C33997c f87911a = new C33997c();

        C33997c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$d */
    public static final class C33998d implements C33993b<T> {

        /* renamed from: a */
        final /* synthetic */ C52670a f87912a;

        /* renamed from: b */
        final /* synthetic */ C52682m f87913b;

        /* renamed from: c */
        final /* synthetic */ C52671b f87914c;

        /* renamed from: a */
        public final void mo71932a() {
            this.f87912a.invoke();
        }

        /* renamed from: a */
        public final void mo71933a(Throwable th) {
            this.f87914c.invoke(th);
        }

        /* renamed from: a */
        public final void mo71934a(List<T> list, boolean z) {
            this.f87913b.invoke(list, Boolean.valueOf(z));
        }

        C33998d(C52670a aVar, C52682m mVar, C52671b bVar) {
            this.f87912a = aVar;
            this.f87913b = mVar;
            this.f87914c = bVar;
        }
    }

    /* renamed from: a */
    public static final <T> C33993b<T> m77707a(C52670a<C52860x> aVar, C52682m<? super List<T>, ? super Boolean, C52860x> mVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(aVar, "onLoading");
        C52711k.m112240b(mVar, "onSuccess");
        C52711k.m112240b(bVar, "onError");
        return new C33998d<>(aVar, mVar, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C33993b m77708a(C52670a aVar, C52682m mVar, C52671b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C33995a.f87909a;
        }
        if ((i & 2) != 0) {
            mVar = C33996b.f87910a;
        }
        if ((i & 4) != 0) {
            bVar = C33997c.f87911a;
        }
        return m77707a(aVar, mVar, bVar);
    }
}
