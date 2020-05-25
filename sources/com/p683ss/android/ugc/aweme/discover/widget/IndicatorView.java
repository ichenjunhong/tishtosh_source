package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.ViewPagerIndicatorLayout;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.IndicatorView */
public class IndicatorView extends ViewPagerIndicatorLayout {
    /* renamed from: a */
    public final void mo58544a(ViewPager viewPager) {
        setUpViewPager(viewPager);
    }

    public IndicatorView(Context context) {
        this(context, null);
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
