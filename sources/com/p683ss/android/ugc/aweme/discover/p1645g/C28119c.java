package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.DiscoverV4DataObserver;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.c */
public final class C28119c extends C26876b<DiscoveryV4DetailListModel> implements DiscoverV4DataObserver {

    /* renamed from: a */
    public final String f73845a;

    /* renamed from: b */
    private final List<Aweme> f73846b = new ArrayList();

    public final void onNeedUpdateData(String str) {
        C52711k.m112240b(str, "tabName");
    }

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().unRegister(this);
    }

    /* renamed from: f */
    private final DiscoverV4PlayListResponse m66931f() {
        List<DiscoverPlayListStructV4> list;
        DiscoverV4PlayListResponse data = DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getData(this.f73845a);
        if (data != null) {
            list = data.cells;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (DiscoverPlayListStructV4 discoverPlayListStructV4 : data.cells) {
            List<Aweme> list2 = discoverPlayListStructV4.awemes;
            if (list2 != null) {
                Aweme aweme = (Aweme) C52575l.m112137e(list2);
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
        }
        C26832a aVar = this.f70700f;
        C52711k.m112236a((Object) aVar, "mModel");
        DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) aVar;
        boolean z = true;
        if (data.hasMore != 1) {
            z = false;
        }
        discoveryV4DetailListModel.setData(new DiscoveryV4CellDetailResponse(arrayList, z, data.logPb));
        return data;
    }

    /* renamed from: e */
    private final void m66930e() {
        C26832a aVar = this.f70700f;
        C52711k.m112236a((Object) aVar, "mModel");
        if (((DiscoveryV4DetailListModel) aVar).getItems() != null) {
            int i = 0;
            C26832a aVar2 = this.f70700f;
            C52711k.m112236a((Object) aVar2, "mModel");
            List<Aweme> items = ((DiscoveryV4DetailListModel) aVar2).getItems();
            if (items == null) {
                C52711k.m112234a();
            }
            for (Aweme aweme : items) {
                C26832a aVar3 = this.f70700f;
                C52711k.m112236a((Object) aVar3, "mModel");
                aweme.setRequestId(((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar3).getData()).logPb.getImprId());
                DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) mo54803n();
                C52711k.m112236a((Object) discoveryV4DetailListModel, "model");
                List items2 = discoveryV4DetailListModel.getItems();
                if (items2 == null) {
                    C52711k.m112234a();
                }
                Aweme updateAweme = C23324d.m57378a().updateAweme(aweme);
                C52711k.m112236a((Object) updateAweme, "ServiceManager.get().get….java).updateAweme(aweme)");
                items2.set(i, updateAweme);
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(9001);
                a.setRequestIdAndIndex(sb.toString(), aweme.getRequestId(), i);
                this.f73846b.add(aweme);
                i++;
            }
            C29981aa a2 = C29981aa.m70153a();
            C26832a aVar4 = this.f70700f;
            C52711k.m112236a((Object) aVar4, "mModel");
            String imprId = ((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar4).getData()).logPb.getImprId();
            C26832a aVar5 = this.f70700f;
            C52711k.m112236a((Object) aVar5, "mModel");
            a2.mo60162a(imprId, ((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar5).getData()).logPb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (((com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3).isNewDataEmpty() == false) goto L_0x0045;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44838b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
            if (r0 != 0) goto L_0x000a
            goto L_0x0087
        L_0x000a:
            com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r0 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r0
            int r0 = r0.mListQueryType
            r1 = 1
            if (r0 == r1) goto L_0x0049
            r2 = 4
            if (r0 == r2) goto L_0x001c
            goto L_0x0048
        L_0x001c:
            r5.m66930e()
            com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r5.f73846b
            com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3
            boolean r3 = r3.isHasMore()
            if (r3 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3
            boolean r3 = r3.isNewDataEmpty()
            if (r3 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            r0.mo47026b(r2, r1)
        L_0x0048:
            return
        L_0x0049:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.f73846b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0056
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.f73846b
            r0.clear()
        L_0x0056:
            com.ss.android.ugc.aweme.common.a r0 = r5.f70700f
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r0 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r0
            boolean r0 = r0.isDataEmpty()
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            r0.aJ_()
            return
        L_0x006d:
            r5.m66930e()
            com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
            com.ss.android.ugc.aweme.common.f.c r0 = (com.p683ss.android.ugc.aweme.common.p1594f.C26877c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r5.f73846b
            com.ss.android.ugc.aweme.common.a r2 = r5.f70700f
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r2
            boolean r2 = r2.isHasMore()
            r0.mo47018a(r1, r2)
            return
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1645g.C28119c.mo44838b():void");
    }

    public C28119c(String str) {
        C52711k.m112240b(str, "tabName");
        this.f73845a = str;
        if (!TextUtils.equals(this.f73845a, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().register(this);
        }
    }

    public final void onDataChanged(String str) {
        C52711k.m112240b(str, "tabName");
        if (!TextUtils.equals(str, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST()) && m66931f() != null) {
            C26877c cVar = (C26877c) this.f70701g;
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            List items = ((DiscoveryV4DetailListModel) aVar).getItems();
            C26832a aVar2 = this.f70700f;
            C52711k.m112236a((Object) aVar2, "mModel");
            cVar.mo47026b(items, ((DiscoveryV4DetailListModel) aVar2).isHasMore());
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        Integer num = objArr[0];
        if (num != null) {
            if (num.intValue() == 1) {
                Integer num2 = objArr[1];
                if (num2 == null) {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                } else if (num2.intValue() == 1 && m66931f() != null) {
                    C26832a aVar = this.f70700f;
                    C52711k.m112236a((Object) aVar, "mModel");
                    if (((DiscoveryV4DetailListModel) aVar).isDataEmpty()) {
                        ((C26877c) this.f70701g).aJ_();
                    } else {
                        C26877c cVar = (C26877c) this.f70701g;
                        C26832a aVar2 = this.f70700f;
                        C52711k.m112236a((Object) aVar2, "mModel");
                        List items = ((DiscoveryV4DetailListModel) aVar2).getItems();
                        C26832a aVar3 = this.f70700f;
                        C52711k.m112236a((Object) aVar3, "mModel");
                        cVar.mo47018a(items, ((DiscoveryV4DetailListModel) aVar3).isHasMore());
                    }
                    return true;
                }
            }
            Integer num3 = objArr[0];
            if (num3 != null) {
                if (num3.intValue() == 1) {
                    Integer num4 = objArr[1];
                    if (num4 == null) {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                    } else if (num4.intValue() == 2) {
                        IAwemeService a = C23324d.m57378a();
                        String str = objArr[5];
                        if (str != null) {
                            Aweme awemeById = a.getAwemeById(str);
                            if (awemeById != null) {
                                ((DiscoveryV4DetailListModel) this.f70700f).insertItem(awemeById);
                                mo44838b();
                                return true;
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                return super.mo44934a_(Arrays.copyOf(objArr, objArr.length));
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
    }
}
