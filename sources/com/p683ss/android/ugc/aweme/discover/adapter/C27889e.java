package com.p683ss.android.ugc.aweme.discover.adapter;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.e */
final class C27889e {
    /* renamed from: a */
    static void m66642a(ViewGroup viewGroup, BannerViewHolder bannerViewHolder) {
        if (bannerViewHolder.mSdCover != null) {
            if (VERSION.SDK_INT >= 23) {
                bannerViewHolder.mSdCover.setForeground(viewGroup.getContext().getDrawable(R.drawable.dui));
                return;
            }
            C38446k.m85764a(bannerViewHolder.mSdCover);
        }
    }
}
