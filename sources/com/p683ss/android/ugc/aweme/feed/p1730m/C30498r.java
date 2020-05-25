package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.p683ss.android.ugc.aweme.feed.p1724i.C30406b;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.m.r */
public final class C30498r extends C26876b<FollowingFeedListModel> {

    /* renamed from: a */
    private final List<Aweme> f79712a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
        if (((com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4).isNewDataEmpty() == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c5, code lost:
        if (((com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4).isNewDataEmpty() == false) goto L_0x01c9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44838b() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            if (r0 == 0) goto L_0x01cd
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            if (r0 != 0) goto L_0x000a
            goto L_0x01cd
        L_0x000a:
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            int r0 = r0.mListQueryType
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0151
            switch(r0) {
                case 1: goto L_0x00b2;
                case 2: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x01cc
        L_0x001f:
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            boolean r0 = r0.isDataEmpty()
            if (r0 != 0) goto L_0x00a2
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            java.util.List r0 = r0.getItems()
            if (r0 != 0) goto L_0x0040
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0040:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.common.a r5 = r8.mo54803n()
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r5 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r5
            java.lang.String r6 = "model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.util.List r5 = r5.getItems()
            if (r5 != 0) goto L_0x0067
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0067:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.updateAweme(r4)
            java.lang.String r7 = "ServiceManager.get().get….java).updateAweme(aweme)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r5.set(r1, r6)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r8.f79712a
            r5.add(r1, r4)
            int r1 = r1 + r2
            goto L_0x0047
        L_0x0080:
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r8.f79712a
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.hasMoreHeader
            if (r4 != 0) goto L_0x009f
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.isNewDataEmpty()
            if (r4 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            r0.mo47029c(r1, r2)
        L_0x00a2:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.f79712a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01cc
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            r0.aJ_()
            return
        L_0x00b2:
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            boolean r0 = r0.isDataEmpty()
            if (r0 != 0) goto L_0x0141
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.f79712a
            r0.clear()
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            java.util.List r0 = r0.getItems()
            if (r0 != 0) goto L_0x00d8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00d8:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x00df:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0118
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.common.a r5 = r8.mo54803n()
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r5 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r5
            java.lang.String r6 = "model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.util.List r5 = r5.getItems()
            if (r5 != 0) goto L_0x00ff
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ff:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.updateAweme(r4)
            java.lang.String r7 = "ServiceManager.get().get….java).updateAweme(aweme)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r5.set(r1, r6)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r8.f79712a
            r5.add(r4)
            int r1 = r1 + r2
            goto L_0x00df
        L_0x0118:
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r8.f79712a
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.isHasMore()
            if (r4 == 0) goto L_0x013d
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.isNewDataEmpty()
            if (r4 != 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r2 = 0
        L_0x013e:
            r0.mo47018a(r1, r2)
        L_0x0141:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.f79712a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01cc
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            r0.aJ_()
            return
        L_0x0151:
            com.ss.android.ugc.aweme.common.a r0 = r8.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r0 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r0
            java.util.List r0 = r0.getItems()
            if (r0 != 0) goto L_0x0163
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0163:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x016a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.common.a r5 = r8.mo54803n()
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r5 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r5
            java.lang.String r6 = "model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.util.List r5 = r5.getItems()
            if (r5 != 0) goto L_0x018a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x018a:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r6 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.updateAweme(r4)
            java.lang.String r7 = "ServiceManager.get().get….java).updateAweme(aweme)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r5.set(r1, r6)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r8.f79712a
            r5.add(r4)
            int r1 = r1 + r2
            goto L_0x016a
        L_0x01a3:
            com.ss.android.ugc.aweme.common.e r0 = r8.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r8.f79712a
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.isHasMore()
            if (r4 == 0) goto L_0x01c8
            com.ss.android.ugc.aweme.common.a r4 = r8.f70700f
            java.lang.String r5 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel r4 = (com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel) r4
            boolean r4 = r4.isNewDataEmpty()
            if (r4 != 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            r0.mo47026b(r1, r2)
        L_0x01cc:
            return
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1730m.C30498r.mo44838b():void");
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (this.f70700f != null && this.f70701g != null) {
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            if (((FollowingFeedListModel) aVar).mListQueryType != 2 || !(exc instanceof C30406b)) {
                super.mo44840c_(exc);
            } else {
                ((C26877c) this.f70701g).mo47029c(this.f79712a, false);
            }
        }
    }
}
