package com.p683ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.h */
public class C48191h extends Dialog {

    /* renamed from: a */
    LinearLayout f121253a;

    /* renamed from: b */
    ProgressBar f121254b;

    /* renamed from: c */
    DmtTextView f121255c;

    /* renamed from: d */
    private String f121256d;

    public void dismiss() {
        super.dismiss();
        ObjectAnimator.ofFloat(this.f121253a, "alpha", new float[]{this.f121253a.getAlpha(), 0.0f}).setDuration(300).addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
            }
        });
    }

    public void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f121253a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    public C48191h(Context context) {
        super(context, R.style.gy);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jk);
        this.f121253a = (LinearLayout) findViewById(R.id.bjw);
        this.f121254b = (ProgressBar) findViewById(R.id.c66);
        this.f121255c = (DmtTextView) findViewById(R.id.bhs);
        this.f121254b.getIndeterminateDrawable().setColorFilter(C0726c.m2098c(getContext(), R.color.w2), Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        if (!TextUtils.isEmpty(this.f121256d)) {
            C9432q.m18682a((TextView) this.f121255c, (CharSequence) this.f121256d);
        }
    }

    public C48191h(Context context, String str) {
        this(context);
        this.f121256d = str;
    }
}
