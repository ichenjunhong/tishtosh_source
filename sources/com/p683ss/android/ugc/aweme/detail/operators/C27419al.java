package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.al */
public interface C27419al {

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.al$a */
    public interface C27420a {
        /* renamed from: a */
        boolean mo55879a();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.al$b */
    public interface C27421b {
        void bindPreLoadView(C30504w wVar);

        void setPreLoad(boolean z);
    }

    void bindView(C27424ao aoVar);

    boolean cannotLoadLatest();

    boolean cannotLoadMore();

    boolean deleteItem(String str);

    int getPageType(int i);

    Object getViewModel();

    boolean init(Fragment fragment);

    boolean isDataEmpty();

    boolean isLoading();

    void request(int i, C30669b bVar, int i2, boolean z);

    void unInit();
}
