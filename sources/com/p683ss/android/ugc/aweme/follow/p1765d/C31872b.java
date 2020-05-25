package com.p683ss.android.ugc.aweme.follow.p1765d;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38040g;
import com.p683ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.d.b */
public final class C31872b implements FollowFeedLogHelper {
    public final String getLaunchType(int i) {
        switch (i) {
            case 1:
                return "cold_launch";
            case 2:
                return "link_launch";
            case 4:
                return "refresh_launch";
            case 5:
                return "hot_launch";
            default:
                return "";
        }
    }

    public final void resetFetchState() {
        C31873c.f83257f = true;
        C31873c.f83258g = true;
    }

    public final C38040g providerNoticePointInfo() {
        Activity g = C11016e.m22312g();
        if (!(g instanceof MainActivity)) {
            g = null;
        }
        MainActivity mainActivity = (MainActivity) g;
        if (mainActivity != null) {
            mainActivity.getCurFragment();
        }
        return new C38040g();
    }

    public final void setLastLaunchType(int i) {
        C31873c.f83252a = i;
    }

    public final void setLastLongLinkAuthorId(long j) {
        C31873c.f83255d = j;
    }

    public final void setLastLongLinkItemId(long j) {
        C31873c.f83254c = j;
    }

    public final void setLastYellowDotRequestId(String str) {
        C52711k.m112240b(str, "requestId");
        C52711k.m112240b(str, "<set-?>");
        C31873c.f83253b = str;
    }

    public final void putFollowTabChannelCount(int i, int i2) {
        C31873c.f83256e.put(i, Integer.valueOf(i2));
    }
}
