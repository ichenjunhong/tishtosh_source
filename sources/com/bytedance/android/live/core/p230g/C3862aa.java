package com.bytedance.android.live.core.p230g;

import android.app.Activity;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import com.bytedance.android.live.core.setting.C4097p;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.live.core.g.aa */
public final class C3862aa {

    /* renamed from: a */
    public static C4097p<Boolean> f10885a = new C4097p<>("enable_slide_finish", Boolean.valueOf(false), "右滑退出页面");

    /* renamed from: b */
    static Set<Class<? extends Activity>> f10886b = new HashSet();

    /* renamed from: com.bytedance.android.live.core.g.aa$a */
    public static class C3863a extends C1000h {

        /* renamed from: a */
        private final ViewPager f10887a;

        public C3863a(ViewPager viewPager) {
            this.f10887a = viewPager;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (i == 0 && f == 0.0f && this.f10887a != null && this.f10887a.getParent() != null) {
                this.f10887a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* renamed from: a */
    public static void m9793a(Activity activity) {
        if (activity != null) {
            f10886b.add(activity.getClass());
        }
    }
}
