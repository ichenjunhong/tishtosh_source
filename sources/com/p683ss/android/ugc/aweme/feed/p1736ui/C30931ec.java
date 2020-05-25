package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0199s;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ec */
public final class C30931ec extends C30930eb implements C0199s<C23274a> {

    /* renamed from: a */
    TextView f81007a;

    /* renamed from: b */
    private boolean f81008b;

    /* renamed from: c */
    private ValueAnimator f81009c;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo63692j() {
        if (this.f81009c != null) {
            this.f81009c.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo63690d() {
        String str;
        GradientDrawable gradientDrawable;
        if (this.f81007a != null && this.f81198r != null) {
            LiveAwesomeData g = C26235d.m63576g(this.f81192l);
            TextView textView = this.f81007a;
            if (g != null) {
                str = g.gbc;
            } else {
                str = "";
            }
            textView.setText(str);
            this.f81007a.setOnClickListener(new C30933ee(this));
            if (this.f81007a.getBackground() instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) this.f81007a.getBackground();
            } else {
                gradientDrawable = new GradientDrawable();
            }
            gradientDrawable.setCornerRadius(C9432q.m18687b(this.f81198r, 4.0f));
            gradientDrawable.setColor(this.f81198r.getResources().getColor(R.color.azz));
            this.f81007a.setBackground(gradientDrawable);
            this.f81008b = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo63691e() {
        if (this.f81007a != null && !this.f81008b && this.f81198r != null) {
            if (this.f81009c != null) {
                this.f81009c.cancel();
            }
            this.f81008b = true;
            int color = this.f81198r.getResources().getColor(R.color.azz);
            int color2 = this.f81198r.getResources().getColor(R.color.b00);
            this.f81009c = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)}).setDuration(300);
            this.f81009c.setStartDelay(2000);
            this.f81009c.addUpdateListener(new C30932ed(this));
            this.f81009c.start();
        }
    }

    public C30931ec(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        super.mo49784a(dataCenter);
        dataCenter.mo48226a("live_video_click", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63689b(View view) {
        TextView textView;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        this.f81007a = textView;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = "";
        }
        if ("live_video_click".equals(str)) {
            C31208r.m72881a(this.f81192l, "livesdk_topview_click", C22858c.f61207c);
        }
    }
}
