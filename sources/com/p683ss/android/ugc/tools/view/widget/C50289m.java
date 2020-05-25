package com.p683ss.android.ugc.tools.view.widget;

import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.LayoutParams;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.tools.view.widget.m */
public final class C50289m {

    /* renamed from: a */
    static final Field f126169a;

    /* renamed from: com.ss.android.ugc.tools.view.widget.m$a */
    static class C50290a {
        C50290a() {
        }

        /* renamed from: a */
        public static View m108554a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            int i = 0;
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C50289m.f126169a.get(layoutParams)).intValue();
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
            f126169a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static View m108553a(ViewPager viewPager) {
        new C50290a();
        return C50290a.m108554a(viewPager);
    }
}
