package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow */
public final class MusicCollectGuidePopupWindow extends PopupWindow implements C0183j {

    /* renamed from: a */
    final Runnable f95511a;

    /* renamed from: b */
    final int f95512b;

    /* renamed from: c */
    final int f95513c;

    /* renamed from: d */
    private final DmtTextView f95514d;

    /* renamed from: e */
    private final FrameLayout f95515e;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow$a */
    static final class C37450a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MusicCollectGuidePopupWindow f95516a;

        C37450a(MusicCollectGuidePopupWindow musicCollectGuidePopupWindow) {
            this.f95516a = musicCollectGuidePopupWindow;
        }

        public final void run() {
            this.f95516a.dismiss();
        }
    }

    public MusicCollectGuidePopupWindow(Context context) {
        this(context, 0, 2, null);
    }

    public final void dismiss() {
        if (isShowing()) {
            C37644t.m84120a(this);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f95511a);
    }

    private MusicCollectGuidePopupWindow(Context context, int i) {
        C52711k.m112240b(context, "context");
        this.f95511a = new C37450a(this);
        View inflate = LayoutInflater.from(context).inflate(i, null);
        View findViewById = inflate.findViewById(R.id.d8j);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f95514d = (DmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ahd);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f95515e = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.a7e);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C52711k.m112236a((Object) inflate, "view");
        this.f95513c = inflate.getMeasuredHeight();
        this.f95512b = inflate.getMeasuredWidth();
    }

    private /* synthetic */ MusicCollectGuidePopupWindow(Context context, int i, int i2, C52707g gVar) {
        this(context, R.layout.bm0);
    }
}
