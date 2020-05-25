package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.bytedance.ies.dmt.p664ui.sliding.AmeSlidingPaneLayout;
import com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.C10712d;
import com.p683ss.android.ugc.aweme.base.activity.C23448w.C23450b;
import com.p683ss.android.ugc.aweme.base.livedata.SlideData;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.activity.u */
public final class C23442u implements C10712d {

    /* renamed from: d */
    public static final C23443a f62509d = new C23443a(null);

    /* renamed from: a */
    public boolean f62510a;

    /* renamed from: b */
    public AmeSlidingPaneLayout f62511b;

    /* renamed from: c */
    public C23444b f62512c;

    /* renamed from: e */
    private SlideData f62513e;

    /* renamed from: f */
    private Activity f62514f;

    /* renamed from: g */
    private int f62515g;

    /* renamed from: com.ss.android.ugc.aweme.base.activity.u$a */
    public static final class C23443a {
        private C23443a() {
        }

        public /* synthetic */ C23443a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.u$b */
    public interface C23444b {
        /* renamed from: a */
        void mo48610a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.u$c */
    static final class C23445c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23442u f62516a;

        C23445c(C23442u uVar) {
            this.f62516a = uVar;
        }

        public final void run() {
            this.f62516a.mo48608b();
            this.f62516a.f62510a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.u$d */
    static final class C23446d implements C23450b {

        /* renamed from: a */
        final /* synthetic */ C23442u f62517a;

        C23446d(C23442u uVar) {
            this.f62517a = uVar;
        }

        /* renamed from: a */
        public final void mo48612a() {
            AmeSlidingPaneLayout ameSlidingPaneLayout = this.f62517a.f62511b;
            if (ameSlidingPaneLayout != null) {
                ameSlidingPaneLayout.mo19079a();
            }
        }
    }

    /* renamed from: e */
    private static boolean m57562e() {
        if (VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo48609c() {
        C23448w.m57572a(this.f62514f);
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f62511b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.mo19080b();
        }
    }

    /* renamed from: b */
    public final void mo48608b() {
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f62511b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.mo19080b();
        }
        C23448w.m57573a(this.f62514f, new C23446d(this));
    }

    /* renamed from: a */
    public final void mo48607a() {
        if (m57562e()) {
            this.f62514f.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            switch (this.f62515g) {
                case 0:
                    mo48608b();
                    this.f62510a = true;
                    break;
                case 1:
                case 2:
                    new Handler().postDelayed(new C23445c(this), 1300);
                    break;
            }
            m57561d();
            Activity activity = this.f62514f;
            if (activity != null) {
                this.f62513e = (SlideData) C0214z.m440a((FragmentActivity) activity).mo359a(SlideData.class);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: d */
    private final void m57561d() {
        this.f62511b = new AmeSlidingPaneLayout(this.f62514f);
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f62511b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.setPanelSlideListener(this);
        }
        AmeSlidingPaneLayout ameSlidingPaneLayout2 = this.f62511b;
        if (ameSlidingPaneLayout2 != null) {
            ameSlidingPaneLayout2.setSliderFadeColor(C23723j.m58217a().getColor(17170445));
        }
        View view = new View(this.f62514f);
        view.setLayoutParams(new LayoutParams(-1, -1));
        AmeSlidingPaneLayout ameSlidingPaneLayout3 = this.f62511b;
        if (ameSlidingPaneLayout3 != null) {
            ameSlidingPaneLayout3.addView(view, 0);
        }
        Window window = this.f62514f.getWindow();
        C52711k.m112236a((Object) window, "mActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundColor(C23723j.m58217a().getColor(C23447v.a3i));
                    View view2 = viewGroup2;
                    viewGroup.removeView(view2);
                    viewGroup.addView(this.f62511b);
                    AmeSlidingPaneLayout ameSlidingPaneLayout4 = this.f62511b;
                    if (ameSlidingPaneLayout4 != null) {
                        ameSlidingPaneLayout4.addView(view2, 1);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo19124a(View view) {
        C52711k.m112240b(view, "var1");
        SlideData slideData = this.f62513e;
        if (slideData != null) {
            C0198r b = slideData.mo48722b();
            if (b != null) {
                b.setValue(Boolean.valueOf(false));
            }
        }
        this.f62514f.finish();
        this.f62514f.overridePendingTransition(0, R.anim.f8);
    }

    /* renamed from: b */
    public final void mo19126b(View view) {
        C52711k.m112240b(view, "var1");
        SlideData slideData = this.f62513e;
        if (slideData != null) {
            C0198r b = slideData.mo48722b();
            if (b != null) {
                b.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: c */
    public final void mo19127c(View view) {
        C52711k.m112240b(view, "var1");
        KeyboardUtils.m58184c(view);
        SlideData slideData = this.f62513e;
        if (slideData != null) {
            C0198r b = slideData.mo48722b();
            if (b != null) {
                b.setValue(Boolean.valueOf(true));
            }
        }
        if (this.f62512c != null) {
            C23444b bVar = this.f62512c;
            if (bVar != null) {
                bVar.mo48610a();
            }
        }
    }

    public C23442u(Activity activity, int i) {
        C52711k.m112240b(activity, "activity");
        this.f62514f = activity;
        this.f62515g = i;
    }

    /* renamed from: a */
    public final void mo19125a(View view, float f) {
        C52711k.m112240b(view, "var1");
        SlideData slideData = this.f62513e;
        if (slideData != null) {
            C0198r a = slideData.mo48721a();
            if (a != null) {
                a.setValue(Float.valueOf(f));
            }
        }
    }
}
