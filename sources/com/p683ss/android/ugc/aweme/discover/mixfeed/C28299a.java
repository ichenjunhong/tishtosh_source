package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.discover.model.AwemeList;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a */
public abstract class C28299a<T extends AwemeList> extends C27369c<Aweme, T> {

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a$a */
    public static final class C28300a implements C1683ag<T> {

        /* renamed from: a */
        final /* synthetic */ C28299a f74221a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C28300a(C28299a aVar) {
            this.f74221a = aVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f74221a.mIsLoading = false;
            if (this.f74221a.mNotifyListeners != null) {
                for (C26874f c_ : this.f74221a.mNotifyListeners) {
                    c_.mo44840c_((Exception) th);
                }
            }
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            AwemeList awemeList = (AwemeList) obj;
            C52711k.m112240b(awemeList, "t");
            this.f74221a.mIsLoading = false;
            this.f74221a.handleData(awemeList);
            if (this.f74221a.mNotifyListeners != null) {
                for (C26874f b : this.f74221a.mNotifyListeners) {
                    b.mo44838b();
                }
            }
        }
    }

    /* renamed from: a */
    public abstract C2201v<T> mo56688a();

    public boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public boolean isHasMore() {
        AwemeList awemeList = (AwemeList) this.mData;
        if (awemeList == null || awemeList.getHasMore() != 1) {
            return false;
        }
        return true;
    }

    public List<Aweme> getItems() {
        AwemeList awemeList = (AwemeList) this.mData;
        if (awemeList != null) {
            List<Aweme> awemeList2 = awemeList.getAwemeList();
            if (awemeList2 != null) {
                return awemeList2;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: b */
    private final void mo56760b() {
        C1680ad.m5960a((C2206z<? extends T>) mo56688a()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C28300a<Object>(this));
    }

    public void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        mo56760b();
    }

    public void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        mo56760b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(T r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0007
            java.util.List r0 = r7.getAwemeList()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.lang.Object r1 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r1 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r1
            if (r1 == 0) goto L_0x0014
            java.util.List r1 = r1.getAwemeList()
            if (r1 != 0) goto L_0x001b
        L_0x0014:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
        L_0x001b:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x002b
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = 0
            goto L_0x002c
        L_0x002b:
            r5 = 1
        L_0x002c:
            if (r5 != 0) goto L_0x0092
            int r3 = r6.mListQueryType
            if (r3 == r4) goto L_0x004c
            java.util.Iterator r0 = r0.iterator()
        L_0x0036:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
            int r3 = r1.indexOf(r3)
            if (r3 < 0) goto L_0x0036
            r0.remove()
            goto L_0x0036
        L_0x004c:
            int r0 = r6.mListQueryType
            if (r0 == r4) goto L_0x0076
            r1 = 4
            if (r0 == r1) goto L_0x0054
            goto L_0x0078
        L_0x0054:
            java.lang.Object r0 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r0 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r0
            java.util.List r0 = r0.getAwemeList()
            if (r0 == 0) goto L_0x0061
            r0.addAll(r2)
        L_0x0061:
            java.lang.Object r0 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r0 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r0
            java.lang.Object r1 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r1 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r1
            int r1 = r1.getHasMore()
            int r2 = r7.getHasMore()
            r1 = r1 & r2
            r0.setHasMore(r1)
            goto L_0x0078
        L_0x0076:
            r6.mData = r7
        L_0x0078:
            java.lang.Object r0 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r0 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r0
            long r0 = r0.getCursor()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b0
            java.lang.Object r0 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r0 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r0
            long r1 = r7.getCursor()
            r0.setCursor(r1)
            return
        L_0x0092:
            int r0 = r6.mListQueryType
            if (r0 != r4) goto L_0x00a1
            r6.mData = r7
            java.lang.Object r7 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r7 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r7
            if (r7 == 0) goto L_0x00a1
            r7.setHasMore(r3)
        L_0x00a1:
            int r7 = r6.mListQueryType
            r0 = 2
            if (r7 == r0) goto L_0x00b0
            java.lang.Object r7 = r6.mData
            com.ss.android.ugc.aweme.discover.model.AwemeList r7 = (com.p683ss.android.ugc.aweme.discover.model.AwemeList) r7
            if (r7 == 0) goto L_0x00b0
            r7.setHasMore(r3)
            return
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mixfeed.C28299a.handleData(com.ss.android.ugc.aweme.discover.model.AwemeList):void");
    }
}
