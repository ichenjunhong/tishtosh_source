package com.p683ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.discover.api.p1638a.C28064a;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel */
public final class HotSearchRankingListViewModel extends C0209x {

    /* renamed from: d */
    public static final C28946a f75774d = new C28946a(null);

    /* renamed from: a */
    public final C23275b<C28064a<HotSearchListResponse>> f75775a = new C23275b<>();

    /* renamed from: b */
    public long f75776b;

    /* renamed from: c */
    public boolean f75777c;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel$a */
    public static final class C28946a {
        private C28946a() {
        }

        public /* synthetic */ C28946a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel$b */
    public static final class C28947b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28947b f75778a = new C28947b();

        C28947b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            C52711k.m112240b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C52711k.m112236a((Object) data, "it.data");
            for (HotSearchItem logPb : data.getList()) {
                logPb.setLogPb(hotSearchListResponse.getLogPb());
            }
            return hotSearchListResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel$c */
    public static final class C28948c implements C1683ag<HotSearchListResponse> {

        /* renamed from: a */
        final /* synthetic */ HotSearchRankingListViewModel f75779a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public C28948c(HotSearchRankingListViewModel hotSearchRankingListViewModel) {
            this.f75779a = hotSearchRankingListViewModel;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f75779a.f75775a.setValue(new C28064a(false, null));
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            C52711k.m112240b(hotSearchListResponse, "t");
            HotSearchEntity data = hotSearchListResponse.getData();
            C52711k.m112236a((Object) data, "t.data");
            data.getList();
            this.f75779a.f75775a.setValue(new C28064a(true, hotSearchListResponse));
        }
    }
}
