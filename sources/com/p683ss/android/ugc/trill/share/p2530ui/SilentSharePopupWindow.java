package com.p683ss.android.ugc.trill.share.p2530ui;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow */
public final class SilentSharePopupWindow extends PopupWindow implements C0183j {

    /* renamed from: f */
    public static final C50498a f126584f = new C50498a(null);

    /* renamed from: a */
    public final Runnable f126585a;

    /* renamed from: b */
    public int f126586b;

    /* renamed from: c */
    public int f126587c;

    /* renamed from: d */
    public final Context f126588d;

    /* renamed from: e */
    public final int f126589e;

    /* renamed from: g */
    private final DmtTextView f126590g;

    /* renamed from: h */
    private final FrameLayout f126591h;

    /* renamed from: i */
    private final String f126592i;

    /* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow$a */
    public static final class C50498a {
        private C50498a() {
        }

        public /* synthetic */ C50498a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow$b */
    static final class C50499b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SilentSharePopupWindow f126593a;

        C50499b(SilentSharePopupWindow silentSharePopupWindow) {
            this.f126593a = silentSharePopupWindow;
        }

        public final void run() {
            this.f126593a.dismiss();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f126585a);
    }

    public final void dismiss() {
        if (isShowing()) {
            if ((this.f126588d instanceof Activity) && ((Activity) this.f126588d).isFinishing()) {
                return;
            }
            if (VERSION.SDK_INT < 17 || !(this.f126588d instanceof Activity) || !((Activity) this.f126588d).isDestroyed()) {
                super.dismiss();
            }
        }
    }

    private SilentSharePopupWindow(Context context, String str, int i, int i2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "label");
        this.f126588d = context;
        this.f126592i = str;
        this.f126589e = i;
        this.f126585a = new C50499b(this);
        Context context2 = this.f126588d;
        if (!(context2 instanceof C0184k)) {
            context2 = null;
        }
        C0184k kVar = (C0184k) context2;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo324a(this);
            }
        }
        View inflate = LayoutInflater.from(this.f126588d).inflate(i2, null);
        View findViewById = inflate.findViewById(R.id.d8j);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f126590g = (DmtTextView) findViewById;
        this.f126590g.setFontType(C10751d.f28908g);
        this.f126590g.setText(this.f126592i);
        View findViewById2 = inflate.findViewById(R.id.ahd);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f126591h = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.h1);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C52711k.m112236a((Object) inflate, "view");
        this.f126587c = inflate.getMeasuredHeight();
        this.f126586b = inflate.getMeasuredWidth();
    }

    public /* synthetic */ SilentSharePopupWindow(Context context, String str, int i, int i2, int i3, C52707g gVar) {
        this(context, str, i, R.layout.acv);
    }
}
