package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.widget.Scroller;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.b */
public final class C47232b extends Scroller {

    /* renamed from: a */
    public int f119277a = 1500;

    public C47232b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo94503a(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, this);
        } catch (Exception unused) {
        }
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.f119277a);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f119277a);
    }
}
