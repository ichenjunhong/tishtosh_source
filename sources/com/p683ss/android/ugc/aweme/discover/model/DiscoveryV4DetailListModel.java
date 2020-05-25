package com.p683ss.android.ugc.aweme.discover.model;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi.DiscoverService;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.net.C37776h;
import java.util.List;
import p001a.C0011g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel */
public final class DiscoveryV4DetailListModel extends C26875a<Aweme, DiscoveryV4CellDetailResponse> {
    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse = (DiscoveryV4CellDetailResponse) this.mData;
        if (discoveryV4CellDetailResponse != null) {
            return discoveryV4CellDetailResponse.awemeList;
        }
        return null;
    }

    public final boolean isHasMore() {
        DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse = (DiscoveryV4CellDetailResponse) this.mData;
        if (discoveryV4CellDetailResponse != null) {
            return discoveryV4CellDetailResponse.hasMore;
        }
        return true;
    }

    public final void setData(DiscoveryV4CellDetailResponse discoveryV4CellDetailResponse) {
        C52711k.m112240b(discoveryV4CellDetailResponse, "data");
        this.mIsLoading = false;
        this.mData = discoveryV4CellDetailResponse;
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        String str = objArr[2];
        if (!(str instanceof String)) {
            str = null;
        }
        String str2 = str;
        String str3 = objArr[3];
        if (!(str3 instanceof String)) {
            str3 = null;
        }
        String str4 = str3;
        Integer num = objArr[4];
        if (!(num instanceof Integer)) {
            num = null;
        }
        loadList(str2, str4, num);
    }

    public final void setItems(List<Aweme> list) {
        String str;
        if (this.mData == null) {
            LogPbBean logPbBean = new LogPbBean();
            if (list != null) {
                Aweme aweme = (Aweme) C52575l.m112140f(list);
                if (aweme != null) {
                    str = aweme.getRequestId();
                    logPbBean.setImprId(str);
                    this.mData = new DiscoveryV4CellDetailResponse(list, true, logPbBean);
                }
            }
            str = null;
            logPbBean.setImprId(str);
            this.mData = new DiscoveryV4CellDetailResponse(list, true, logPbBean);
        }
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        Integer num = objArr[1];
        if (num == null) {
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        } else if (num.intValue() == 1) {
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().needLoadData(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST());
        } else {
            String str = objArr[2];
            if (!(str instanceof String)) {
                str = null;
            }
            String str2 = str;
            String str3 = objArr[3];
            if (!(str3 instanceof String)) {
                str3 = null;
            }
            String str4 = str3;
            Integer num2 = objArr[4];
            if (!(num2 instanceof Integer)) {
                num2 = null;
            }
            loadList(str2, str4, num2);
        }
    }

    private final void loadList(String str, String str2, Integer num) {
        int i;
        DiscoverService a = DiscoverApi.m66818a();
        int f = NewDiscoverV4Experiment.m69622f();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        a.cellDetailV4(0, str, str2, f, i).mo19a((C0011g<TResult, TContinuationResult>) DiscoveryV4DetailListModel$loadList$1.INSTANCE).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
