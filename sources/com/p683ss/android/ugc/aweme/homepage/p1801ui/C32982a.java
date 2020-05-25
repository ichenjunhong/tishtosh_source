package com.p683ss.android.ugc.aweme.homepage.p1801ui;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.C0657l;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23695i;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23696j;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23702b;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager.C23638a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32974c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32977f;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a */
public final class C32982a {

    /* renamed from: a */
    public static ScrollableViewPager f85702a;

    /* renamed from: b */
    public static C23699m f85703b;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$a */
    public static final class C32983a implements C32974c {
        /* renamed from: a */
        public final int mo55924a() {
            Integer num;
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                num = Integer.valueOf(scrollableViewPager.getCurrentItem());
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
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                scrollableViewPager.setCurrentItem(i);
            }
        }

        /* renamed from: a */
        public final void mo55926a(int i, boolean z) {
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                scrollableViewPager.mo2956a(i, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$b */
    public static final class C32984b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        public static final C32984b f85704a = new C32984b();

        C32984b() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) bool, "enabled!!");
                scrollableViewPager.f63017h = bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$c */
    public static final class C32985c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        public static final C32985c f85705a = new C32985c();

        C32985c() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) bool, "block!!");
                scrollableViewPager.setBlockCanScroll(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$d */
    public static final class C32986d<T> implements C0199s<String> {

        /* renamed from: a */
        public static final C32986d f85706a = new C32986d();

        C32986d() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final String str = (String) obj;
            C23699m mVar = C32982a.f85703b;
            if (mVar == null) {
                C52711k.m112234a();
            }
            if (!C0657l.m1814a(mVar.f63214e)) {
                C23699m mVar2 = C32982a.f85703b;
                if (mVar2 == null) {
                    C52711k.m112234a();
                }
                mVar2.mo49124a(str);
                return;
            }
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final /* synthetic */ Object call() {
                    C23699m mVar = C32982a.f85703b;
                    if (mVar == null) {
                        C52711k.m112234a();
                    }
                    mVar.mo49124a(str);
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$e */
    public static final class C32988e<T> implements C0199s<C23638a> {

        /* renamed from: a */
        public static final C32988e f85708a = new C32988e();

        C32988e() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C23638a aVar = (C23638a) obj;
            ScrollableViewPager scrollableViewPager = C32982a.f85702a;
            if (scrollableViewPager != null) {
                scrollableViewPager.mo49054a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$f */
    public static final class C32989f implements C23702b {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f85709a;

        public C32989f(AmeSSActivity ameSSActivity) {
            this.f85709a = ameSSActivity;
        }

        /* renamed from: a */
        public final void mo49130a(HashMap<Integer, C23689d> hashMap) {
            C52711k.m112240b(hashMap, "fragments");
            C32969a.m75907a(this.f85709a).mo69861a(hashMap);
        }

        /* renamed from: a */
        public final void mo49131a(List<C23695i> list) {
            C52711k.m112240b(list, "mainPages");
            C32969a.m75907a(this.f85709a).mo69862a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$g */
    public static final class C32990g implements OnTouchListener {

        /* renamed from: a */
        public static final C32990g f85710a = new C32990g();

        C32990g() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocusFromTouch();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$h */
    public static final class C32991h implements C0997e {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f85711a;

        public C32991h(AmeSSActivity ameSSActivity) {
            this.f85711a = ameSSActivity;
        }

        public final void onPageScrollStateChanged(int i) {
            C32969a.m75907a(this.f85711a).mo69874d(i);
        }

        public final void onPageSelected(int i) {
            C32969a.m75907a(this.f85711a).mo69871c(i);
        }

        public final void onPageScrolled(int i, float f, int i2) {
            C32969a.m75907a(this.f85711a).mo69854a(i, f, i2);
            Window window = this.f85711a.getWindow();
            C52711k.m112236a((Object) window, "activity.window");
            window.getDecorView().setBackgroundColor(this.f85711a.getResources().getColor(R.color.ayi));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$i */
    public static final class C32992i implements C23696j {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f85712a;

        public C32992i(AmeSSActivity ameSSActivity) {
            this.f85712a = ameSSActivity;
        }

        /* renamed from: a */
        public final void mo49121a() {
            ScrollSwitchStateManager a = C32969a.m75907a(this.f85712a);
            C32977f fVar = C32977f.INSTANCE;
            C52711k.m112240b(fVar, "event");
            a.f85670c.setValue(fVar);
        }
    }
}
