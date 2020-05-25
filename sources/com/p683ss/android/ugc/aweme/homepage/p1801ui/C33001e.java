package com.p683ss.android.ugc.aweme.homepage.p1801ui;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32974c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32975d;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32976e;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32993a;
import java.lang.ref.WeakReference;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.e */
public final class C33001e {

    /* renamed from: a */
    public static PagerAdapter f85724a;

    /* renamed from: b */
    public static FlippableViewPager f85725b;

    /* renamed from: c */
    public static ScrollSwitchStateManager f85726c;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$a */
    public static final class C33002a implements C0997e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageSelected(int i) {
            ScrollSwitchStateManager scrollSwitchStateManager = C33001e.f85726c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f85678k.setValue(Integer.valueOf(i));
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            ScrollSwitchStateManager scrollSwitchStateManager = C33001e.f85726c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f85679l.setValue(new C52855s(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$b */
    public static final class C33003b implements C32976e {
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$c */
    public static final class C33004c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        public static final C33004c f85727a = new C33004c();

        C33004c() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            FlippableViewPager flippableViewPager = C33001e.f85725b;
            if (flippableViewPager != null) {
                if (bool == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) bool, "topTabPagingEnable!!");
                flippableViewPager.f62942g = bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$d */
    public static final class C33005d implements C32974c {
        /* renamed from: a */
        public final int mo55924a() {
            Integer num;
            FlippableViewPager flippableViewPager = C33001e.f85725b;
            if (flippableViewPager != null) {
                num = Integer.valueOf(flippableViewPager.getCurrentItem());
            } else {
                num = null;
            }
            if (num == null) {
                C52711k.m112234a();
            }
            return num.intValue();
        }

        /* renamed from: a */
        public final void mo55925a(int i) {
            FlippableViewPager flippableViewPager = C33001e.f85725b;
            if (flippableViewPager != null) {
                flippableViewPager.setCurrentItem(i);
            }
        }

        /* renamed from: a */
        public final void mo55926a(int i, boolean z) {
            FlippableViewPager flippableViewPager = C33001e.f85725b;
            if (flippableViewPager != null) {
                flippableViewPager.mo2956a(i, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$e */
    public static final class C33006e implements C32975d {
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.e$f */
    public static final class C33007f implements C32993a {
        /* renamed from: a */
        public final void mo69909a(WeakReference<Fragment> weakReference) {
            ScrollSwitchStateManager scrollSwitchStateManager = C33001e.f85726c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f85677j = weakReference;
            }
        }

        /* renamed from: a */
        public final void mo69908a(SparseArray<Fragment> sparseArray) {
            C52711k.m112240b(sparseArray, "fragments");
            ScrollSwitchStateManager scrollSwitchStateManager = C33001e.f85726c;
            if (scrollSwitchStateManager != null) {
                C52711k.m112240b(sparseArray, "fragments");
                scrollSwitchStateManager.f85676i.setValue(sparseArray);
            }
        }
    }
}
