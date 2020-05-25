package com.bytedance.android.livesdk.feed.p344l;

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

/* renamed from: com.bytedance.android.livesdk.feed.l.i */
public final /* synthetic */ class C7022i implements C3924b {

    /* renamed from: a */
    public static final C3924b f19175a = new C7022i();

    private C7022i() {
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
