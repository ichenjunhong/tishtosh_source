package com.p683ss.android.ugc.aweme.p1323ae.p1325b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.api.HotSearchListAPI;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.ae.b.b */
public final class C22469b extends C26875a<Aweme, HotVideoListResponse> {

    /* renamed from: a */
    public int f60523a = 0;

    /* renamed from: b */
    public List<Aweme> f60524b = new ArrayList();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Aweme> getItems() {
        return this.f60524b;
    }

    public final boolean isHasMore() {
        return false;
    }

    public final void loadMoreList(Object... objArr) {
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public final void refreshList(final Object... objArr) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final /* synthetic */ Object call() throws Exception {
                if (objArr.length > 1) {
                    C22469b.this.f60523a = ((Integer) objArr[1]).intValue();
                }
                if (C22469b.this.f60523a == 1) {
                    return HotSearchListAPI.m66823b();
                }
                return HotSearchListAPI.m66822a();
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        HotSearchInfo hotSearchInfo;
        HotVideoListResponse hotVideoListResponse = (HotVideoListResponse) obj;
        this.f60524b.clear();
        if (hotVideoListResponse != null) {
            List<HotVideoItem> list = hotVideoListResponse.mHotVideoItemList;
            if (!C9376b.m18558a((Collection<T>) list)) {
                for (int i = 0; i < list.size(); i++) {
                    HotVideoItem hotVideoItem = (HotVideoItem) list.get(i);
                    if (hotVideoItem != null) {
                        Aweme updateAweme = C23324d.m57378a().updateAweme(hotVideoItem.getAweme());
                        if (updateAweme != null) {
                            if (this.f60523a == 0) {
                                if (updateAweme.getHotSearchInfo() == null) {
                                    hotSearchInfo = new HotSearchInfo();
                                } else {
                                    hotSearchInfo = updateAweme.getHotSearchInfo();
                                }
                                hotSearchInfo.setVideoRank(i + 1);
                                hotSearchInfo.setVideoRankVV(hotVideoItem.getHotValue());
                                updateAweme.setHotSearchInfo(hotSearchInfo);
                                updateAweme = C23324d.m57378a().updateAweme(updateAweme);
                            }
                            this.f60524b.add(updateAweme);
                            hotVideoItem.setAweme(updateAweme);
                            list.set(i, hotVideoItem);
                        }
                    }
                }
                hotVideoListResponse.mHotVideoItemList = list;
            }
        }
        super.handleData(hotVideoListResponse);
    }
}
