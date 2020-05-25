package com.bytedance.android.livesdk.feed.drawerfeed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.feed.banner.BannerViewPager;
import com.bytedance.android.livesdk.feed.p337e.C6909a;
import com.bytedance.android.livesdk.p269aa.C4495a;

public class DrawerBannerViewPager extends BannerViewPager {
    public DrawerBannerViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m14463a(Boolean bool) {
        C4495a.m10823a().mo10301a((Object) new C6909a(1));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    m14463a(Boolean.valueOf(true));
                    break;
                case 1:
                    break;
            }
        }
        m14463a(Boolean.valueOf(false));
        return super.dispatchTouchEvent(motionEvent);
    }

    public DrawerBannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
