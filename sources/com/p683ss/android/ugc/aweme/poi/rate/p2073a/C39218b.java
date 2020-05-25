package com.p683ss.android.ugc.aweme.poi.rate.p2073a;

import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.rate.api.C39223a;
import com.p683ss.android.ugc.aweme.poi.rate.api.C39226c;
import com.p683ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi.C39222a;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b */
public final class C39218b extends C26875a<Aweme, C39223a> {

    /* renamed from: a */
    public long f100141a;

    /* renamed from: b */
    public int f100142b = 1;

    /* renamed from: c */
    public final String f100143c;

    /* renamed from: d */
    public final int f100144d;

    /* renamed from: e */
    public final String f100145e;

    /* renamed from: f */
    public final int f100146f;

    /* renamed from: g */
    private final List<C39226c> f100147g = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b$a */
    static final class C39219a<T> implements C1710e<C39223a> {

        /* renamed from: a */
        final /* synthetic */ C39218b f100148a;

        C39219a(C39218b bVar) {
            this.f100148a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C39223a aVar = (C39223a) obj;
            this.f100148a.f100141a = aVar.f100156c;
            this.f100148a.f100142b = aVar.f100159f;
            this.f100148a.mHandler.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C39219a f100149a;

                {
                    this.f100149a = r1;
                }

                public final void run() {
                    this.f100149a.f100148a.mIsLoading = false;
                    this.f100149a.f100148a.handleData(aVar);
                    List<C26874f> list = this.f100149a.f100148a.mNotifyListeners;
                    if (list != null) {
                        for (C26874f fVar : list) {
                            if (fVar != null) {
                                fVar.mo44838b();
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.a.b$b */
    static final class C39221b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C39218b f100151a;

        C39221b(C39218b bVar) {
            this.f100151a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            this.f100151a.mIsLoading = false;
            List<C26874f> list = this.f100151a.mNotifyListeners;
            if (list != null) {
                for (C26874f fVar : list) {
                    if (fVar != null) {
                        if (!(th2 instanceof Exception)) {
                            th = null;
                        } else {
                            th = th2;
                        }
                        fVar.mo44840c_((Exception) th);
                    }
                }
            }
        }
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((C39223a) this.mData).f100157d != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m87160a() {
        C39222a.m87162a().requestPoiSpuRateAweme(this.f100143c, this.f100141a, this.f100144d, this.f100145e, this.f100142b, this.f100146f).mo6505a((C1710e<? super T>) new C39219a<Object>(this), (C1710e<? super Throwable>) new C39221b<Object>(this));
    }

    public final List<Aweme> getItems() {
        List<Aweme> arrayList = new ArrayList<>();
        for (C39226c cVar : this.f100147g) {
            Aweme aweme = cVar.f100168e;
            if (aweme != null) {
                C23324d.m57378a().updateAweme(aweme.clone());
                aweme.setRateScore(cVar.f100165b);
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m87160a();
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        this.f100141a = 0;
        m87160a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p683ss.android.ugc.aweme.poi.rate.api.C39223a r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0011
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r2 = r4.f100154a
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            r3.mIsNewDataEmpty = r2
            boolean r2 = r3.mIsNewDataEmpty
            if (r2 != 0) goto L_0x0036
            int r0 = r3.mListQueryType
            if (r0 != r1) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r0 = r3.f100147g
            r0.clear()
        L_0x0021:
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r0 = r3.f100147g
            if (r4 == 0) goto L_0x002a
            java.util.List<com.ss.android.ugc.aweme.poi.rate.api.c> r1 = r4.f100154a
            if (r1 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            java.util.List r1 = p2628d.p2629a.C52575l.m112097a()
        L_0x002e:
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r3.mData = r4
            return
        L_0x0036:
            java.lang.Object r4 = r3.mData
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r3.mData
            com.ss.android.ugc.aweme.poi.rate.api.a r4 = (com.p683ss.android.ugc.aweme.poi.rate.api.C39223a) r4
            r4.f100157d = r0
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39218b.handleData(com.ss.android.ugc.aweme.poi.rate.api.a):void");
    }

    public C39218b(String str, int i, String str2, int i2) {
        C52711k.m112240b(str, "spuId");
        C52711k.m112240b(str2, "poiId");
        this.f100143c = str;
        this.f100144d = i;
        this.f100145e = str2;
        this.f100146f = i2;
        C39223a aVar = new C39223a(null, null, 0, 1, 0, 0, 55, null);
        this.mData = aVar;
    }
}
