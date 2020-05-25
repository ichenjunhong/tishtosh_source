package com.p683ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p019b.C0260c;
import android.support.p019b.C0272d;
import android.support.p019b.C0304o;
import android.support.p019b.C0308q;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42422am;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.j */
public final class C28202j extends C28189b {

    /* renamed from: d */
    public boolean f74033d;

    /* renamed from: e */
    public boolean f74034e = true;

    /* renamed from: f */
    public boolean f74035f;

    /* renamed from: g */
    public boolean f74036g;

    /* renamed from: h */
    private View f74037h;

    /* renamed from: i */
    private View f74038i;

    /* renamed from: j */
    private View f74039j;

    /* renamed from: k */
    private View f74040k;

    /* renamed from: l */
    private View f74041l;

    /* renamed from: m */
    private View f74042m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56597a(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56598a(ValueAnimator valueAnimator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56601b(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56602b(ValueAnimator valueAnimator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo56603c(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo56604d(Animator animator) {
    }

    /* renamed from: a */
    public final void mo56596a() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f74042m.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C9432q.m18687b(this.f74012a, 0.0f);
        this.f74042m.setLayoutParams(marginLayoutParams);
        m67100b(false);
    }

    /* renamed from: b */
    public final void mo56600b() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f74042m.getLayoutParams();
        if ((!this.f74033d || this.f74034e) && (!this.f74035f || this.f74036g)) {
            marginLayoutParams.leftMargin = (int) C9432q.m18687b(this.f74012a, 16.0f);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        m67100b(true);
    }

    /* renamed from: b */
    private void m67100b(boolean z) {
        int i;
        int i2;
        int i3;
        this.f74014c = z ^ true ? 1 : 0;
        C0308q qVar = new C0308q();
        qVar.mo622a(new C0272d().mo603b(this.f74041l).mo603b(this.f74038i).mo603b(this.f74039j).mo603b(this.f74040k));
        qVar.mo622a(new C0260c().mo600b((int) R.id.cd9));
        qVar.mo588a((TimeInterpolator) new C42422am(0.32f, 0.94f, 0.6f, 1.0f));
        qVar.mo587a(200);
        C0304o.m646a((ViewGroup) this.f74037h, qVar);
        View view = this.f74039j;
        int i4 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!this.f74033d || this.f74034e) {
            View view2 = this.f74040k;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
            if (this.f74034e) {
                View view3 = this.f74041l;
                if (!z) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                view3.setVisibility(i3);
            }
        }
        if (this.f74035f) {
            View view4 = this.f74038i;
            if (!z) {
                i4 = 8;
            }
            view4.setVisibility(i4);
        }
    }

    public C28202j(Context context, View view, View view2, View view3, View view4, View view5, View view6) {
        super(context);
        this.f74037h = view;
        this.f74038i = view2;
        this.f74040k = view3;
        this.f74041l = view4;
        this.f74039j = view5;
        this.f74042m = view6;
    }
}
