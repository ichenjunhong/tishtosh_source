package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.PopupWindow;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43511a.C43512a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.c */
public abstract class C43514c extends PopupWindow implements C43522i, C43523j, C43524k, C43525l, C43526m {

    /* renamed from: a */
    public static int f110069a;

    /* renamed from: b */
    protected Activity f110070b;

    /* renamed from: c */
    protected int f110071c;

    /* renamed from: d */
    protected int f110072d;

    /* renamed from: e */
    private C43526m f110073e = new C43519f(this);

    /* renamed from: f */
    private C43523j f110074f = new C43513b(this);

    /* renamed from: g */
    private C43522i f110075g = new C43511a(this);

    /* renamed from: h */
    private C43525l f110076h = new C43515d(this);

    public void dismiss() {
        super.dismiss();
    }

    /* renamed from: n */
    public final C43526m mo88574n() {
        return this.f110073e;
    }

    /* renamed from: o */
    public final C43522i mo88575o() {
        return this.f110075g;
    }

    /* renamed from: p */
    public final Activity mo88576p() {
        return this.f110070b;
    }

    /* renamed from: q */
    public final C43523j mo88577q() {
        return this.f110074f;
    }

    /* renamed from: a */
    public final void mo88541a() {
        this.f110075g.mo88541a();
    }

    /* renamed from: c */
    public final int mo88549c() {
        return this.f110074f.mo88549c();
    }

    public final int cc_() {
        return this.f110074f.cc_();
    }

    public final int cd_() {
        return this.f110074f.cd_();
    }

    /* renamed from: d */
    public final int mo88553d() {
        return this.f110074f.mo88553d();
    }

    /* renamed from: g */
    public final int mo88559g() {
        return this.f110074f.mo88559g();
    }

    /* renamed from: h */
    public final void mo88568h() {
        this.f110076h.mo88568h();
    }

    /* renamed from: i */
    public final void mo88569i() {
        this.f110076h.mo88569i();
    }

    /* renamed from: m */
    public final void mo88573m() {
        this.f110073e.mo88573m();
    }

    /* renamed from: r */
    public final long mo88578r() {
        return this.f110076h.mo88578r();
    }

    /* renamed from: s */
    public final Runnable mo88579s() {
        return this.f110076h.mo88579s();
    }

    /* renamed from: b */
    public final FixBubbleLayout mo88544b() {
        return this.f110075g.mo88544b();
    }

    /* renamed from: f */
    public final boolean mo88558f() {
        return this.f110074f.mo88558f();
    }

    /* renamed from: j */
    public final int mo88570j() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo88571k() {
        return getContentView().getMeasuredWidth();
    }

    /* renamed from: e */
    public final boolean mo88556e() {
        return this.f110074f.mo88556e();
    }

    /* renamed from: l */
    public final void mo88572l() {
        if (this.f110071c == 0 || this.f110072d == 0) {
            getContentView().measure(MeasureSpec.makeMeasureSpec(C23724k.m58224b(getContentView().getContext()), DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(C23724k.m58221a(getContentView().getContext()), DynamicTabYellowPointVersion.DEFAULT));
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f110071c, 1073741824), MeasureSpec.makeMeasureSpec(this.f110072d, 1073741824));
    }

    /* renamed from: g */
    public static void m95400g(int i) {
        FixBubbleLayout.f110037i = i;
    }

    /* renamed from: b */
    public final int mo88547b(int i) {
        return this.f110074f.mo88547b(i);
    }

    /* renamed from: e */
    public final void mo88555e(int i) {
        this.f110074f.mo88555e(i);
    }

    /* renamed from: f */
    public final void mo88557f(int i) {
        this.f110074f.mo88557f(i);
    }

    /* renamed from: a */
    public final void mo88545a(int i) {
        this.f110074f.mo88545a(i);
    }

    /* renamed from: c */
    public final void mo88550c(int i) {
        this.f110074f.mo88550c(i);
    }

    /* renamed from: d */
    public final void mo88554d(int i) {
        this.f110074f.mo88554d(i);
    }

    /* renamed from: e */
    public final void mo88567e(boolean z) {
        this.f110076h.mo88567e(z);
    }

    /* renamed from: a */
    public final void mo88560a(long j) {
        this.f110076h.mo88560a(j);
    }

    /* renamed from: b */
    public final void mo88563b(long j) {
        this.f110076h.mo88563b(j);
    }

    /* renamed from: c */
    public final void mo88564c(boolean z) {
        this.f110076h.mo88564c(z);
    }

    /* renamed from: d */
    public final void mo88565d(boolean z) {
        this.f110073e.mo88565d(z);
    }

    /* renamed from: a */
    public final void mo88542a(View view) {
        this.f110075g.mo88542a(view);
    }

    /* renamed from: b */
    public final void mo88548b(boolean z) {
        this.f110074f.mo88548b(z);
    }

    /* renamed from: a */
    public final void mo88543a(C43512a aVar) {
        this.f110075g.mo88543a(aVar);
    }

    /* renamed from: a */
    public final void mo88561a(C44523c cVar) {
        this.f110076h.mo88561a(cVar);
    }

    /* renamed from: a */
    public final void mo88546a(boolean z) {
        this.f110074f.mo88546a(z);
    }

    public C43514c(Activity activity, boolean z) {
        super(activity);
        this.f110070b = activity;
        f110069a = (int) C43518e.m95450a(this.f110070b, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (z) {
            mo88541a();
        }
    }

    /* renamed from: a */
    public final void mo88562a(boolean z, int i) {
        this.f110076h.mo88562a(z, i);
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}
