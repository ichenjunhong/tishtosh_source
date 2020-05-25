package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.bytedance.android.livesdk.feed.p341i.C6989p;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.k */
final /* synthetic */ class C6889k implements C3924b {

    /* renamed from: a */
    static final C3924b f18861a = new C6889k();

    private C6889k() {
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        C6792a b = (objArr.length <= 0 || !(objArr[0] instanceof C6827p)) ? null : objArr[0].mo13002b();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alt, viewGroup, false);
        if (((Integer) LiveFeedSettings.DOUYIN_LIVE_FEED_TOP_HINT.mo9431a()).intValue() == 0) {
            inflate.findViewById(R.id.d5y).setVisibility(8);
        }
        return new C6989p(inflate, b);
    }
}
