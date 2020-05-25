package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager */
public class NonSwipeableViewPager extends RtlViewPager {

    /* renamed from: com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager$a */
    public class C21038a extends Scroller {
        public C21038a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        public final void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, NormalGiftView.MASK_TRANSLATE_VALUE);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: b */
    private void m53460b() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C21038a(getContext()));
        } catch (Exception unused) {
        }
    }

    public NonSwipeableViewPager(Context context) {
        super(context);
        m53460b();
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53460b();
    }
}
