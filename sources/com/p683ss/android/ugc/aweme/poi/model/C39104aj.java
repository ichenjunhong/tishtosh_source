package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2078c.C39337a;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.aj */
public final class C39104aj extends C27369c<Aweme, C39126j> implements C27379l {

    /* renamed from: b */
    public String f99741b;

    /* renamed from: c */
    public String f99742c;

    /* renamed from: d */
    public String f99743d;

    /* renamed from: e */
    public String f99744e;

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "p0");
        return true;
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        return getItems();
    }

    public final List<Aweme> getItems() {
        C39126j jVar = (C39126j) this.mData;
        if (jVar != null) {
            return jVar.f99819a;
        }
        return null;
    }

    public final boolean isHasMore() {
        C39126j jVar = (C39126j) this.mData;
        if (jVar == null || 1 != jVar.f99820b) {
            return false;
        }
        return true;
    }

    public final void setItems(List<? extends Aweme> list) {
        if (this.mData == null) {
            this.mData = new C39126j();
        }
        ((C39126j) this.mData).f99819a = list;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        C39065f fVar = objArr[1];
        if (fVar != null) {
            C39065f fVar2 = fVar;
            String str = fVar2.f99618a;
            int i = fVar2.f99627j;
            String str2 = fVar2.f99620c;
            Long l = fVar2.f99630m;
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            PoiFeedApi poiFeedApi = C39140x.f99871h;
            if (!C9376b.m18558a((Collection<T>) getItems())) {
                j2 = (long) ((C39126j) this.mData).f99821c;
            }
            C0013i awemeList = poiFeedApi.getAwemeList(str, i, 20, j2, str2, j);
            C9381g gVar = this.mHandler;
            C52711k.m112236a((Object) gVar, "mHandler");
            awemeList.mo20a((C0011g<TResult, TContinuationResult>) new C39337a<TResult,TContinuationResult>(gVar, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN), C0013i.f25b);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }

    public final void refreshList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        C39065f fVar = objArr[1];
        if (fVar != null) {
            C39065f fVar2 = fVar;
            String str = fVar2.f99618a;
            int i = fVar2.f99627j;
            String str2 = fVar2.f99620c;
            Long l = fVar2.f99630m;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            C0013i awemeList = C39140x.f99871h.getAwemeList(str, i, 20, 0, str2, j);
            C9381g gVar = this.mHandler;
            C52711k.m112236a((Object) gVar, "mHandler");
            awemeList.mo20a((C0011g<TResult, TContinuationResult>) new C39337a<TResult,TContinuationResult>(gVar, TextExtraStruct.TYPE_CUSTOM), C0013i.f25b);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013f A[LOOP:2: B:55:0x013d->B:56:0x013f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.poi.model.j r9 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r9
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0008
            r2 = 1
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            r8.mIsNewDataEmpty = r2
            boolean r2 = r8.mIsNewDataEmpty
            r3 = 2
            if (r2 != 0) goto L_0x0151
            int r2 = r8.mListQueryType
            if (r2 != r3) goto L_0x0023
            boolean r2 = r8.isDataEmpty()
            if (r2 != 0) goto L_0x0023
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r2 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.f99819a
            r2.clear()
        L_0x0023:
            if (r9 == 0) goto L_0x002e
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f99819a
            if (r2 == 0) goto L_0x002e
            int r2 = r2.size()
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 >= r2) goto L_0x0092
            if (r9 != 0) goto L_0x0037
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0037:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r9.f99819a
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r5 = "page_poi_id"
            java.lang.String r6 = r8.f99741b
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_city"
            java.lang.String r6 = r8.f99742c
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_device_samecity"
            java.lang.String r6 = r8.f99743d
            r4.appendMobParam(r5, r6)
            java.lang.String r5 = "page_poi_backend_type"
            java.lang.String r6 = r8.f99744e
            r4.appendMobParam(r5, r6)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r5 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.updateAweme(r4)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r5 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r4 != 0) goto L_0x0075
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0075:
            java.lang.String r7 = r4.getAid()
            r6.append(r7)
            r7 = 10
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r9.f99822d
            r5.setRequestIdAndIndex(r6, r7, r3)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r9.f99819a
            r5.set(r3, r4)
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0092:
            int r2 = r8.mListQueryType
            if (r2 == r1) goto L_0x00c3
            if (r9 != 0) goto L_0x009b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x009b:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r9.f99819a
            java.util.Iterator r1 = r1.iterator()
        L_0x00a1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            boolean r3 = r8.isDataEmpty()
            if (r3 != 0) goto L_0x00a1
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r3 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.f99819a
            int r2 = r3.indexOf(r2)
            if (r2 < 0) goto L_0x00a1
            r1.remove()
            goto L_0x00a1
        L_0x00c3:
            int r1 = r8.mListQueryType
            switch(r1) {
                case 1: goto L_0x010b;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00c9;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x010d
        L_0x00c9:
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.f99819a
            if (r9 != 0) goto L_0x00d4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00d4:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f99819a
            java.lang.String r3 = "data!!.awemeList"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r2 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r2
            int r2 = r2.f99820b
            int r3 = r9.f99820b
            r2 = r2 & r3
            r1.f99820b = r2
            goto L_0x010d
        L_0x00f0:
            java.util.List r1 = r8.getItems()
            if (r1 == 0) goto L_0x010d
            if (r9 != 0) goto L_0x00fb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00fb:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f99819a
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r9.f99819a
            r1.f99819a = r2
            goto L_0x010d
        L_0x010b:
            r8.mData = r9
        L_0x010d:
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            int r1 = r1.f99821c
            long r1 = (long) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0131
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            java.lang.Object r2 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r2 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r2
            int r2 = r2.f99821c
            if (r9 != 0) goto L_0x0129
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0129:
            int r9 = r9.f99821c
            int r9 = java.lang.Math.max(r2, r9)
            r1.f99821c = r9
        L_0x0131:
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r9 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r9
            java.util.List r9 = r9.mo79703a()
            int r9 = r9.size()
        L_0x013d:
            if (r0 >= r9) goto L_0x0166
            java.lang.Object r1 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r1 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.f99819a
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            r1.setAwemePosition(r0)
            int r0 = r0 + 1
            goto L_0x013d
        L_0x0151:
            int r9 = r8.mListQueryType
            if (r9 != r1) goto L_0x0158
            r9 = 0
            r8.mData = r9
        L_0x0158:
            java.lang.Object r9 = r8.mData
            if (r9 == 0) goto L_0x0166
            int r9 = r8.mListQueryType
            if (r9 == r3) goto L_0x0166
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.poi.model.j r9 = (com.p683ss.android.ugc.aweme.poi.model.C39126j) r9
            r9.f99820b = r0
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39104aj.handleData(java.lang.Object):void");
    }
}
