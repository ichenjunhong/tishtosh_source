package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.LayoutParams;
import android.view.View;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a */
public final class C23583a {

    /* renamed from: a */
    static final Field f62741a;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$a */
    static class C23584a {
        C23584a() {
        }

        /* renamed from: a */
        public static View m57814a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            int i = 0;
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C23583a.f62741a.get(layoutParams)).intValue();
                    if (!layoutParams.f3211a && currentItem == intValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$b */
    static class C23585b {
        C23585b() {
        }

        /* renamed from: a */
        public static View m57815a(ViewPager viewPager) {
            if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
                return null;
            }
            RtlViewPager rtlViewPager = (RtlViewPager) viewPager;
            int currentItem = viewPager.getCurrentItem();
            int i = 0;
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C23583a.f62741a.get(layoutParams)).intValue();
                    if (rtlViewPager.mo95575a()) {
                        intValue = (rtlViewPager.getItemCount() - intValue) - 1;
                    }
                    if (!layoutParams.f3211a && currentItem == intValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
    }

    static {
        try {
            Field declaredField = LayoutParams.class.getDeclaredField("position");
            f62741a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static View m57813a(ViewPager viewPager) {
        if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
            new C23584a();
            return C23584a.m57814a(viewPager);
        }
        new C23585b();
        return C23585b.m57815a(viewPager);
    }
}
