package com.p683ss.android.ugc.aweme.account.login;

import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.LayoutParams;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.account.login.ah */
public final class C21067ah {

    /* renamed from: a */
    private static Field f57272a;

    static {
        try {
            Field declaredField = LayoutParams.class.getDeclaredField("position");
            f57272a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static View m53528a(ViewPager viewPager) {
        int currentItem = viewPager.getCurrentItem();
        int i = 0;
        while (i < viewPager.getChildCount()) {
            View childAt = viewPager.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            try {
                int intValue = ((Integer) f57272a.get(layoutParams)).intValue();
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
