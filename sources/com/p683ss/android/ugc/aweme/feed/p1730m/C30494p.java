package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.m.p */
public final class C30494p extends C30480d {

    /* renamed from: g */
    private boolean f79706g = true;

    /* renamed from: a */
    public final boolean mo60905a() {
        return this.f79706g;
    }

    public C30494p(int i) {
        super(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(FeedItemList feedItemList) {
        boolean z = true;
        if (feedItemList == null || C9376b.m18558a((Collection<T>) feedItemList.getItems()) || isDataEmpty()) {
            this.f79706g = true;
        } else {
            Aweme aweme = (Aweme) ((FeedItemList) this.mData).getItems().get(0);
            Aweme aweme2 = (Aweme) feedItemList.getItems().get(0);
            if (!(aweme == null || aweme2 == null || !C9431p.m18665a(aweme.getAid(), aweme2.getAid()))) {
                z = false;
            }
            this.f79706g = z;
        }
        super.handleData(feedItemList);
    }
}
