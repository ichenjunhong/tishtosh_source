package com.p683ss.android.ugc.aweme.discover.p1645g;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.api.SearchApi;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoiList;

/* renamed from: com.ss.android.ugc.aweme.discover.g.u */
public final class C28149u extends C28127h<SearchPoi, SearchPoiList> {

    /* renamed from: b */
    public String f73923b;

    /* renamed from: c */
    public String f73924c;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.u$a */
    class C28151a extends C28118b {

        /* renamed from: b */
        final String f73925b;

        /* renamed from: c */
        final int f73926c;

        /* renamed from: d */
        final int f73927d;

        /* renamed from: e */
        final double f73928e;

        /* renamed from: f */
        final double f73929f;

        /* renamed from: g */
        final String f73930g;

        /* renamed from: h */
        final int f73931h;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo56525b() throws Exception {
            return SearchApi.m66828a(this.f73925b, (long) this.f73926c, this.f73927d, C28149u.this.f73862i, this.f73928e, this.f73929f, this.f73930g, C28149u.this.mo56537d(), this.f73931h);
        }

        private C28151a(String str, int i, int i2, double d, double d2, String str2, int i3) {
            this.f73925b = str;
            this.f73926c = i;
            this.f73927d = i2;
            this.f73928e = d;
            this.f73929f = d2;
            this.f73930g = str2;
            this.f73931h = i3;
        }
    }

    public final int aK_() {
        return 5;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchPoiList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchPoiList) this.mData).cursor;
        }
        m67034a(str, i, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), this.f73864k, objArr[5].intValue());
    }

    public final void refreshList(Object... objArr) {
        m67034a((String) objArr[1], 0, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), "", objArr[5].intValue());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r8.mData != null) goto L_0x00b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p683ss.android.ugc.aweme.discover.model.SearchPoiList r9) {
        /*
            r8 = this;
            super.handleData(r9)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r0 = r9.poiList
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0012
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            r8.mIsNewDataEmpty = r3
            boolean r3 = r8.mIsNewDataEmpty
            r4 = 4
            if (r3 != 0) goto L_0x007d
            int r3 = r8.mListQueryType
            if (r3 != r2) goto L_0x002a
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r9.logPb
            java.lang.String r3 = r3.mo60160a(r5)
            r8.f73924c = r3
        L_0x002a:
            java.util.Iterator r3 = r0.iterator()
        L_0x002e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.discover.model.SearchPoi r5 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoi) r5
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r6 = r5.poi
            java.lang.String r7 = r8.f73863j
            r6.setRequestId(r7)
            java.lang.String r6 = r8.f73924c
            r5.logPb = r6
            goto L_0x002e
        L_0x0046:
            int r3 = r8.mListQueryType
            if (r3 == r2) goto L_0x006c
            if (r3 == r4) goto L_0x004d
            return
        L_0x004d:
            r8.mo56535b(r0)
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r3 = r9.hasMore
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r3 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            r0.hasMore = r1
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r9 = r9.cursor
            r0.cursor = r9
            return
        L_0x006c:
            r8.mData = r9
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r9 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.poiList = r1
            r8.mo56532a_(r0)
            return
        L_0x007d:
            int r0 = r8.mListQueryType
            if (r0 == r2) goto L_0x00ae
            if (r0 == r4) goto L_0x0084
            goto L_0x00bd
        L_0x0084:
            java.lang.Object r0 = r8.mData
            if (r0 == 0) goto L_0x00bd
            if (r9 == 0) goto L_0x00b7
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r3 = r9.hasMore
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r3 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x009b
            r1 = 1
        L_0x009b:
            r0.hasMore = r1
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r9 = r9.cursor
            r0.cursor = r9
            return
        L_0x00ae:
            r8.mData = r9
            r8.mo56536c()
            java.lang.Object r9 = r8.mData
            if (r9 == 0) goto L_0x00bd
        L_0x00b7:
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r9 = (com.p683ss.android.ugc.aweme.discover.model.SearchPoiList) r9
            r9.hasMore = r1
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1645g.C28149u.handleData(com.ss.android.ugc.aweme.discover.model.SearchPoiList):void");
    }

    /* renamed from: a */
    private void m67034a(String str, int i, int i2, double d, double d2, String str2, int i3) {
        String str3 = str;
        this.f73923b = str3;
        C28151a aVar = new C28151a(str3, i, 10, d, d2, str2, i3);
        aVar.f73843a = this.f73860g;
        this.f73861h = aVar;
        C23566n.m57766a().mo48750a(this.mHandler, aVar, 0);
    }
}
