package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cg */
public final class C30840cg extends PopupWindow {

    /* renamed from: a */
    private final Runnable f80786a = new C30842b(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cg$a */
    static final class C30841a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30840cg f80787a;

        C30841a(C30840cg cgVar) {
            this.f80787a = cgVar;
        }

        public final void run() {
            if (VERSION.SDK_INT >= 21) {
                View contentView = this.f80787a.getContentView();
                C52711k.m112236a((Object) contentView, "contentView");
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.kn);
                C52711k.m112236a((Object) linearLayout, "contentView.bg_view");
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    View contentView2 = this.f80787a.getContentView();
                    C52711k.m112236a((Object) contentView2, "contentView");
                    LinearLayout linearLayout2 = (LinearLayout) contentView2.findViewById(R.id.kn);
                    C52711k.m112236a((Object) linearLayout2, "contentView.bg_view");
                    ObjectAnimator duration = ObjectAnimator.ofArgb((GradientDrawable) background, "color", new int[]{0, linearLayout2.getResources().getColor(R.color.jc)}).setDuration(300);
                    View contentView3 = this.f80787a.getContentView();
                    C52711k.m112236a((Object) contentView3, "contentView");
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat((ImageView) contentView3.findViewById(R.id.aqa), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    View contentView4 = this.f80787a.getContentView();
                    C52711k.m112236a((Object) contentView4, "contentView");
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat((DmtTextView) contentView4.findViewById(R.id.a4e), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    C52711k.m112236a((Object) duration3, "descAnima");
                    duration3.setStartDelay(150);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
                    animatorSet.start();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cg$b */
    static final class C30842b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30840cg f80788a;

        C30842b(C30840cg cgVar) {
            this.f80788a = cgVar;
        }

        public final void run() {
            this.f80788a.mo63576a();
        }
    }

    /* renamed from: a */
    public final void mo63576a() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        getContentView().removeCallbacks(this.f80786a);
    }

    public C30840cg(Context context) {
        C52711k.m112240b(context, "context");
        setContentView(LayoutInflater.from(context).inflate(R.layout.b73, null));
        setWidth((int) C9432q.m18687b(context, 180.0f));
        setHeight(-2);
        setAnimationStyle(R.style.a53);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        getContentView().post(new C30841a(this));
        getContentView().removeCallbacks(this.f80786a);
        getContentView().postDelayed(this.f80786a, 3000);
    }
}
