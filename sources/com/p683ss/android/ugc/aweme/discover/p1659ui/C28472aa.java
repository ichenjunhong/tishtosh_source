package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.aa */
final /* synthetic */ class C28472aa implements IHotSearchListListener {

    /* renamed from: a */
    private final HotSearchAndDiscoveryFragment2 f74878a;

    C28472aa(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2) {
        this.f74878a = hotSearchAndDiscoveryFragment2;
    }

    public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
        SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
    }

    public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
        this.f74878a.mo58057b(str, str2, logPbBean);
    }
}
