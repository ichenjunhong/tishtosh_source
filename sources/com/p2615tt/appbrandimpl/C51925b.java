package com.p2615tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.commercialize.api.GameStationApi;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.tt.appbrandimpl.b */
public final class C51925b extends C26875a<Aweme, FeedItemList> {

    /* renamed from: a */
    private int f129597a;

    /* renamed from: b */
    private int f129598b;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m111321a((String) objArr[1], (String) objArr[2], 10, ((FeedItemList) this.mData).cursor);
    }

    public final void refreshList(Object... objArr) {
        m111321a((String) objArr[1], (String) objArr[2], 10, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        boolean z2;
        int i;
        Aweme aweme;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (feedItemList == null || feedItemList.fetchType != 0) {
            z = false;
        } else {
            z = true;
        }
        if (feedItemList == null || C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = feedItemList.getItems().size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme2 = (Aweme) feedItemList.getItems().get(i2);
                if (aweme2 == null) {
                    i = -1;
                } else {
                    i = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = C23324d.m57378a().updateAweme(aweme2);
                } else {
                    aweme = C23324d.m57378a().updateProfileSelfSeeAweme(aweme2, this.f129597a);
                }
                if (z && i >= 0) {
                    aweme.setIsTop(i);
                }
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(this.f129598b + this.f129597a);
                a.setRequestIdAndIndex(sb.toString(), feedItemList.getRequestId(), i2);
                feedItemList.getItems().set(i2, aweme);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = feedItemList;
                return;
            } else if (i3 == 4) {
                if (this.mData != null) {
                    if (C9376b.m18558a((Collection<T>) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        ((FeedItemList) this.mData).getItems().addAll(m111320a(feedItemList.getItems(), ((FeedItemList) this.mData).getItems()));
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                    ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                    return;
                }
            } else {
                return;
            }
        } else if (this.mData != null) {
            if (feedItemList != null) {
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                return;
            }
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        } else if (feedItemList == null) {
            this.mData = new FeedItemList();
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        }
        this.mData = feedItemList;
    }

    /* renamed from: a */
    private static List<Aweme> m111320a(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (TextUtils.equals(aweme.getAid(), ((Aweme) it.next()).getAid())) {
                    arrayList.remove(aweme);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m111321a(String str, String str2, int i, long j) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final long j2 = j;
        C519261 r1 = new Callable(10) {
            public final Object call() throws Exception {
                return GameStationApi.m62164a(str3, str4, (long) 10, j2);
            }
        };
        a.mo48750a(gVar, r1, 0);
    }
}
