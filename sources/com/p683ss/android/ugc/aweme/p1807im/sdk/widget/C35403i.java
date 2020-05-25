package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.i */
public final class C35403i extends Dialog {

    /* renamed from: a */
    public final TextView f90993a;

    /* renamed from: b */
    private final View f90994b;

    public final void dismiss() {
        C35404j.m80039a(this);
        View view = this.f90994b;
        C52711k.m112236a((Object) view, "mMainLayout");
        ObjectAnimator.ofFloat(this.f90994b, "alpha", new float[]{view.getAlpha(), 0.0f}).setDuration(300).start();
    }

    public final void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f90994b, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f90994b);
        setCanceledOnTouchOutside(false);
    }

    public C35403i(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a5r);
        this.f90994b = LayoutInflater.from(context).inflate(R.layout.bcj, null);
        View findViewById = this.f90994b.findViewById(R.id.bhv);
        C52711k.m112236a((Object) findViewById, "mMainLayout.findViewById(R.id.loading_tv)");
        this.f90993a = (TextView) findViewById;
    }
}
