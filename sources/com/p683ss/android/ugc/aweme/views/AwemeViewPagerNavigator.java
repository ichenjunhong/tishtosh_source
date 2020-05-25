package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator */
public class AwemeViewPagerNavigator extends FrameLayout {

    /* renamed from: e */
    public static final String f120966e = "AwemeViewPagerNavigator";

    /* renamed from: a */
    public View f120967a;

    /* renamed from: b */
    public LinearLayout f120968b;

    /* renamed from: c */
    public int f120969c;

    /* renamed from: d */
    public View f120970d;

    /* renamed from: f */
    ViewPager f120971f;

    /* renamed from: g */
    public boolean f120972g;

    /* renamed from: h */
    private int f120973h;

    /* renamed from: i */
    private C48200k f120974i;

    /* renamed from: j */
    private FrameLayout f120975j;

    /* renamed from: k */
    private boolean f120976k;

    public int getAllTabWidth() {
        return this.f120973h;
    }

    public View getLastSelectedTab() {
        return this.f120970d;
    }

    public ViewPager getViewPager() {
        return this.f120971f;
    }

    public int getTabCount() {
        return this.f120968b.getChildCount();
    }

    public void setAllTabWidth(int i) {
        this.f120973h = i;
    }

    public AwemeViewPagerNavigator(Context context) {
        this(context, null);
    }

    public void setScrollable(boolean z) {
        this.f120972g = z;
        this.f120974i.setScrollable(z);
    }

    private void setIndicatorPosition(int i) {
        if (this.f120967a != null) {
            float f = (float) (this.f120969c * i);
            Context context = getContext();
            boolean z = false;
            if (context != null && VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                z = true;
            }
            if (z) {
                f = -f;
            }
            this.f120967a.setTranslationX(f);
        }
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120973h = -1;
        this.f120976k = true;
        this.f120972g = true;
        this.f120974i = new C48200k(getContext());
        this.f120974i.setScrollable(false);
        this.f120974i.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f120974i);
        this.f120974i.setHorizontalFadingEdgeEnabled(false);
        this.f120974i.setHorizontalScrollBarEnabled(false);
        this.f120975j = new FrameLayout(getContext());
        this.f120974i.addView(this.f120975j, new ViewGroup.LayoutParams(-2, -1));
        this.f120968b = new LinearLayout(getContext());
        this.f120968b.setOrientation(0);
        this.f120968b.setLayoutParams(new LayoutParams(-1, -1));
        this.f120975j.addView(this.f120968b);
    }
}
