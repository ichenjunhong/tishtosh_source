package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.common.widget.BaseCustomViewPager */
public abstract class BaseCustomViewPager extends ViewGroup {
    /* renamed from: a */
    public abstract void mo54890a(C0997e eVar);

    public abstract PagerAdapter getAdapter();

    public abstract int getCurrentItem();

    public BaseCustomViewPager(Context context) {
        super(context);
    }

    public BaseCustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseCustomViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
