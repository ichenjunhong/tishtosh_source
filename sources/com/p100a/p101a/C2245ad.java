package com.p100a.p101a;

import android.content.Context;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabViewPager;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ad */
public final class C2245ad implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -1);
        if (viewGroup != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(relativeLayout);
            }
        }
        FriendTabViewPager friendTabViewPager = new FriendTabViewPager(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        friendTabViewPager.setId(R.id.ds2);
        friendTabViewPager.setLayoutParams(layoutParams);
        if (friendTabViewPager.getParent() == null) {
            relativeLayout.addView(friendTabViewPager);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(friendTabViewPager);
        return relativeLayout;
    }
}
