package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.x */
public final class C40471x extends PopupWindow {

    /* renamed from: g */
    public static final String f103315g = f103315g;

    /* renamed from: h */
    public static final C40472a f103316h = new C40472a(null);

    /* renamed from: a */
    public final Runnable f103317a = new C40473b(this);

    /* renamed from: b */
    public final Activity f103318b;

    /* renamed from: c */
    ImageView f103319c;

    /* renamed from: d */
    TextView f103320d;

    /* renamed from: e */
    final int f103321e;

    /* renamed from: f */
    public final int f103322f;

    /* renamed from: i */
    private final int f103323i;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.x$a */
    public static final class C40472a {
        private C40472a() {
        }

        public /* synthetic */ C40472a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.x$b */
    static final class C40473b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40471x f103324a;

        C40473b(C40471x xVar) {
            this.f103324a = xVar;
        }

        public final void run() {
            this.f103324a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.x$c */
    public static final class C40474c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C40471x f103325a;

        /* renamed from: b */
        final /* synthetic */ View f103326b;

        public final void onGlobalLayout() {
            this.f103326b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C40471x xVar = this.f103325a;
            View view = this.f103326b;
            float measuredWidth = (float) view.getMeasuredWidth();
            float measuredWidth2 = (float) xVar.f103319c.getMeasuredWidth();
            float a = (float) C9432q.m18670a((Context) xVar.f103318b);
            float f = ((a - ((float) xVar.f103321e)) / 2.0f) - ((a - measuredWidth) / 2.0f);
            float measuredHeight = ((float) view.getMeasuredHeight()) / 2.0f;
            float f2 = measuredWidth2 / 2.0f;
            float f3 = (((-f) + measuredWidth) - measuredHeight) - f2;
            if (f3 > ((float) xVar.f103321e) - measuredWidth2) {
                f = f3 - (((float) xVar.f103321e) - measuredWidth2);
                f3 -= f;
            }
            if (C47918gj.m103682a(xVar.f103318b)) {
                f3 = (((((float) xVar.f103321e) - measuredWidth) / 2.0f) + measuredHeight) - f2;
            }
            int a2 = C52733a.m112277a(f3);
            LayoutParams layoutParams = xVar.f103319c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (!C47918gj.m103682a(xVar.f103318b)) {
                    marginLayoutParams.leftMargin = a2;
                } else {
                    marginLayoutParams.rightMargin = a2;
                }
                xVar.f103319c.setLayoutParams(marginLayoutParams);
                xVar.showAsDropDown(view, C52733a.m112277a(f), 0);
                if (xVar.f103322f == 1) {
                    xVar.f103320d.setText(xVar.f103318b.getString(R.string.fs1));
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        public C40474c(C40471x xVar, View view) {
            this.f103325a = xVar;
            this.f103326b = view;
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f103317a);
    }

    public final void dismiss() {
        if (isShowing() && this.f103318b != null && !this.f103318b.isFinishing()) {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    public C40471x(Activity activity, int i) {
        C52711k.m112240b(activity, "context");
        super(activity);
        this.f103322f = i;
        this.f103318b = activity;
        View inflate = LayoutInflater.from(this.f103318b).inflate(R.layout.bps, null);
        View findViewById = inflate.findViewById(R.id.ee9);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.i…ge_username_bubble_arrow)");
        this.f103319c = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.e1m);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.change_username_bubble_doc)");
        this.f103320d = (TextView) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setAnimationStyle(R.style.a7m);
        getContentView().measure(0, 0);
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        this.f103321e = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C52711k.m112236a((Object) contentView2, "contentView");
        this.f103323i = contentView2.getMeasuredHeight();
        update();
    }
}
