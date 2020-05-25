package com.p683ss.android.ugc.aweme.infoSticker;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.p019b.C0260c;
import android.support.p019b.C0304o;
import android.support.p019b.C0308q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.aa */
public final class C35554aa {

    /* renamed from: a */
    private View f91383a;

    /* renamed from: b */
    private TextView f91384b;

    /* renamed from: c */
    private int f91385c;

    /* renamed from: d */
    private int f91386d;

    /* renamed from: e */
    private boolean f91387e = true;

    /* renamed from: f */
    private FrameLayout f91388f;

    /* renamed from: g */
    private final int f91389g;

    /* renamed from: a */
    public final void mo73956a(boolean z) {
        int i;
        LayoutParams layoutParams = (LayoutParams) this.f91388f.getLayoutParams();
        if (this.f91387e) {
            this.f91385c = this.f91388f.getMeasuredWidth();
            this.f91384b.measure(0, 0);
            this.f91386d = this.f91384b.getMeasuredWidth();
            this.f91387e = false;
        }
        if (z) {
            i = this.f91385c - (this.f91386d + this.f91389g);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        C0308q qVar = new C0308q();
        qVar.mo622a(new C0260c().mo603b((View) this.f91388f).mo603b((View) this.f91384b));
        qVar.mo588a((TimeInterpolator) new AccelerateInterpolator());
        qVar.mo587a(300);
        C0304o.m646a((ViewGroup) this.f91383a, qVar);
        this.f91388f.setLayoutParams(layoutParams);
    }

    public C35554aa(Context context, View view, TextView textView) {
        this.f91383a = view;
        this.f91384b = textView;
        this.f91388f = (FrameLayout) this.f91383a.findViewById(R.id.cdx);
        this.f91389g = (int) C9432q.m18687b(context, 16.0f);
    }
}
