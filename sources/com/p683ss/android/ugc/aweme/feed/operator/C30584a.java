package com.p683ss.android.ugc.aweme.feed.operator;

import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27403a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a;
import com.p683ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30498r;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.operator.a */
public final class C30584a extends C27403a<FollowingFeedListModel, C26876b<FollowingFeedListModel>> implements C27420a {
    /* renamed from: a */
    public final boolean mo55879a() {
        return true;
    }

    public final int getPageType(int i) {
        return 9001;
    }

    public final boolean isLoading() {
        return super.isLoading();
    }

    public C30584a(List<String> list, List<String> list2) {
        C52711k.m112240b(list, "uidList");
        C52711k.m112240b(list2, "blueDotList");
        this.mModel = new FollowingFeedListModel(list, list2);
        this.mPresenter = new C30498r();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i), bVar.getSelectedUid());
    }
}
