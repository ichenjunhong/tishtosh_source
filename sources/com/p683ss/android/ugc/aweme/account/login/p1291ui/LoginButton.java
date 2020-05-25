package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginButton */
public class LoginButton extends AutoRTLButton implements C21109n {

    /* renamed from: b */
    int f58382b;

    /* renamed from: c */
    boolean f58383c;

    /* renamed from: d */
    private int f58384d;

    /* renamed from: a */
    public final void mo45160a() {
        setEnabled(true);
        this.f58383c = false;
    }

    /* renamed from: c */
    public final void mo45161c() {
        setBackgroundResource(this.f58384d);
        mo45745b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo45160a();
        animate().cancel();
    }

    /* renamed from: b */
    public final void mo45745b() {
        this.f58383c = true;
        setEnabled(false);
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new C21614q(this)).start();
    }

    public void setLoadingBackground(int i) {
        this.f58384d = i;
    }

    public LoginButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        this.f58382b = i;
        setBackgroundResource(this.f58382b);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58382b = R.drawable.cdu;
        this.f58384d = R.drawable.cg4;
        setBackgroundResource(this.f58382b);
        if (C22298e.m55182a()) {
            setOnTouchListener(new C48221a(0.5f, 150, null));
        } else {
            setOnTouchListener(new C48222b(1.2f, 100, null));
        }
    }
}
