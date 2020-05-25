package com.p683ss.android.ugc.aweme.discover.helper;

import android.support.p043v7.widget.RecyclerView;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchVideoCoverDisplayExperiment;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.o */
public final class C28207o {

    /* renamed from: a */
    public static final C28207o f74051a = new C28207o();

    private C28207o() {
    }

    /* renamed from: a */
    public static C28301a m67120a(RecyclerView recyclerView) {
        boolean z;
        Integer num;
        C28301a aVar = null;
        if (recyclerView == null) {
            return null;
        }
        switch (C10181b.m20511a().mo18168a(SearchVideoCoverDisplayExperiment.class, true, "search_dynamic_video_cover_display", 31744, 0)) {
            case 0:
                return null;
            case 1:
                num = Integer.valueOf(1);
                break;
            case 2:
                num = Integer.valueOf(2);
                z = false;
                break;
            default:
                num = null;
                break;
        }
        z = true;
        if (num != null) {
            num.intValue();
            aVar = new C28301a(recyclerView, num.intValue(), z, true);
        }
        return aVar;
    }
}
