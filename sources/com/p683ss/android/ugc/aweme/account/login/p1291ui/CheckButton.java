package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CheckButton */
public class CheckButton extends DmtButton {

    /* renamed from: b */
    public boolean f58370b;

    /* renamed from: c */
    public final void mo45737c() {
        this.f58370b = false;
    }

    /* renamed from: a */
    public final void mo45735a() {
        setBackgroundResource(R.drawable.cg4);
        mo45736b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo45737c();
        animate().cancel();
    }

    /* renamed from: b */
    public final void mo45736b() {
        this.f58370b = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                if (CheckButton.this.f58370b) {
                    CheckButton.this.mo45736b();
                    return;
                }
                CheckButton.this.animate().cancel();
                CheckButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                CheckButton.this.setBackgroundResource(R.drawable.cdt);
            }
        }).start();
    }

    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.cdt);
        setOnTouchListener(new C48222b(1.2f, 100, null));
    }
}
