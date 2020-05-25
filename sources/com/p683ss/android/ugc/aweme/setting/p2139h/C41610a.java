package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.setting.model.BlackList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.h.a */
public final class C41610a extends C26875a<User, BlackList> {

    /* renamed from: a */
    int f105335a;

    /* renamed from: b */
    private int f105336b;

    public final boolean needCheckEmptyForQueryType() {
        return false;
    }

    public C41610a() {
        this(0);
    }

    public final List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((BlackList) this.mData).blockList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((BlackList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m91471a(0, 0, 0);
    }

    private C41610a(int i) {
        this.f105335a = 0;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m91471a(this.f105336b, ((BlackList) this.mData).hotsoonFilteredCount, ((BlackList) this.mData).hotsoonHasMore);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        BlackList blackList = (BlackList) obj;
        if (blackList == null || C9376b.m18558a((Collection<T>) blackList.blockList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = blackList;
            if (!this.mIsNewDataEmpty || (blackList != null && isHasMore())) {
                this.f105336b = blackList.index;
            }
        } else if (i == 4) {
            if (blackList != null) {
                ((BlackList) this.mData).hotsoonFilteredCount = blackList.hotsoonFilteredCount;
                ((BlackList) this.mData).hotsoonHasMore = blackList.hotsoonHasMore;
                ((BlackList) this.mData).hotsoonText = blackList.hotsoonText;
            }
            if (!this.mIsNewDataEmpty || (blackList != null && isHasMore())) {
                ((BlackList) this.mData).blockList.addAll(blackList.blockList);
                ((BlackList) this.mData).hasMore = blackList.hasMore;
                this.f105336b = blackList.index;
                return;
            }
            ((BlackList) this.mData).hasMore = false;
        }
    }

    /* renamed from: a */
    private void m91471a(int i, int i2, int i3) {
        C23566n.m57766a().mo48750a(this.mHandler, new C41611b(this, i, i2, i3), 0);
    }
}
